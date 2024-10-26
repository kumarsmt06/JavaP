package packageDemo;

import mathPackage.MyMath;

public class packageDemo {
    public static void main(String[] args) {
        MyMath math = new MyMath();

        System.out.println("Result of (120.45 - 45.573): " + math.subtract(120.45,45.573));
        System.out.println("Result of (15 * 6.2): " + math.multiply(15 , 6.2));
        System.out.println("Result of (2024 / 12): " + math.divide(2024D,12D));
        System.out.println("Result of (8!): " + math.factorial(8));
    }
}
