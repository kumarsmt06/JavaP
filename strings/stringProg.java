package strings;

import java.util.Scanner;

public class stringProg {
    public static void main(String[] args) {
        char[] charString = {'S','t','r','i','n','g'}; // an array of characters
        Scanner scanner = new Scanner(System.in);

        String str = new String(charString); //make string from the character array

        System.out.println("The value of str is: " + str);

        System.out.print("Enter string: ");
        str = scanner.next(); //get the strig from the user
        System.out.println("The value of str is: " + str);

        str = "JAVA Strings";//direct assign string to the string type object str
        System.out.println("The value of str is: " + str);

        str = "String" + " " + "concatenate";//concatenate three strings into single string
        System.out.println("The value of str is: "+ str);

        scanner.close();
    }
    
}
