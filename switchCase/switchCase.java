package switchCase;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0); // take the first character from given string

        switch (character) {
            case 'A':
            case 'a':
                System.out.println("You have typed letter A.");
                break;
            case 'B':
            case 'b':
                System.out.println("You have typed letter B.");
                break;
            case 'C':
            case 'c':
                System.out.println("You have typed letter C.");
                break;
            case 'D':
            case 'd':
                System.out.println("You have typed letter D.");
                break;
            default:
                System.out.println("You have typed letter other than (A, B, C, D).");
                break;
        }

        scanner.close();
        System.out.println("End of the program...");
    }
}

