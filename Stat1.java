class Counter{
    private static int amount = 0;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount += amount;
    }
    
}
public class Stat1 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        c1.setAmount(100);
        c1.setAmount(345);

        c2.setAmount(100);
        c2.setAmount(400);
        c2.setAmount(10);

        System.out.println("Counter 1 : " + c1.getAmount());
        System.out.println("Counter 2 : " + c2.getAmount());

    }
}
