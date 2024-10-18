package operator;

public class conditionalOperator {
    public static void main(String[] args) {
        boolean bool1,bool2, result;
        bool1 = true;
        bool2 = false;

        result = bool1 || bool2; // true when atleast one value is true
        System.out.println(bool1+" || "+bool2);
        System.out.println("The result is: " + result);

        result = bool1 && bool2; // true when both values are true
        System.out.println(bool1+" && "+bool2);
        System.out.println("The result is: " + result);

    }
}
