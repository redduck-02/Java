package test;

import java.util.Arrays;
public class Bai2 {

    static void output2DArry(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    static int sumOfNumericCharacter(char[][] arr) {
        int sum = 0;
        int n = arr.length;
            for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == 0 ||  j == 0) {
                    if (arr[i][j] >= 48 && arr[i][j] <= 57) {
                        sum++;
                    }
                }
            }
        }
        return sum;
    }

    static void convertToUppercase(char[][] arr){
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == 0 || j == 0) {
                    if (arr[i][j] >= 97 && arr[i][j] <= 122) {
                        arr[i][j] -= 32;
                    }
                }
            }
        }
        System.out.println("Mang da chuyen doi:");
        output2DArry(arr);
    }

    static void findNumericCharacter(char[] arr) {
        int max = 0;
        int point = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    if (count > max) {
                        max = count;
                        point = i;
                    }
                }
            }
        }
        System.out.println("ky tu so " + arr[point] + " xuat hien nhieu nhat trong mang voi so lan: " + max);
    }

    static int getTheNumericCharacter(char[][] arr, char[] arr2) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] >= '0' && arr[i][j] <= '9') {
                    arr2[k] = arr[i][j];
                    k++;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
         char[][] arr = { { 'l', '2', 's', 'U' }, { '7', '4', 'Q', 'O' }, { 'i', 'Q', 'L', '7' },
                { 'k', 'L', '9', 'L' } };
        char[] arr2 = new char[6];

        int sum = sumOfNumericCharacter(arr);
        System.out.println("Co " + sum + " phan tu nam o 2 bien la ky tu so");

        convertToUppercase(arr);

        getTheNumericCharacter(arr, arr2);
        System.out.println(Arrays.toString(arr2));

        findNumericCharacter(arr2);

    }
    
    
}
