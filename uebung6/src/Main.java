import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Haus haus1 = new Haus("Baumstraße 3, Holzhausen")
                .addStockwerk(
                        new Stockwerk()
                                .addRaum(new Raum(10))
                                .addRaum(new Raum(20))
                                .addRaum(new Raum(30))
                )
                .addStockwerk(
                        new Stockwerk()
                                .addRaum(new Raum(8))
                                .addRaum(new Raum(6))
                                .addRaum(new Raum(4))
                );

        Haus haus2 = new Haus("Baumstraße 5, Holzhausen")
                .addStockwerk(
                        new Stockwerk()
                                .addRaum(new Raum(33))
                                .addRaum(new Raum(66))
                                .addRaum(new Raum(10))
                )
                .addStockwerk(
                        new Stockwerk()
                                .addRaum(new Raum(3))
                                .addRaum(new Raum(4))
                                .addRaum(new Raum(5))
                );

        List<Haus> haeuser = new ArrayList<>();
        haeuser.add(haus1);
        haeuser.add(haus2);

        for (Haus haus : haeuser) {
            System.out.println(haus.toString());
            for (Raum raum : haus) {
                System.out.println(raum.toString());
            }
        }
    }
}
