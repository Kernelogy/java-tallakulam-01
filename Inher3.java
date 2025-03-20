interface Bird{
    public void fly();
}
interface Horse{
    public void run();
}
class Pegasus implements Bird, Horse{
    @Override
    public void fly(){
        System.out.println("Flying");
    }
    @Override
    public void run(){
        System.out.println("Running");
    }
    // @Override
    public void display(){
        System.out.println("Pegasus Class");
    }
}
public class Inher3 {
    public static void main(String[] args) {
        Pegasus p = new Pegasus();
        p.run();
        p.fly();
    }
}
