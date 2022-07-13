import java.util.Scanner;

public class Xulychuoi {
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Nhập vào chuỗi: ");
		s = sc.nextLine();
		
		System.out.println("Phương thức kiểm tra lớp String");
		System.out.println("------");
		
		// Hàm length() -> lấy độ dài chuỗi
		System.out.println(s.length());
		int doDai = s.length();
		
		System.out.println("------");
		
		// Hàm charAt() -> lấy ra 1 ký tự tại vị trí i
		for(int i = 0; i < s.length(); i++) {
			System.out.println("Vị trí "+i+" là: "+s.charAt(i));
		}
		System.out.println("Phương thức kiểm tra lớp String");
		System.out.println("------");
		
		// Hàm getChars(vị trí bắt đầu, vị trí kết thúc, mảng lưu dữ liệu, vị trí bắt đầu lưu)
		char[] arrChar = new char[10];
		s.getChars(2, 5, arrChar, 0);
		for(int i = 0; i < arrChar.length; i++) {
			System.out.println("Giá trị của mảng tại "+i+" là: "+arrChar[i]);
		}
		
		System.out.println("------");
		
		//Hàm getBytes => có 3 cách, lấy ra giá trị của các ký tự
		byte[] arrBytes = s.getBytes();
		for(byte b: arrBytes) {
			System.out.println(b);
		}*/
		
		/*System.out.println("Phương thức so sánh lớp String");
		System.out.println("------");
		
		String s1 = "titv.vn";
		String s2 = "TITV.vn";
		String s3 = "titv.vn";
		
		// Hàm equals -> Hàm so sánh 2 chuỗi giống nhau, có phân biệt chữ hoa, chữ thường
		System.out.println("s1 equals s2: "+s1.equals(s2));
		System.out.println("s1 equals s3: "+s1.equals(s3));
		
		System.out.println("------");
		
		// Hàm equalsIgnoreCase -> Hàm so sánh 2 chuỗi giống nhau, không phân biệt chữ hoa, chữ thường
		System.out.println("s1 equals s2: "+s1.equalsIgnoreCase(s2));
		System.out.println("s1 equals s3: "+s1.equalsIgnoreCase(s3));
		
		System.out.println("------");
		
		// Hàm compareTo -> So sánh >, <, =
		String sv1 = "Nguyễn Văn A";
		String sv2 = "Nguyễn Văn B";
		String sv3 = "Nguyễn Văn";
		String sv4 = "Nguyễn Văn a";
		
		System.out.println("sv1 compare to sv2: " + sv1.compareTo(sv2));
		System.out.println("sv1 compare to sv3: " + sv1.compareTo(sv3));
		System.out.println("sv1 compare to sv4: " + sv1.compareTo(sv4));
		
		System.out.println("------");
		
		// Hàm compareToIgnoreCase
		System.out.println("sv1 compare to sv2: " + sv1.compareToIgnoreCase(sv2));
		System.out.println("sv1 compare to sv3: " + sv1.compareToIgnoreCase(sv3));
		System.out.println("sv1 compare to sv4: " + sv1.compareToIgnoreCase(sv4));
		
		System.out.println("------");

		// Hàm regionMatches() -> so sánh một đoạn
		String r1 = "TITV.vn";
		String r2 = "TV.v";
		boolean check = r1.regionMatches(2, r2, 0, 4);
		System.out.println(check);
		
		System.out.println("------");
		
		// Hàm startsWith -> Hàm kiểm tra chuỗi bắt đầu bằng...
		String sdt = "037456789";
		System.out.println(sdt.startsWith("037"));
		System.out.println(sdt.startsWith("034"));
		
		System.out.println("------");
		
		// Hàm endsWith -> Hàm kiểm tra chuỗi kết thúc bằng
		String tenFile = "Hoc Java.JPG";
		String tenFile1 = "HocJava.PDF";
		
		if(tenFile.endsWith(".JPG")) {
			System.out.println("File này là hình ảnh");
		} else if(tenFile.endsWith(".PDF")) {
			System.out.println("File này là tài liệu");
		}
		
		if(tenFile1.endsWith(".JPG")) {
			System.out.println("File này là hình ảnh");
		} else if(tenFile1.endsWith(".PDF")) {
			System.out.println("File này là tài liệu");
		}*/
		
		/*System.out.println("Phương thức lập chỉ mục");
		System.out.println("-----");
		
		String q1 = "Xin chào cô chú, xin chào các bạn, Xin chào!";
		String q2 = "Xin chào";
		String q3 = "Xin chào 123";
		char q4 = 'ô';
		
		// Hàm indexOf() -> tìm kiếm từ phải sang trái
		System.out.println("Vị trí của q2 trong q1 là: " + q1.indexOf(q2));
		System.out.println("Vị trí của q3 trong q1 là: " + q1.indexOf(q3));
		
			// Sử dụng vị trí bắt đầu
			System.out.println("Vị trí q2 trong q1 là: " + q1.indexOf(q2,2));
			
			// Tìm kiếm char
			System.out.println("Vị trí của q4 trong q1 là: " + q1.indexOf(q4));
			System.out.println("Vị trí của q4 trong q1 là: " + q1.indexOf(q4, 20));
		
		System.out.println("-----");
		
		// Hàm lastIndexOf() -> tìm kiếm từ trái sang phải
		System.out.println("Vị trí của q2 trong q1 là: " + q1.lastIndexOf(q2));
		System.out.println("Vị trí của q3 trong q1 là: " + q1.lastIndexOf(q3));*/
		
		System.out.println("Phương thức chuyển đổi lớp String");
		System.out.println("-----");
		
		String a1 = "tItv";
		String a2 = ".Vn";
		
		String a3 = a1 + a2;
		
		// Hàm substring() -> cắt chuỗi con
		String a7 = "Xin chào các bạn, mình là TITV";
		String a8 = a7.substring(10);
		String a9 = a7.substring(10,15);
		System.out.println("a8 = "+a8);
		System.out.println("a9 = "+a9);
		
		// Hàm concat() -> nối chuỗi
		String a4 = a1.concat(a2);
		System.out.println("a3 = " + a3);
		System.out.println("a4 = " + a4);
		
		System.out.println("-----");
		
		// Hàm replace()
		String a5 = "Tung.vn";
		String a6 = a5.replaceAll("Tung", "TITV");
		System.out.println(a5);
		System.out.println(a6);
		
		System.out.println("-----");
		
		// Hàm toLowerCase()
		String a10 = a1.toLowerCase();
		System.out.println(a10);
		
		System.out.println("-----");
	
		// Hàm toUpperCase()
		String a11 = a2.toUpperCase();
		System.out.println(a11);
		
		System.out.println("-----");
		
		// Hàm trim() -> xoá khoảng trắng dư thừa
		String a12 = " Xin chào";
		System.out.println(a12.trim());
		
		System.out.println("-----");
		
		// Hàm toCharArray()
		
		
		// Hàm intern()
	}
}
















