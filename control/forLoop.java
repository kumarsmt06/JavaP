package control;

public class forLoop {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("The value of i : "+i);
            sum = sum + i;
        }

        System.out.println("The sum of numbers from 0 to 9: " + sum);
    }
}
