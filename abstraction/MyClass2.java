package abstraction;

public class MyClass2 extends MyClass1 {
    
    @Override
    void myFunction12(){
        System.out.println("myFunction12 is executing...");
    }

    public static void main(String[] args) {
        MyClass2 ob1 = new MyClass2();
        
        ob1.myFunction11();
        ob1.myFunction12();

        MyClass1 ob2 = new MyClass1(){
            @Override
            void myFunction12(){
                System.out.println("MyFunction12 is executing here...");
            }
        };

        ob2.myFunction11();
        ob2.myFunction12();
    }
}
