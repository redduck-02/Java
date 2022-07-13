import java.util.*;

public class B2_5 {
	// Nhap mang n hang m cot
	public static void Nhap(int[][] arr, int n, int m) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("\nNhap phan tu thu [" + i + ", " + j + "]= ");
				arr[i][j] = sc.nextInt();
			}
		}
	}

	// Xuat mang n hang m cot
	public static void Xuat(int[][] arr, int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}

	// Tim phan tu lon thu 2 tren 2 duong cheo
	public static void phanTuLonThu2(int[][] arr, int n, int m) {
		if (n == m) {
			int max_chinh = arr[0][0];
			int max_phu = arr[0][0];
			int min = 0;
			int min_chinh = 0, min_phu = 0;
			for (int i = 0; i < n; i++) {
				if (max_chinh < arr[i][i]) {
					min_chinh = max_chinh;
					max_chinh = arr[i][i];
				}
			}
			for (int i = 0; i < n; i++) {
				if (max_phu < arr[i][n - 1 - i]) {
					min_phu = max_phu;
					max_phu = arr[i][n - 1 - i];
				}
			}
			if (max_chinh > max_phu) {
				if (min_chinh <= max_phu)
					min = max_phu;
				else
					min = min_chinh;
			} else if (max_chinh < max_phu) {
				if (min_phu <= max_chinh)
					min = max_chinh;
				else
					min = min_phu;
			} else {
				if (min_phu <= min_chinh)
					min = min_chinh;
				else
					min = min_phu;
			}
			System.out.println("Phan tu lon thu 2 trong 2 duong cheo la: " + min);
		} else
			System.out.println("");
	}

	// Tính tong cac phan tu tren 2 duong cheo
	public static int Sum(int[][] arr, int n, int m) {
		int sum = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || i + j == m - 1)
					sum += arr[i][j];
			}
		}
		return sum;
	}
	
	// Thay the phan tu bien bi thieu bang gia tri bien lon nhat
	public static int max_bien(int[][] arr, int n, int m) {
		int max = 0;
		int max_hang = 0, max_cot = 0;
		int max_hang0 = 0, max_hangn = 0, max_cot0 = 0, max_cotm = 0;
		for (int i = 0; i < m; i++) {
			if (i == 0) {
				if (max < arr[0][i])
					max_hang0 = arr[0][i];
			}
			if (i == n - 1) {
				if (max < arr[n - 1][i])
					max_hangn = arr[n - 1][i];
			}
		}
		if (max_hang0 <= max_hangn)
			max_hang = max_hangn;
		else
			max_hang = max_hang0;
		for (int i = 0; i < n - 1; i++) {
			if (i == 0) {
				if (max < arr[i][0])
					max_cot0 = arr[i][0];
			}
			if (i == n - 1) {
				if (max < arr[i][m - 1])
					max_cotm = arr[i][m - 1];
			}
		}
		if (max_cot0 <= max_cotm)
			max_cot = max_cotm;
		else
			max_cot = max_cot0;

		if (max_cot <= max_hang)
			max = max_hang;
		else
			max = max_cot;
		return max;
	}

	public static void replace(int[][] arr, int n, int m) {
		for (int i = 0; i < m; i++) {
			if (arr[0][i] == -1)
				arr[0][i] = max_bien(arr, n, m);
			if (arr[n - 1][i] == -1)
				arr[n - 1][i] = max_bien(arr, n, m);
		}
		for (int i = 0; i < n - 1; i++) {
			if (arr[i][0] == -1)
				arr[i][0] = max_bien(arr, n, m);
			if (arr[i][m - 1] == -1)
				arr[i][m - 1] = max_bien(arr, n, m);
		}
		Xuat(arr, n, m);
	}

	public static void main(String[] args){
        int n,m;
        Scanner input = new Scanner(System.in);
        boolean check = false;
        n=0;m=0;
        while(!check){
            System.out.print(" ");
            try{
                System.out.print("Nhap n: ");
                n =input.nextInt();
                System.out.print("Nhap m: ");
                m = input.nextInt();
                check =true;
            } catch(Exception e){
                System.out.println("ban phai nhap so! hay nhap lai...");
                input.nextLine();
            }
        }
 
        int [][] arr;
        arr = new int[n][m];
 
        System.out.println("\nNhap mang!");
        Nhap(arr,n, m);
        phanTuLonThu2(arr, n, m);
        System.out.println("Tong cac phan tu tren 2 duong cheo = "+ Sum(arr, n, m));
        System.out.println("Thay the phan tu bien bi thieu ( phan tu co gia tri = -1 ) bang gia tri bien lon nhat!");
        replace(arr, n, m);
    }
}