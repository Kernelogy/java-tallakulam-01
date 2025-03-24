import java.util.Scanner;

public class Excep4 {
    public static void main(String[] args) {
        String str;
        try {
            int num = Integer.parseInt(args[0]);
            int sqaure = num * num;
            System.out.println("The sqaure of " + num + " is " + sqaure);
        } catch (Exception e) {
            System.out.println("This block executes on all the exceptions");
        } finally { //Optional
            System.out.println("This block executes always");
            System.out.println("Even if the exceptions occurs or not");
        }
        System.out.println("Programmed Ended");
    }
}
