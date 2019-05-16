import exceptions.UngueltigerNameException;
import exceptions.UngueltigesGeburtsdatumException;

import java.time.LocalDate;

public class Hausmeister extends Person implements Gehaltsempfaenger {
    private int gehalt;

    /**
     * We have to implement a constructor to set private variables when
     * initializing this class. We give the first two arguments to the
     * parent class and set the private variable "gehalt".
     *
     * @param geburtsdatum The birth date of this "Hausmeister".
     * @param name         The name of this "Hausmeister".
     * @param gehalt       The amount of money this "Hausmeister" gets every month.
     */
    public Hausmeister(LocalDate geburtsdatum, String name, int gehalt)
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
        return String.format("Hausmeister mit Name: %s, Alter: %d, Gehalt %d", getName(), getAlter(), monatlichesGehalt());
    }
}
