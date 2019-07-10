public class Computer {

    private String seriennummer;
    private String hersteller;
    private int kernAnzahl;
    private Betriebsystem betriebsystem;

    public Computer(String seriennummer, String hersteller, int kernAnzahl, Betriebsystem betriebsystem) {
        this.seriennummer = seriennummer;
        this.hersteller = hersteller;
        this.kernAnzahl = kernAnzahl;
        this.betriebsystem = betriebsystem;
    }

    public String getSeriennummer() {
        return seriennummer;
    }

    public void setSeriennummer(String seriennummer) {
        this.seriennummer = seriennummer;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public int getKernAnzahl() {
        return kernAnzahl;
    }

    public void setKernAnzahl(int kernAnzahl) {
        this.kernAnzahl = kernAnzahl;
    }

    public Betriebsystem getBetriebsystem() {
        return betriebsystem;
    }

    public void setBetriebsystem(Betriebsystem betriebsystem) {
        this.betriebsystem = betriebsystem;
    }

    public void ausfuehren(Programm programm) {
        for (int i = 0; i < kernAnzahl; i++) {
            new Thread(() -> {
                try {
                    Thread.sleep(betriebsystem.sleepTime);
                } catch (InterruptedException e) {
                    System.out.println("Fehlers");
                }
                programm.fuehreAus();
            }).start();
        }
    }

}
