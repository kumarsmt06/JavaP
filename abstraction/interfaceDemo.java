package abstraction;

interface Vehicle{
    double maxSpeed();
    void wheelCount();
}

class Bike implements Vehicle{
    int wheel =2;
    @Override
    public double maxSpeed(){
        return 150;
    }

    @Override
    public void wheelCount(){
        System.out.println("Number of wheels for bike: " + wheel);
    }
}

class Car implements Vehicle{
    int wheel = 4;

    @Override
    public double maxSpeed(){
        return 300;
    }

    @Override
    public void wheelCount(){
        System.out.println("Number of wheels for bike: " + wheel);
    }
}
public class interfaceDemo {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Car car = new Car();

        System.out.println("Maximum speed of bike: " + bike.maxSpeed());
        bike.wheelCount();
        
        System.out.println("Maximum speed of car: " + car.maxSpeed());
        car.wheelCount();
    }
}
