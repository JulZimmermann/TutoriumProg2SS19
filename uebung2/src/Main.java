import exceptions.UngueltigerNameException;
import exceptions.UngueltigesGeburtsdatumException;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        example1();
        example2_invalid_name();
        example3_invalid_date();

        example4_list_full__intended_to_crash();
    }

    /**
     * This example shows that the whole structure is working.
     */
    private static void example1() {
        System.out.println("~~~~~~~ Example 1");
        GehaltsempfaengerVerwaltung vw = new GehaltsempfaengerVerwaltung(4);

        // For the sake of this example we just use the current time as birthdate.
        try {
            vw.addGehaltssempfaenger(new Tutor(LocalDate.now(), "Horst", 10));
            vw.addGehaltssempfaenger(new Hausmeister(LocalDate.now(), "Krause", 11));
            vw.addGehaltssempfaenger(new Dozent(LocalDate.now(), "Peter", 25));
            vw.addGehaltssempfaenger(new Dozent(LocalDate.now(), "Klaus", 33));
        } catch (UngueltigesGeburtsdatumException | UngueltigerNameException e) {
            System.out.println(e);
        }

        vw.printGehaltsempfaenger();
    }

    /**
     * This example shows that there will be an exception thrown if you enter a invalid name.
     */
    private static void example2_invalid_name() {
        System.out.println("~~~~~~~ Example 2");
        GehaltsempfaengerVerwaltung vw = new GehaltsempfaengerVerwaltung(4);


        // For the sake of this example we just use the current time as birthdate.
        try {
            vw.addGehaltssempfaenger(new Tutor(LocalDate.now(), "Horst", 10));
            vw.addGehaltssempfaenger(new Hausmeister(LocalDate.now(), "Krause", 11));

            // Invalid name! So this will print an exception to the console, but continue the program AFTER
            // the catch block. Note: "Peter" will NOT be added to the list!
            vw.addGehaltssempfaenger(new Dozent(LocalDate.now(), "", 33));

            vw.addGehaltssempfaenger(new Dozent(LocalDate.now(), "Peter", 25));
        } catch (UngueltigesGeburtsdatumException | UngueltigerNameException e) {
            System.out.println(e);
        }

        vw.printGehaltsempfaenger();
    }

    /**
     * This example shows that there will be an exception thrown if you enter a date in the future.
     */
    private static void example3_invalid_date() {
        System.out.println("~~~~~~~ Example 3");
        GehaltsempfaengerVerwaltung vw = new GehaltsempfaengerVerwaltung(4);


        // For the sake of this example we just use the current time as birthdate.
        try {
            vw.addGehaltssempfaenger(new Tutor(LocalDate.now(), "Horst", 10));
            vw.addGehaltssempfaenger(new Hausmeister(LocalDate.now(), "Krause", 11));

            // Invalid date! So this will print an exception to the console, but continue the program AFTER
            // the catch block. Note: "Peter" will NOT be added to the list!
            LocalDate invalidBirthDate = LocalDate.now().plusDays(100); // he will be born in 100 days
            vw.addGehaltssempfaenger(new Dozent(invalidBirthDate, "", 33));

            vw.addGehaltssempfaenger(new Dozent(LocalDate.now(), "Peter", 25));
        } catch (UngueltigesGeburtsdatumException | UngueltigerNameException e) {
            System.out.println(e);
        }

        vw.printGehaltsempfaenger();
    }


    /**
     * This example shows the software will crash if you add too many entries to the
     * GehaltsempfaengerVerwaltung instance.
     */
    private static void example4_list_full__intended_to_crash() {
        System.out.println("~~~~~~~ Example 4 (this one is intended to crash the program)");

        // Note that it only can hold 4 entries
        GehaltsempfaengerVerwaltung vw = new GehaltsempfaengerVerwaltung(4);


        // For the sake of this example we just use the current time as birthdate.
        try {
            vw.addGehaltssempfaenger(new Tutor(LocalDate.now(), "Horst", 10));
            vw.addGehaltssempfaenger(new Hausmeister(LocalDate.now(), "Krause", 11));
            vw.addGehaltssempfaenger(new Dozent(LocalDate.now(), "Klaus", 33));
            vw.addGehaltssempfaenger(new Dozent(LocalDate.now(), "Peter", 25));

            // NOTE: This will throw an exeption that will NOT be caught by the catch!
            // As GehaltsempfaengerVerwaltungVollException extends RuntimeException, we do not need to catch it.
            // This will crash the program
            vw.addGehaltssempfaenger(new Hausmeister(LocalDate.now(), "Hugo", 60));

        } catch (UngueltigesGeburtsdatumException | UngueltigerNameException e) {
            System.out.println(e);
        }

        vw.printGehaltsempfaenger();
    }


}
