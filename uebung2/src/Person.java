import exceptions.UngueltigerNameException;
import exceptions.UngueltigesGeburtsdatumException;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Person implements HatPersonenDaten {
    private LocalDate geburtsdatum;
    private String name;

    /**
     * @param geburtsdatum The birth date of this person.
     * @param name         The name of this person.
     */
    public Person(LocalDate geburtsdatum, String name) throws UngueltigerNameException, UngueltigesGeburtsdatumException {

        // Merke: Diese Fehler müssen propagiert werden!!
        if (name.equals("")) {
            throw new UngueltigerNameException("Der Name der Person darf nicht leer sein!");
        }

        if (geburtsdatum.isAfter(LocalDate.now())) {
            throw new UngueltigesGeburtsdatumException(geburtsdatum, "Das Datum darf in der Zukunft liegen!");
        }

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
