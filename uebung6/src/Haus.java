import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Haus implements Comparable<Haus>, Iterable<Raum> {
    private List<Stockwerk> stockwerkList = new ArrayList<>();
    private String addresse;

    public Haus(String addresse) {
        this.addresse = addresse;
    }

    @Override
    public String toString() {
        return "Haus{" +
                "addresse='" + addresse + '\'' +
                '}';
    }

    public Haus addStockwerk(Stockwerk sw) {
        this.stockwerkList.add(sw);
        return this;
    }

    public int getQuadratmeterSumme() {
        return this.stockwerkList.stream().mapToInt(Stockwerk::getQuadratmeterSumme).sum();
    }

    @Override
    public int compareTo(Haus o) {
        return this.getQuadratmeterSumme() - o.getQuadratmeterSumme();
    }

    @Override
    public Iterator<Raum> iterator() {
        return new Iterator<Raum>() {
            private int currentStockwerk = 0;
            private int currentRaum = 0;

            @Override
            public boolean hasNext() {
                if(currentStockwerk < stockwerkList.size() - 1) {
                    return true;
                }

                return currentRaum < stockwerkList.get(currentStockwerk).getRaumAnzahl() - 1;
            }

            @Override
            public Raum next() {
                Raum raum = stockwerkList.get(currentStockwerk).getRaum(currentRaum);

                currentRaum++;

                if(currentRaum == stockwerkList.size()) {
                    currentStockwerk++;
                    currentRaum = 0;
                }

                return raum;
            }
        };
    }
}
