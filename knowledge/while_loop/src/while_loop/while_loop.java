package while_loop;

import java.util.Scanner;

public class while_loop {
	public static void main(String[] args) {
		int x = 1;
		Scanner sc = new Scanner(System.in);
		while (x != 0) {
			System.out.println("Nhap x = 0 de thoat; Nhap ky tu khac de tiep tuc: ");
			x = sc.nextInt();
		}
		int i = 0;
		// Vong lap vo tan mien dieu kien dung
		while(true)
		{
			System.out.println(i);
			i++;
			if (i==10)
				break;
		}
	}
}
