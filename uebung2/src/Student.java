import exceptions.UngueltigerNameException;
import exceptions.UngueltigesGeburtsdatumException;

import java.time.LocalDate;

/**
 * This class represents a student at the FHWS.
 */
public class Student extends Person {
    /**
     * We have to implement a basic constructor.
     * In this case, as the student has no other private variables, we just
     * call the parent constructor (using super) with the given values.
     *
     * @param geburtsdatum The birth date of this student.
     * @param name         The name of this student.
     */
    public Student(LocalDate geburtsdatum, String name)
            throws UngueltigesGeburtsdatumException, UngueltigerNameException {
        super(geburtsdatum, name);
    }

    @Override
    public String getPersonenDaten() {
        return String.format("Student mit Name: %s, Alter: %s", getName(), getAlter());
    }
}
