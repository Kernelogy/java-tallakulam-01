/*
    1. An abstract class can contained both defined and undefined methods
    2. A class which contains an abstract method must be declared abstract
    3. An abstract class cannot be instantiated(objects cannot be created)
    4. A class which is inherting an abstract class also becomes abstract
        by default
            - The inheriting class must override all the abstract methods
                of the super class
    Points:
        Abstract classes are used for templating[see point 4]

 */
abstract class Car{
    private String model;
    private double price;
    private int fuelLevel;
    private int speed;    
    public abstract void start();
    public abstract void stop();
    public abstract void accelerate();
    public abstract void applyBrake();
}
class InnovaCar extends Car{
    public void start(){
        System.out.println("Car Started");
    }
    public void stop(){
        System.out.println("Car Started");
    }
    public void accelerate(){
        System.out.println("Accelerating...");
    }
    public void applyBrake(){
        System.out.println("Braking...");
    }
}
public class Abs1 {
    public static void main(String[] args) {
        // InnovaCar ic = new InnovaCar();
        Car ic = new InnovaCar();// Hiding the implementation
        ic.start();        
        ic.accelerate();
        ic.applyBrake();
        ic.stop();
    }
}
