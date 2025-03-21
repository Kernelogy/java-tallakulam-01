abstract class Monkey{
    public abstract void climb();
}
interface Bird{
    public void fly();
}
public class Anon1 {
    public static void main(String[] args) {
        Monkey m = new Monkey() {
           @Override
           public void climb(){
            System.out.println("Climbing Monkey");
           } 
        };
        m.climb();
        // Bird b = new Bird() {
        //     @Override
        //     public void fly(){
        //         System.out.println("Flying Bird");
        //     }
        // };
        // b.fly();
        new Bird() {
            @Override
            public void fly(){
                System.out.println("Flying Bird");
            }
        }.fly();
    }
}
