import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Excep7 {
    /*
    public static void main(String[] args) throws FileNotFoundException, IOException {
            FileInputStream fis = new FileInputStream("data.txt");
            fis.read();
    } 
    */

    public static void main(String[] args) {
        readFile();
    }
    public static void readFile() throws FileNotFoundException, IOException{
        FileInputStream fis = new FileInputStream("data.txt");
        fis.read();        
    }
       
}
