/**
 * Notice that we use Gehaltsempfaenger as a type for the array and some arguments.
 * We can do this because of the Liskov substitution principle.
 * This means we can add any instance that implements the interface Gehaltsempfaenger
 * in these places.
 *
 * @see https://en.wikipedia.org/wiki/Liskov_substitution_principle
 */
public class GehaltsempfaengerVerwaltung {
    private Gehaltsempfaenger[] empfaenger = new Gehaltsempfaenger[100];
    private int currentEmpfaengerCount = 0;

    /*
     * @param instance Any instance of a class that implements Gehaltsempfaenger.
     */
    public void addGehaltssempfaenger(Gehaltsempfaenger instance) {
        this.empfaenger[this.currentEmpfaengerCount] = instance;
        this.currentEmpfaengerCount++;
    }

    public void printGehaltsempfaenger() {
        for (int i = 0; i < this.currentEmpfaengerCount; i++) {
            System.out.println(this.empfaenger[i].getPersonenDaten());
        }
    }
}


