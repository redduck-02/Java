import java.util.Scanner;

public class PTBacNhat {
	public static void main(String[] args) {
		/**
		 * PTBN: ax+b
		 * Neu a = 0
		 * 		Neu b = 0 => PT vo so nghiem
		 * 		Neu b != 0 => PT vo nghiem
		 * Neu a != 0
		 * 		Co 1 nghiem x = -b/a
		 */
		double a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so a: ");
		a = sc.nextDouble();
		System.out.println("Nhap vao so b: ");
		b = sc.nextDouble();
		
		//Tu lam
		if(a == 0) {
			if(b == 0) {
				System.out.println("Phuong trinh co vo so nghiem");
			} else {
				System.out.println("Phuong trinh vo nghiem");
			}
		} else {
			System.out.println("Phuong trinh co nghiem x = " + (-b/a));
		}
	}
}
