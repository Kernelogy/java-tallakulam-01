/*
    Package for input output operation
        java.io

 */
import java.io.*;
import java.util.Date;
public class File1 {
    public static void main(String[] args) throws Exception {
        File file = new File("data.txt");
        file.createNewFile();
        System.out.println(file.exists());
        System.out.println(file.length());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.isDirectory());
        System.out.println(file.isHidden());
        System.out.println(file.lastModified());
        Date date = new Date(file.lastModified());
        System.out.println(date);
    }
}
