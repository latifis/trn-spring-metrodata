package javaio;

import java.io.FileInputStream;
import java.io.InputStream;

public class ByteStreamApp {
    public static void main(String[] args) {

        try {
            InputStream inputStream = new FileInputStream("./src/input.txt");
            System.out.println("Available bytes: " + inputStream.available());

            byte[] array = new byte[inputStream.available()];

            // Read byte from the input stream
            inputStream.read(array);
            System.out.println("Data read from the file: ");

            // Convert byte array into String
            String data = new String(array);
            System.out.println(data);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
