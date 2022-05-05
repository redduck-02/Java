import java.util.Scanner;

/*
 * Tinh chu vi va dien tich hinh tron
 */
public class TinhSvaC {
	public static void main(String[] args) {
		double r, S, C;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ban kinh hinh tron: ");
		r = sc.nextDouble();
		
		//Tinh chu vi
		C = 2*Math.PI*r;
		System.out.println("Chu vi hinh tron: " + Math.round(C));
		
		//Tinh dien tich
		S = Math.PI*Math.pow(r,2);
		System.out.println("Dien tich hinh tron: " + Math.round(C));
	}
}
