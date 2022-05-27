public class typecasting {
	public static void main(String[] args) {
		int a = 100;
		int b = 2;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		//implicit type casting
		float c = a;
		float d = b;
		/* also known as
		 	float c = (float)a;
		 	float d = (float)b;
		 */
		
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		//explicit type casting
		float e = 3.5f;
		float f = 9.5f;
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		
		int g = (int)e;
		int h = (int)f;
		System.out.println("g = " + g);
		System.out.println("h = " + h);
		
		//cast object data type
		//ep kieu du lieu doi tuong
		
		//type casting beetween origin and objects
		int x = new Integer(32);
		System.out.println("x = " + x);
		
	}
}
