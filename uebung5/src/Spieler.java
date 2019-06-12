public class Spieler {
    private String name;
    private int ranking;

    public Spieler(String name, int ranking) {
        this.name = name;
        this.setRanking(ranking);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRanking() {
        return ranking;
    }

    public final void setRanking(int ranking) {
        if (ranking <= 0 || ranking > 10)
            throw new IllegalArgumentException("Ranking must be in range [1, 10].");
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return String.format("Spieler %s mit Ranking %d", getName(), getRanking());
    }
}
