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
        
        var1=50;
        var2 = ++var1;// pre-incrementing,  increase var1 by 1, then assign to var2
        System.out.println("The var1 = " + var1 + " and var2 = " + var2);
        
        var1=50;
        var2 = var1--;// post-decrementing, store previous value, then decrease var1 by 1
        System.out.println("The var1 = " + var1 + " and var2 = " + var2);
        
        var1=50;
        var2 = --var1;// post-decrementing, decrease var1 by 1, then assign to var2
        System.out.println("The var1 = " + var1 + " and var2 = " + var2);

        boolean bool1 , res;
        bool1 = true ;// assign as true

        res = !bool1;// not operator will invert the value of the boolean variables
        System.out.println("The bool1 is: " + bool1);
        System.out.println("The result is: " + res);

    }
}
