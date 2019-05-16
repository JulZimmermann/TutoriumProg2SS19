import exceptions.UngueltigerNameException;
import exceptions.UngueltigesGeburtsdatumException;

import java.time.LocalDate;


public class Dozent extends Person implements Gehaltsempfaenger {

    private int gehalt;

    /**
     * We have to implement a constructor to set private variables when
     * initializing this class. We give the first two arguments to the
     * parent class and set the private variable "gehalt".
     *
     * @param geburtsdatum The birth date of this "dozent".
     * @param name         The name of this "dozent".
     * @param gehalt       The amount of money this "dozent" gets every month.
     */
    public Dozent(LocalDate geburtsdatum, String name, int gehalt)
            throws UngueltigesGeburtsdatumException, UngueltigerNameException {
        super(geburtsdatum, name);
        this.gehalt = gehalt;
    }

    @Override
    public int monatlichesGehalt() {
        return gehalt;
    }

    @Override
    public String getPersonenDaten() {
        return String.format("Dozent mit Name: %s, Alter: %d, Gehalt %d", getName(), getAlter(), monatlichesGehalt());
    }
}
