package operator;
public class unaryOperator {
    public static void main(String[] args) {
        int var1, var2;
        var1 = 50;

        var2 = -var1;// - unary operator to invert the sign of the value of var1
        System.out.println("The var1 = " + var1 + " and var2 = " + var2);
        
        var1=50;
        var2 = var1++;// post-incrementing, store previous value, then increase var1 by 1
        System.out.println("The var1 = " + var1 + " and var2 = " + var2);

    }
}
