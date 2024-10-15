package operator;

import java.util.Scanner;

public class arithOperator {
    public static void main(String[] args) {
        int a, b, result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a and b: ");

        a = scanner.nextInt();
        b = scanner.nextInt();

        result = a + b;
        System.out.println("Result after Addition: " + result);

        result = a - b;
        System.out.println("Result after Substraction: " + result);

        result = a * b;
        System.out.println("Result after Multiplication: " + result);

        result = a / b;
        System.out.println("Result after division: " + result);

        result = a % b;
        System.out.println("Remainder: " + result);

    }
}
