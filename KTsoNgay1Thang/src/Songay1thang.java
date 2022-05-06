import java.util.Scanner;

public class Songay1thang {
	public static void main(String[] args) {
		int nMonth, nYear;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input month: ");
		nMonth = sc.nextInt();
		System.out.println("Input year: ");
		nYear = sc.nextInt();
		//21,3,5,7,8,10,12: 31 ngay
		// 4,6,8,9,11: 30 ngay
		// 2: nam nhuan 29, ko nhuan 20
		//	nam nhuan chia het cho 4 hoac 400
		
		switch (nMonth) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("31 days");
			break;
		case 4, 6, 9, 11:
			System.out.println("30 days");
			break;
		case 2:
			if ((nYear % 4 == 0 && nYear % 100 =! 0) || (nYear % 400 == 0)) {
				System.out.println("29 days");
			} else {
				System.out.println("28 days");
			}
			break;
		default:
			System.out.println("Error! Please try again");
			break;
		}
	}
}
