package errorHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyKeywords {
    public static void main(String[] args) {
        int num = 0 ;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }catch (IOException | NumberFormatException e){
            System.out.println(e);
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
