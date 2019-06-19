public class Raum {
    private int groesse;

    public Raum(int groesse) {
        this.groesse = groesse;
    }

    public int getGroesse() {
        return groesse;
    }

    public void setGroesse(int groesse) {
        this.groesse = groesse;
    }

    @Override
    public String toString() {
        return "Raum{" + "groesse=" + groesse + '}';
    }
}
