package errorHandling;

public class TryCatchException {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        int[] number = new int[]{1,2,3,4,5};

//        Thread.sleep(5000);

        try {
            System.out.println(number[5]);
            y = 12/x;
        }catch (ArithmeticException e){
            System.out.println("aritmatichhs");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array lebih : " + e.getMessage());
            System.out.println("array lebih");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("Something went wrong. " + e );
        }

        // ditangkap error by expectedd error nya a
        // diurutkan dari specific -> general

        System.out.println(y);
//        System.out.println(12/x);
        System.out.println("Hello World");


    }
}
