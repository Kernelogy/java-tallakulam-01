import java.util.Scanner;

class MyUserInputException extends Exception{
    MyUserInputException(String message){
        System.out.println(message);
    }
}
public class Excep8 {
    public static void main(String[] args) {
        try {
            int result = getUserInput();
            System.out.println("The given num is " + result);
        } catch (MyUserInputException e) {
           System.out.println(e);
        }
        
    }
    public static int getUserInput() throws MyUserInputException{
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        try {
            num = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            throw new MyUserInputException("User gave a string instead of number");
        }        
        return num;
    }
}
