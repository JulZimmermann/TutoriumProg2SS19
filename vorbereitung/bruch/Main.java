package bruch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Bruch> bruche = new ArrayList<>();

        bruche.add(new Bruch(1, 4));
        bruche.add(new Bruch(2, 3));
        bruche.add(new Bruch(1, 8));
        bruche.add(new Bruch(-4, 5));

        Collections.sort(bruche);

        for(Bruch bruch : bruche) {
            System.out.println(bruch);
        }

    }

}
