import java.util.*;

@SuppressWarnings("Duplicates")
public class Aufgabe2 {

    public static void main(String[] args) {
        Map<String, Mannschaft> map = createMap();

        List<Mannschaft> manschaften = new ArrayList<Mannschaft>(map.values());

        Collections.sort(manschaften);

        int i = 1;
        for(Mannschaft mannschaft : manschaften) {
            System.out.printf("%d. %s (%.2f)%n", i, mannschaft.getName(), mannschaft.getDurchschnittsRanking());

            List<Spieler> spielerList = mannschaft.getSpielerList();

            spielerList.sort((a, b) -> b.getName().compareTo(a.getName()));

            for(Spieler spieler : spielerList) {
                System.out.printf("\t%s mit Ranking %d%n", spieler.getName(), spieler.getRanking());
            }

            i++;
        }

    }

    public static Map<String, Mannschaft> createMap() {
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

        return mannschaftMap;
    }

}
