import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        GehaltsempfaengerVerwaltung vw = new GehaltsempfaengerVerwaltung();

        // For the sake of this example we just use the current time as birthdate.
        vw.addGehaltssempfaenger(new Tutor(LocalDate.now(), "Horst", 10));
        vw.addGehaltssempfaenger(new Hausmeister(LocalDate.now(), "Krause", 11));
        vw.addGehaltssempfaenger(new Dozent(LocalDate.now(), "Peter", 25));

        // This does not work, as Student does not implement the interface Gehaltsempfaenger!
        //vw.addGehaltssempfaenger(new Student(LocalDate.now(), "Hans"));

        vw.printGehaltsempfaenger();
    }
}
