package roulette;

import java.util.Iterator;

public class RouletteZahlenIterator implements Iterator<Integer> {

    int count = 0;

    @Override
    public boolean hasNext() {
        return count != 3;
    }

    @Override
    public Integer next() {
        int i =  (int) (Math.random() * 37);

        if(i == 0) {
            count++;
        }

        return i;
    }

}
