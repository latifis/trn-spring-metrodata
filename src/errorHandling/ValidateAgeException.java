package errorHandling;

public class ValidateAgeException extends RuntimeException {
    public ValidateAgeException(String message) {
        super(message);
    }
}
