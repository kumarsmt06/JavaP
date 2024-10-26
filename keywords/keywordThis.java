package keywords;

/*
 * this keyword is a reference to the current instance of the class in which it is used. 
 * It's commonly used in object-oriented programming to differentiate between 
 * instance variables (fields) and parameters, as well as to invoke other constructors 
 * and methods within the same class.
 */
class MyClass{
    private int a, b;

    public MyClass(int a, int b){
        this.a = a;
        this.b = b;
    }

    public MyClass(){
        this(0,0);
    }

    public void setData(int a, int b){
        this.a=a;
        this.b=b;
    }
    public void display(){
        System.out.println("The values of a and b are: "+a+" and "+b);
    }
}
public class keywordThis {
    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        myObj.display();
        myObj.setData(07, 56);
        myObj.display();
        MyClass myObj1 = new MyClass(12,13);
        myObj1.display();
    }
}
