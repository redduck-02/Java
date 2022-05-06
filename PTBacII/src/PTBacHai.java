import java.util.Scanner;

public class PTBacHai {
	public static void main(String[] args) {
		// PT bac hai: ax^2 + bx + c
		/**
		 * Neu a = 0 => PT sai
		 * delta = b^2 - 4ac
		 * Neu delta < 0 => PT vo nghiem
		 * Neu delta == 0 => PT co nghiem kep x1 = x2 = -b/2a
		 * Neu delta > 0 => PT co 2 nghiem
		 * 		x1 = -b+(sqrt(delta)/2a)
		 * 		x2 = -b-(sqrt(delta)/2a)
		 */
		double a, b, c, delta, x1, x2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so a: ");
		a = sc.nextDouble();
		System.out.println("Nhap vao so b: ");
		b = sc.nextDouble();
		System.out.println("Nhap vao so c: ");
		c = sc.nextDouble();

		// Tinh delta
		delta = Math.pow(b, 2) - 4 * a * c;

		if (a == 0) {
			System.out.println("Nhap du lieu sai");
		}
		if (delta < 0) {
			System.out.println("Phuong trinh vo nghiem");
		} else if (delta == 0) {
			System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + (-b / 2 * a));
		} else {
			x1 = -b + (Math.sqrt(delta) / 2 * a);
			x2 = -b - (Math.sqrt(delta) / 2 * a);
			System.out.println("Phuong trinh co 2 nghiem phan biet");
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
	}
}
