package errorHandling;

public class ThrowsException {
    public static void main(String[] args) {
        try {
            validate(10);
        }catch (ValidateAgeException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Block the process ????");
    }

    static void validate(int age) throws ValidateAgeException {
        if (age < 18){
            throw new ValidateAgeException("Age must be greater than 18");
        }else {
            System.out.println("Age verified successfully. You are eligible to register.");
        }
    }
}
