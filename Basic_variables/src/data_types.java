import java.util.Scanner;

public class data_types {
    public static void main(String[] args){
    	//Definity variables
        String tenSach = "Lap trinh Java";
        int namXB = 2021;
        double giaSP = 3.14;
        boolean trangThai = true;
        char maKho = 'a';

        System.out.println("Ten sach: " + tenSach);
        System.out.println("Nam xuat ban: " + namXB);
        System.out.println("Gia sach: " + giaSP);
        System.out.println("Trang thai: " + trangThai);
        System.out.println("Ma kho: " + maKho);
        
        //Constants
        final int x = 10;
        System.out.println("x = " + x);
        
        //Comments
        /*
         * comments 1
         * comments 2
         */
        /**
         * Comments for Javadoc
         */
        
        //Input from keyboard
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter full name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter student code: ");
        long stCode = sc.nextLong();
        
        System.out.println("Enter exam's point: ");
        float examPoint = sc.nextFloat();
    
        System.out.println("-----------");
        System.out.println("Full name: " + name);
        System.out.println("Student code: " + stCode);
        System.out.println("Exam's point: " + examPoint);
        System.out.println("-----------");
    }
}
