package exceptions;

public class UngueltigerNameException extends Exception {
    public UngueltigerNameException() {
        this("Invalider Name.");
    }

    public UngueltigerNameException(String message) {
        super(message);
    }
}
