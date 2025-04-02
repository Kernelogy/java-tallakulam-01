/*
Steps for Singleton Implementation
 1. Lock the constructor by declaring private
 2. Provide a static method to get the instance of the class
    with the underlying logic for single instance
 */
class Counter{
    private int amount = 0;
    private static Counter counter = null;
    private Counter(){       
    }
    public static Counter getCounter(){
        if(counter == null){
            counter = new Counter();
        }
        return counter;
    }
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount += amount;
    }
    
}
public class Stat2 {
    int x = 10;
    public static void main(String[] args) {
        x = 20;
        Counter c1 = Counter.getCounter();
        Counter c2 = Counter.getCounter();

        c1.setAmount(100);
        c1.setAmount(345);

        c2.setAmount(100);
        c2.setAmount(400);
        c2.setAmount(10);

        System.out.println("Counter 1 : " + c1.getAmount());
        System.out.println("Counter 2 : " + c2.getAmount());

    }
}
