/*
    Errors and Exceptions occurs during the runtime
    Errors cannot be handled
        Ex: Memory full, RAM memory not available, Network issues
    Exceptios can be handled
        Ex: Working with files, etc
    Types:
        1. Checked Exceptions
            Ex:
                FileNotFoundException
        2. Unchecked Exceptions
            Ex:
                ArrayIndexOutOfBoundsException
    Syntax:
        try{
            //statments to try
        }catch(Exception exception-obj){
            //statements if exception occurs
        }
    Important Note:
        Exception handling allows the program to exit gracefully even if the 
        error occurs
        If there is no exception handling the program terminates abruptly
        during a exception
        
 */
import java.io.*;

public class Excep1 {
    public static void main(String[] args) {
        try {
            System.out.println(args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide a command-line argument");
        }
        System.out.println("Programmed Ended");
        /*
        //Below code creates a checked Exception
        FileInputStream fis = new FileInputStream("myfile.txt");
        fis.read();
        */
        /*
        //Below code creates an unchecked exception
        int[] x = {1,2,3,4,5};
        System.out.println(x[5]);
        */
    }
}
