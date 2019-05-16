import exceptions.GehaltsempfaengerVerwaltungVollException;

/**
 * Notice that we use Gehaltsempfaenger as a type for the array and some arguments.
 * We can do this because of the Liskov substitution principle.
 * This means we can add any instance that implements the interface Gehaltsempfaenger
 * in these places.
 *
 * https://en.wikipedia.org/wiki/Liskov_substitution_principle
 */
public class GehaltsempfaengerVerwaltung {
    private Gehaltsempfaenger[] empfaenger;
    private int currentEmpfaengerCount = 0;

    /**
     * @param maxSize The limit of the internal array.
     */
    public GehaltsempfaengerVerwaltung(int maxSize) {
        this.empfaenger = new Gehaltsempfaenger[maxSize];
    }

    /**
     * @param instance Any instance of a class that implements Gehaltsempfaenger.
     */
    public void addGehaltssempfaenger(Gehaltsempfaenger instance) {
        if (this.currentEmpfaengerCount >= this.empfaenger.length) {
            throw new GehaltsempfaengerVerwaltungVollException(this.empfaenger.length);
        }

        this.empfaenger[this.currentEmpfaengerCount] = instance;
        this.currentEmpfaengerCount++;
    }

    public void printGehaltsempfaenger() {
        // This is the short version to iterate over all elements of an array / list
        for (Gehaltsempfaenger gehaltsempfaenger : this.empfaenger) {
            if (gehaltsempfaenger != null)
                System.out.println(gehaltsempfaenger.getPersonenDaten());
        }

        /*
        // This is the long version, using a fori loop:

        for (int i = 0; i < this.empfaenger.length; i++) {
            Gehaltsempfaenger gehaltsempfaenger = this.empfaenger[i];
            System.out.println(gehaltsempfaenger.getPersonenDaten());
        }
        */
    }
}


