import java.io.*;

public class File3 {
    public static void main(String[] args) throws Exception{
        //Replaces the existing content of the file
        //FileOutputStream fos = new FileOutputStream("data1.txt");
        FileOutputStream fos = new FileOutputStream("data1.txt", true);
        String data = "Hello World";
        /*
        for(int i=0;i<data.length();i++){
            fos.write((byte) data.charAt(i));
        }
        */
        byte[] bData = data.getBytes();
        fos.write(bData);
        fos.close();
    }
}
