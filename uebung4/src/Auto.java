import java.io.Serializable;

public class Auto implements Serializable {

    private int ps;
    private String marke;
    private String modell;
    private int year;
    private transient String kennzeichen;

    public Auto() {
    }

    public Auto(int ps, String marke, String modell, int year, String kennzeichen) {
        this.ps = ps;
        this.marke = marke;
        this.modell = modell;
        this.year = year;
        this.kennzeichen = kennzeichen;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }
}
