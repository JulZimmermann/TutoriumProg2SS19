import java.util.*;

@SuppressWarnings("Duplicates")
public class Aufgabe1 {
    public static void main(String[] args) {
        // Lege die Mannschaften an
        Mannschaft mannschaftA = new Mannschaft("MannschaftA")
                .addSpieler(new Spieler("SpielerA", 10))
                .addSpieler(new Spieler("SpielerB", 5))
                .addSpieler(new Spieler("SpielerC", 5))
                .addSpieler(new Spieler("SpielerD", 7));

        Mannschaft mannschaftB = new Mannschaft("MannschaftB")
                .addSpieler(new Spieler("SpielerE", 1))
                .addSpieler(new Spieler("SpielerF", 2))
                .addSpieler(new Spieler("SpielerG", 1))
                .addSpieler(new Spieler("SpielerH", 4));

        Mannschaft mannschaftC = new Mannschaft("MannschaftC")
                .addSpieler(new Spieler("SpielerI", 5))
                .addSpieler(new Spieler("SpielerJ", 6))
                .addSpieler(new Spieler("SpielerK", 3))
                .addSpieler(new Spieler("SpielerL", 6));

        // Füge die Mannschaften zur MAP hinzu
        Map<String, Mannschaft> mannschaftMap = new HashMap<>();
        mannschaftMap.put(mannschaftA.getName(), mannschaftA);
        mannschaftMap.put(mannschaftB.getName(), mannschaftB);
        mannschaftMap.put(mannschaftC.getName(), mannschaftC);

        try(Scanner scann = new Scanner(System.in)) {
            System.out.print("Mannschaft: ");
            String mannschftName = scann.nextLine();

            if(mannschaftMap.containsKey(mannschftName)) {
                Mannschaft mannschaft = mannschaftMap.get(mannschftName);
                System.out.println(mannschaft);
            }
        }

    }
}
