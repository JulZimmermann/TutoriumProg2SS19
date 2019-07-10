public class ComputerBuilder {

    private String seriennummer;
    private String hersteller;
    private int kernAnzahl = 1;
    private Betriebsystem betriebsystem = Betriebsystem.Windows10;

    public ComputerBuilder(String seriennummer, String hersteller) {
        this.seriennummer = seriennummer;
        this.hersteller = hersteller;
    }

    ComputerBuilder withKernAnzahl(int kernAnzahl) {
        this.kernAnzahl = kernAnzahl;
        return this;
    }

    ComputerBuilder withBetriebsystem(Betriebsystem betriebsystem) {
        this.betriebsystem = betriebsystem;
        return this;
    }

    Computer build() {
        return new Computer(seriennummer, hersteller, kernAnzahl, betriebsystem);
    }

}
