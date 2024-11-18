package control;

public class continueStatement {
    public static void main(String[] args) {
        int a = 0;
        while (true) { 
            if(a>=5 && a<=10){
                continue;
            }

            System.out.println("The value of a: " + a);
            if(a==15)
                break;
            a++;
        }
        System.out.println("End of the program...");
    }
}
