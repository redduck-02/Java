import java.util.Scanner;

public class B2_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Mang 2 chieu A mxn (m: so dong, n: so cot)
		int m, n;
		System.out.println("Nhap so dong cho mang: ");
		m = sc.nextInt();
		System.out.println("Nhap vao so cot cho mang");
		n = sc.nextInt();
		int A[][] = new int[m][n];
		
		System.out.println("Nhap gia tri cho ma tran");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.println("A["+i+", "+j+"] = ");
				A[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Ma tran vua nhap la");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.println(A[i][j] + "    ");
			}
			System.out.println("\n");
		}
		
		// Tim phan tu lon thu 2 tren 2 duong cheo
		
		// Thay the phan tu bien bi thieu bang gia tri bien lon nhat
			// Tim gia tri lon nhat trong ma tran
		int max = A[0][0];
		for(int i = 0; i < n; i++) {
			for(int j = 0; i < m; i++) {
				if(max < A[i][j]) {
					max = A[i][j];
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; i < m; i++) {
				if(i == j && A[i][j] < 0)
					A[i][j] = max;
			}
		}
		
		System.out.println("Gia tri mang sau khi thay the phan tu bien bi thieu bang gia tri bien lon nhat");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.println(A[i][j] + "    ");
			}
			System.out.println("\n");
		}
		
		// Tinh tong 2 duong cheo: duong cheo chinh + duong cheo phu
		int sum = 0;
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				/*if(i==j)
					sumCheochinh += A[i][j];
				if(i+j==m-1)
					sumCheophu += A[i][j];*/
				if(i==j || i+j==m-1)
					sum += A[i][j];
			}
		}
		System.out.println("Tong cac phan tu tren 2 duong cheo la: " + sum);	
	}
}
