import java.io.*;

public class File2 {
    public static void main(String[] args) throws Exception {
        /*
        //Below code is for finding ASCII code
        for(int i=1;i<=255; i++){
            System.out.print(i + "=" + (char) i + "\t");
        }
        */
        FileInputStream fis = new FileInputStream("File1.java");
        /*
        int x = fis.read();
        System.out.println((char) x);
        x = fis.read();
        System.out.println((char) x);
        */
        /*
        while(fis.available() != 0){
            char ch = (char) fis.read();
            System.out.print(ch);
        }
        */
        byte[] data = new byte[fis.available()];
        fis.read(data);
        String sData = new String(data);
        System.out.println(sData);
    }
}

