package exceptions;

public class GehaltsempfaengerVerwaltungVollException extends ArrayIndexOutOfBoundsException {

    public GehaltsempfaengerVerwaltungVollException(int maxSize) {
        super("Die Gehaltsempfängerliste ist voll. Maximale Anzahl an Elementen: " + maxSize);
    }
}
