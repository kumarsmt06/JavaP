package strings;

public class strBufferBuilder {
    public static void main(String[] srgs){
        StringBuffer sBuffer = new StringBuffer(); // defaul capacity is 16

        System.out.println("The capacity of default StringBuffer: "+ sBuffer.capacity());

        sBuffer = new StringBuffer(50); //Set the capacity to 50
        System.out.println("The capacity of sBuffer is: "+ sBuffer.capacity());

        //String buffer capacity is now 16 + length of given string
        sBuffer = new StringBuffer("hi, this is Sumit.");
        System.out.println("The capacity of sBuffer is: "+ sBuffer.capacity());
        System.out.println("String in sBuffer: "+ sBuffer);

        //StringBuilders are used same as StringBuffer
        StringBuilder sBuilder = new StringBuilder("hi, this is Sumit.");
        System.out.println("String in sBuilder: "+ sBuilder);

        //append string after the string buffer and string builder
        sBuffer.append("How are you(appended buffer).");
        sBuilder.append("How are you(appended builder).");
        System.out.println("String in sBuffer: "+ sBuffer);
        System.out.println("String in sBuilder: "+ sBuilder);

        sBuffer = new StringBuffer("kasdfjkdlsf");
        sBuilder = new StringBuilder("fieskfla");

        //insert string in between the old strings
        sBuffer.insert(3,"SUMIT");
        sBuilder.insert(7,"SUMIT");
        System.out.println("Strings in sBuffer(insert): "+ sBuffer);
        System.out.println("Strings in sBuilder(insert): "+ sBuilder);

        //reverse the strings
        System.out.println("Reversed StringBuffer: "+ sBuffer.reverse());
        System.out.println("Reversed StringBuilder: "+ sBuilder.reverse());





    }
}