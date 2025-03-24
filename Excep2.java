import java.util.Scanner;

public class Excep2 {
    public static void main(String[] args) {
        String str;
        try {
            System.out.println(args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide a command-line argument");
            Scanner scanner = new Scanner(System.in);
            str = scanner.nextLine();
            System.out.println("The given String is " + str);
        }
        System.out.println("Programmed Ended");
    }
}
