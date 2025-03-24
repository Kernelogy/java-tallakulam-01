class Engine{
    private int fuelLevel;
    public void start(){
        System.out.println("Engine Started");
        fuelLevel--;
    }
    public void stop(){
        System.out.println("Engine Stopped");
    }
    public int getFuelLevel() {
        return fuelLevel;
    }
    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }    
}
class Car{
    private Engine engine;
    public void setEngine(Engine engine){
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
}
public class Message1 {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Car car = new Car();
        car.setEngine(engine);//Message Passing
        car.start();
        car.stop();
    }
}
