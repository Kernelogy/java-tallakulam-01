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
        Car ic = new InnovaCar();
        ic.start();        
        ic.accelerate();
        ic.applyBrake();
        ic.stop();
    }
}
