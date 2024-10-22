package dataTypes;

public class dataTypeCharacter {
    public static void main(String[] args) {
        char myChar; //character type data, size: 2-bytes

        myChar = 'A';//direct assign character A, with single quote
        System.out.println("The value of myChar: "+ myChar);
        
        myChar =70;//ASCII value of a character F
        System.out.println("The value of myChar: "+ myChar);
        
        myChar = '\u0041'; //unicode Hexadecimal value for integer (from 0000 to FFFF)
        System.out.println("The value of myChar: "+ myChar);



    }
    
}
