package javaio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class CharacterStreamApp {
    public static void main(String[] args) {

        List<String> data = new ArrayList<String>();

        try (BufferedReader reader = new BufferedReader(new FileReader("./src/input.txt"))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println("Read line: " + line);
                data.add(line);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./src/output.txt"))){
            for (String line : data){
                writer.write(line);
                writer.newLine();
            }
            writer.flush();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
