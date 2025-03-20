/*
 Interfaces are pure abstract class
 1. All the methods declared inside an interface are abstract by default
 2. All the varaibles declared inside an interface are final by default
 
 */
interface Car{ 
    public double PI = 3.14;  
    public void start();
    public void stop();
    public void accelerate();
    public void applyBrake();
}
class InnovaCar implements Car{
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
public class Abs2 {
    public static void main(String[] args) {
        Car ic = new InnovaCar();// Hiding the implementation
        ic.start();        
        ic.accelerate();
        ic.applyBrake();
        ic.stop();        
    }
}
