package array;

import java.util.Iterator;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		// Cach khai bao mang
		double[] arr1;
		double arr2[];
		
		arr1 = new double[10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("Nhap phan tu thu "+i+": ");
			arr1[i] = sc.nextDouble();
		}
		double S = 0;
		for (int i = 0; i < arr1.length; i++) {
			S += arr1[i];
		}
		System.out.println("Tong = "+S);
		
		arr2 = new double[]{1,2,3,4,5};
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]+"\t");
		}
	}
}
