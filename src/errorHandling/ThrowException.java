package errorHandling;

public class ThrowException {
    public static void main(String[] args) {
        try {
            validate(10);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Block the process ????");
    }

    static void validate(int age){
        if (age < 18){
            throw new IllegalArgumentException("Age must be greater than 18");
        }else {
            System.out.println("Age verified successfully. You are eligible to register.");
        }
    }
}
