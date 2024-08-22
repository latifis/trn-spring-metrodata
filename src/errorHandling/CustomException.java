package errorHandling;

public class CustomException {
    public static void main(String[] args) {
        int age = 6;
        try {
            if (age < 18){
                throw new ValidateAgeException("Age must more than 18");
            }
        }catch (ValidateAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
