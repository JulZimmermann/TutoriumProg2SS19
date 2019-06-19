import java.util.ArrayList;
import java.util.List;

public class Stockwerk {
    private List<Raum> raumList = new ArrayList<>();

    public Stockwerk addRaum(Raum rm) {
        this.raumList.add(rm);
        return this;
    }

    public int getQuadratmeterSumme() {
        return this.raumList.stream().mapToInt(Raum::getGroesse).sum();
    }

    public int getRaumAnzahl() {
        return this.raumList.size();
    }

    public Raum getRaum(int id) {
        return this.raumList.get(id);
    }
}
