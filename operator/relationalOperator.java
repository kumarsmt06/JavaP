package operator;

public class relationalOperator {
    public static void main(String[] args){
        boolean result;
        int val1=5,val2=10;

        result = (val2 == val2);// true when left operand is excatly equal with right operand
        System.out.println("Q:  result = ("+"val2"+" == "+val2+")");
        System.out.println("    The result is: " + result);

        result = (val1 <= val1);// true when left operand is less than or equal to right operand
        System.out.println("Q:  result = ("+val1+" <= "+val1+")");
        System.out.println("    The result is: " + result);

        result = (val2 > val1);// true when left operand is greater than right operand
        System.out.println("Q:  result = ("+val2+" < "+val1+")");
        System.out.println("    The result is: " + result);

        result = (val2 >= val1);// true when left operand is greater than or equal to right operand
        System.out.println("Q:  result = ("+val2+" < "+val1+")");
        System.out.println("    The result is: " + result);

        result = (val1 != val1);// true when left operand and right operand are not equal
        System.out.println("Q:  result = ("+val1+" != "+val1+")");
        System.out.println("    The result is: " + result);
    }
}
