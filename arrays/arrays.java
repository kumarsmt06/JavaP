package arrays;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5,6}; //five values are stored directly in the array

        float[] floatArr = new float[6]; //float type array created whose size is 6;

        char[] charArr = new char[6]; //an array of characters to store five elements

        Scanner sc = new Scanner(System.in);

        floatArr[0] = 1.2F;
        floatArr[1] = 4.24F;
        floatArr[2] = 4F;
        floatArr[3] = 6.042F;
        floatArr[4] = 11.1232F;
        floatArr[5] = 12.2450F;

        System.out.println("Enter Float array: ");
        for(int i = 0; i < 6; i++){
            System.out.println(floatArr[i] + " ");

        }

        for(int i = 0; i < 6; i++){
            System.out.println("Enter character for index (" + i + "): ");
            charArr[i] = sc.next().charAt(0); // take input and store to characteer array

        }

        System.out.println("Enter Integer array: ");
        for(int i = 0; i < 6; i++){
            System.out.println(intArr[i] + " ");

        }

        System.out.println();

        System.out.println("Items of Character array: ");
        for(char ch: charArr){
            System.out.println(ch + " ");

        }

        sc.close();
    }
}
