package functions;

public class function {
    //user defined function. <return_type> function_name(<argument_list>)
    public static int add(int a, int b){
        int sum;
        sum = a + b;
        return sum;
    }

    public static int factorial(int num){
        if(num <= 1)
            return num;

        return num*factorial(num-1);
    }

    public static void main(String[] args) {
        int num = 5, res;

        res = (int) Math.pow(num,3);
        System.out.println(num + "^3 : " + res);

        res = add(12,34);
        System.out.println("Result: " + res);

        System.out.println("The value of 5! = " + factorial(6));
    }
}
