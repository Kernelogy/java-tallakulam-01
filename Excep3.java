import java.util.Scanner;

public class Excep3 {
    public static void main(String[] args) {
        String str;
        try {
            int num = Integer.parseInt(args[0]);
            int sqaure = num * num;
            System.out.println("The sqaure of " + num + " is " + sqaure);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide a command-line argument");
            Scanner scanner = new Scanner(System.in);
            str = scanner.nextLine();
            System.out.println("The given String is " + str);
        } catch (NumberFormatException e){
            System.out.println("Please provide a number");
        }catch(Exception e){ 
        
        }finally { //Optional
            System.out.println("This block executes always");
            System.out.println("Even if the exceptions occurs or not");
        }
        System.out.println("Programmed Ended");
    }
}
