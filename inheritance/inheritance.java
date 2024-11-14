package inheritance;

class Employee{
    protected double salary = 25000D;
    public Employee(){
        System.out.println("This is constructor of Employee class");
    }
}

class Developer extends Employee{
    double bonus = 10000;
    public Developer(){
        System.out.println("This is constructor of Developer class");
    }

    public void displaySalary(){
        System.out.println("The salary is :" + (salary + bonus) + "\n");
    }
}
class Tester extends Employee{
    double bonus = 20000;
    public Tester(){
        System.out.println("This is constructor of Tester class");
    }

    public void displaySalary(){
        System.out.println("The salary is :" + (salary + bonus) + "\n");
    }
}
public class inheritance {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.displaySalary();

        Tester tester = new Tester();
        tester.displaySalary();
    }
}
