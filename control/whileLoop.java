package control;

public class whileLoop {
    public static void main(String[] args) {
        int sum = 0;
        int a = 0;

        while(a<10){
            System.out.println("The value of a: "+a);
            sum = sum +a;
            a++;
        }
        System.out.println("The sum of numbers from 0 to 9: " + sum);
    }
}
