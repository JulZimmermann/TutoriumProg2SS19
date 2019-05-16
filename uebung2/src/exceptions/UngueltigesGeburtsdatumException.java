package exceptions;

import java.time.LocalDate;

public class UngueltigesGeburtsdatumException extends Exception {
    public UngueltigesGeburtsdatumException(LocalDate invalidDate) {
        super("The date " + invalidDate + " is invalid.");
    }

    public UngueltigesGeburtsdatumException(LocalDate invalidDate, String reason) {
        super("The date " + invalidDate + " is invalid: " + reason);
    }
}
