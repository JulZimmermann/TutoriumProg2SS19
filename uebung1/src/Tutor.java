import java.time.LocalDate;

/**
 * The only difference between a tutor and a "dozent" is that the tutor is a student
 * and therefore extends this class instead of person.
 */
public class Tutor extends Student implements Gehaltsempfaenger {
    private int gehalt;

    public Tutor(LocalDate geburtsdatum, String name, int gehalt) {
        super(geburtsdatum, name);
        this.gehalt = gehalt;
    }


    @Override
    public int monatlichesGehalt() {
        return gehalt;
    }

    @Override
    public String getPersonenDaten() {
        return String.format("Tutor mit Name: %s, Alter: %s, Gehalt: %d", getName(), getAlter(), monatlichesGehalt());
    }
}
