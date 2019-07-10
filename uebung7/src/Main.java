public class Main {

    public static void main(String[] args) {
        Computer computer = new ComputerBuilder("100", "IBM")
                .withBetriebsystem(Betriebsystem.Linux)
                .withKernAnzahl(4)
                .build();

        computer.ausfuehren(Main::programm);
    }

    static void programm() {
        System.out.println("Hallo Welt");
    }

}
