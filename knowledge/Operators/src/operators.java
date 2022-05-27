import java.util.Scanner;

public class operators {
	public static void main(String[] args) {

//		int a;
//		int b;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a = ");
//		a = sc.nextInt();
//		System.out.println("Enter b: ");
//		b = sc.nextInt();

		// Comparison
//		System.out.println(a + " == " + b + " : " + (a == b));
//		System.out.println(a + " != " + b + " : " + (a != b));
//		System.out.println(a + " < " + b + " : " + (a < b));
//		System.out.println(a + " <= " + b + " : " + (a <= b));
//		System.out.println(a + " > " + b + " : " + (a > b));
//		System.out.println(a + " >= " + b + " : " + (a >= b));
//		System.out.println("Ca hai la so chan: " + (a % 2 == 0 && b % 2 == 0));
//		System.out.println("Co it nhat mot so chan: " + (a % 2 == 0 || b % 2 == 0));

		// Basic operator
//		int total = a + b;
//		System.out.println(a + " + " + b + " = " + total);
//
//		int minus = a - b;
//		System.out.println(a + " - " + b + " = " + minus);
//
//		float divide = (float) a / b;
//		System.out.println(a + " / " + b + " = " + divide);
//
//		int multy = a * b;
//		System.out.println(a + " * " + b + " = " + multy);
//
//		int mod = a % b;
//		System.out.println(a + " % " + b + " = " + mod);

		// Unary operators - toan tu 1 ngoi
//		int c = 5;
//		boolean d = false;
//		System.out.println("-------");
//		System.out.println(" -c => Gia tri: " + (-c));
//		System.out.println(" +c => Gia tri: " + (+c));
//		System.out.println("!d => Gia tri: " + (!d));
//		System.out.println("-------");
//		System.out.println("c = " + c);
//		System.out.println("c++ = " + (c++));
//		System.out.println("c = " + c);
//		System.out.println("++c = " + (++c));
//		System.out.println("c = " + c);
//		System.out.println("c-- = " + (c--));
//		System.out.println("c = " + c);
//		System.out.println("--c = " + (--c));
//		System.out.println("c = " + c);

		// boolean-expression
//		String result = (a%2==0)?"so chan":"so le";
//		System.out.println(a + " la " + result);
		
		//Math class
		double e, f;
		Scanner sn = new Scanner(System.in);
		System.out.println("Nhap vao so e: ");
		e = sn.nextDouble();
		System.out.println("Nhap vao so f: ");
		f = sn.nextDouble();
		
		//Ham tri tuyet doi sqrt
		System.out.println("|e| = " + Math.abs(e));
		
		//Ham tim min
		System.out.println("min(e,f) = " + Math.min(e, f));
		
		//Ham tim max
		System.out.println("max(e,f) = " + Math.max(e, f));
		
		//Ham tim ceil
		System.out.println("ceil(e,f) = " + Math.ceil(e));
		
		//Ham tim floor
		System.out.println("floor(e,f) = " + Math.floor(e));
		
		//Ham can bac hai
		System.out.println("sqrt(e) = " + Math.sqrt(e));
		
		//Ham e^f
		System.out.println("e^f = " + Math.pow(e,f));
	}
}
