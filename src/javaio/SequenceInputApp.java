package javaio;

import java.io.*;

public class SequenceInputApp {
    public static void main(String[] args) {
        byte[] byteArray = "Hello, This is Byte \n".getBytes();

        // Membuat ByteArrayInputStream untuk kedua array byte
        ByteArrayInputStream inputByte = new ByteArrayInputStream(byteArray);

        // Menggabungkan kedua InputStream menggunakan SequenceInputStream
        try (InputStream inputStream = new SequenceInputStream(inputByte, new FileInputStream("./src/input.txt"))) {
            int data;
            while ((data = inputStream.read()) != -1){
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
