package roulette;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        RouletteZahlen rouletteZahlen = new RouletteZahlen();

        for(Integer number :  rouletteZahlen) {
            System.out.println(number);
        }

        Iterator<Integer> it = rouletteZahlen.iterator();
        while (it.hasNext()) {
            int number = it.next();
            System.out.println(number);
        }

    }

}
