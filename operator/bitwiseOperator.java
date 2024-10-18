package operator;

public class bitwiseOperator {
    public static void main(String[] args) {
        byte val1 = 12; // 0000 1100
    byte val2 = 10; // 0000 1010
    byte res;

    res = (byte) ~val1;//bitwise complement val1
    System.out.println("The result: "+ res);
    

    res = (byte) (val1 & val2);//bitwise AND operation
    System.out.println("The result: "+ res);
    

    res = (byte) (val1 | val2);//bitwise OR operation
    System.out.println("The result: "+ res);
    

    res = (byte) (val1 ^ val2);//bitwise XOR operation
    System.out.println("The result: "+ res);
    

    res = (byte) (val1 << 2);//shift 2 bits to left
    System.out.println("The result: "+ res);
    

    res = (byte) (val1 >> 2);//shift 2 bits to right
    System.out.println("The result: "+ res);
    }
    
    
}
