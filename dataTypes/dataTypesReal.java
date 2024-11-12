package dataTypes;

public class dataTypesReal {
    public static void main(String[] args){
        float myFloat; // floating type data, size 4-bytes

        myFloat = 20.25F;// the letter f or F is needed to represent as float
        System.out.println("The value of myFloat: " + myFloat);
        
        myFloat = (float)5646/21; //Type casting to change integer to float
        System.out.println("The value of myFloat: " + myFloat);
        
        double myDouble; // also float type data, size 8-bytes

        myDouble = 20.253455D;// the letter d or D is needed to represent as double
        System.out.println("The value of myDouble: " + myDouble);
        
        myDouble = 5646D/21; //Type casting to change integer to double
        System.out.println("The value of myDouble: " + myDouble);
    }
}
