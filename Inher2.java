class Vehicle{
    public void display(){
        System.out.println("This is a Vehicle");
    }
}
class Automobile extends Vehicle{
    public void engine(){
        System.out.println("Automobile has an engine");
    }
}
class Car extends Automobile{
    public void start(){
        System.out.println("Car Started");
    }
    public void stop(){
        System.out.println("Car Stopped");
    }
}
public class Inher2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
        c.engine();
        c.start();
        c.stop();
    }
}
