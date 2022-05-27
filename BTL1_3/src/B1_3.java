import java.util.Scanner;

public class B1_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int sum = 0;
		int[] A = new int[100];
		
		System.out.println("Nhap so phan tu cho mang: ");
		n = sc.nextInt();
		
		//Tinh tong cac phan tu o vi tri chan
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap phan tu thu a["+i+"]: ");
			A[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				sum += A[i];
			}
		}
		System.out.println("Tong cac phan tu o vi tri chan trong mang la: " + sum);
		// Xac dinh vi tri xuat hien lan thu 2 cua 1 so cho truoc trong mang
		
		// Lay ra cac phan tu la boi so cua 2 trong mang
		System.out.println("Cac phan tu la boi so cua 2 trong mang la: ");
		for(int i = 0; i < n; i++) {
			if(A[i] % 2 == 0) {
				System.out.println(A[i]+"\t");
			}
		}
	}
}
