package dowhile;

import java.util.Scanner;

public class Dowhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("Nhap vao n>0: ");
			n = sc.nextInt();
		} while(n<=0);
	}
}
