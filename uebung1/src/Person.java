import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Person implements HatPersonenDaten {
    private LocalDate geburtsdatum;
    private String name;

    /**
     * @param geburtsdatum  The birth date of this person.
     * @param name          The name of this person.
     */
    public Person(LocalDate geburtsdatum, String name) {
        this.geburtsdatum = geburtsdatum;
        this.name = name;
    }

    /**
     * @return the age of the person.
     */
    public int getAlter() {
        return (int) ChronoUnit.YEARS.between(geburtsdatum, LocalDate.now());
    }

    /**
     * @return the name of the person.
     */
    public String getName() {
        return name;
    }
}
