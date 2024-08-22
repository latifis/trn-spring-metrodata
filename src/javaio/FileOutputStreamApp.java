package javaio;

import java.io.FileOutputStream;

public class FileOutputStreamApp {
    public static void main(String[] args) {
        String data = "This is a test for output";
        try (FileOutputStream fos = new FileOutputStream("./src/output.txt")){
            byte[] array = data.getBytes();
            fos.write(array);
            fos.flush(); // di push
        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
