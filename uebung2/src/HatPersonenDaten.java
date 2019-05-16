/**
 * Any class that implements this interface has to implement the method
 * getPersonenDaten. This way we can use the method also on classes that
 * implement the Interface "Gehaltsempfaenger", because this class extends
 * "HatPersonenDaten".
 */
public interface HatPersonenDaten {
    /**
     * @return  All information known about the person, in a single line.
     *          Should also contain the type of person (e.g. "Student", "Dozent", etc.)
     */
    String getPersonenDaten();
}
