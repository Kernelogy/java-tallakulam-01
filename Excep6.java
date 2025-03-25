import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Excep6 {
    public static void main(String[] args) {
        
        int num = 0;
        try {
            num = Integer.parseInt(args[0]);            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please give a command line argument");
            e.printStackTrace();
            System.out.println("Message is " + e.getMessage());
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("Please give a number in command line argument");
        } finally {
            System.out.println("This block always executes even if the exception occurs or not");
        }
        System.out.println(num * num);
        
        /*
        try {
            FileInputStream fis = new FileInputStream("data.txt");
            fis.read();
        } catch (FileNotFoundException e) {
            // TODO: handle exception
        } catch (IOException e) {

        }
        */
        

    }
}
