import java.util.ArrayList;
import java.util.OptionalDouble;

public class Mannschaft {
    private String name;
    private ArrayList<Spieler> spielerList = new ArrayList<>();

    public Mannschaft(String name) {
        this.name = name;
    }

    public ArrayList<Spieler> getSpielerList() {
        return spielerList;
    }

    public String getName() {
        return name;
    }

    public Mannschaft setName(String name) {
        this.name = name;
        return this;
    }

    // Fluent adder ( returning this )
    public Mannschaft addSpieler(Spieler newSpieler) {
        this.spielerList.add(newSpieler);
        return this;
    }

    public double getDurchschnittsRanking() {
        if(spielerList.isEmpty()) {
            return 0;
        }

        int summ = 0;

        for(Spieler spieler : spielerList) {
            summ +=  spieler.getRanking();
        }

        return summ / (double) spielerList.size();
    }

    /*
    public double getDurchschnittsRanking() {
        OptionalDouble average = this.spielerList.stream().mapToInt(Spieler::getRanking).average();
        return average.orElse(0);
    }
     */

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for(Spieler spieler : getSpielerList()) {
            stringBuilder.append(String.format("%s%n", spieler.toString()));
        }

        stringBuilder.append(String.format("Durchschnittsranking: %s%n", getDurchschnittsRanking()));

        return stringBuilder.toString();
    }
}


