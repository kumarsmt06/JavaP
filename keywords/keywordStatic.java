package keywords;

class staticDemo {
    static int staticVar; // static variable
    int var; // non-static variable

    public staticDemo() {
        var = 0; // initialize non-static variable to 0
    }

    public static void setStaticVar(int x) { // static method can only access static variables
        staticVar = x;
    }

    public void increase() {
        staticVar++; // increase the value of static variable
        var++; // increase non-static variable
    }

    public void display() {
        System.out.println("The value of static variable: " + staticVar); // display the value of static variable
        System.out.println("The value of non-static variable: " + var); // display the value of non-static variable
        System.out.println();
    }
}

public class keywordStatic {
    public static void main(String[] args) {
        staticDemo st1 = new staticDemo();
        staticDemo st2 = new staticDemo();

        // increase the static variable two times using st1 object
        st1.display();
        st1.increase();
        st1.increase();
        st1.display();

        // increase the static variable three times using st2 object
        st2.increase();
        st2.increase();
        st2.increase();
        st2.display();

        // static members can also be accessed without any object
        staticDemo.setStaticVar(50); // call static method without using any object
        System.out.println("Static variable without object: " + staticDemo.staticVar);
    }
}

