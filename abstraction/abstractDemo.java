package abstraction;

abstract class Emp{
    public void description(){
        System.out.println("It is an employee");
    }

    abstract  void salary();//abstract function has no body
}

class Programmer extends Emp{
    @Override
    public void description(){
        System.out.println("It is a Programmer");
    }

    @Override
    void salary(){
        System.out.println("Salary of programmer 20000");
    }
}
class TesterEmp extends Emp{
    @Override
    public void description(){//override description method
        super.description();// call description method
        System.out.println("Works as a Tester");
    }

    @Override
    void salary(){
        System.out.println("Salary of Tester 30000");
    }
}

public class abstractDemo {
    public static void main(String[] args) {
        Emp e = new Programmer();
        e.description();
        e.salary();

        e = new TesterEmp();
        e.description();
        e.salary();
    }
    
}
