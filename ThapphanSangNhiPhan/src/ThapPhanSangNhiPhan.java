import java.util.Scanner;

public class ThapPhanSangNhiPhan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhap vao mot so thap phan: ");
		n = sc.nextInt();
		
		String nhiPhan = "";
		while(n>0) {
			nhiPhan = (n%2) + nhiPhan;
			n /= 2;
		}
		System.out.println("He nhi phan la: " + nhiPhan);
	}
}
