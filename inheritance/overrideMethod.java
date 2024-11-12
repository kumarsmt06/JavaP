package inheritance;

class Animal{
    public void movement() { //define movement method in the parent class
        System.out.println("Animals can move.");
    }
}

class Dog extends Animal{
    @Override
    public void movement() { //redefine the movement method for the Dog class
        System.out.println("Dogs can walk and run also.\n");
    }
}

class Frog extends Animal{
    @Override
    public void movement() { //redefine movement method
        System.out.println("Calling movement method of parent class");
        super.movement(); //call the movement method of the parent class first
        //then print from current movement method
        System.out.println("Frogs can jump.\n");
    }
}

public class overrideMethod {
        public static void main(String[] args) {
            Animal animal = new Animal(); //set animal as object of Animal class
            animal.movement();
        
            //set animal reference variable to point Dog
            animal = new Dog();
            animal.movement();
        
            //set animal reference variable to point Frog
            animal = new Frog();
            animal.movement();
        }
        
    
}
