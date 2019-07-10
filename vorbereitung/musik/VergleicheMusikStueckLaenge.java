package musik;

import java.util.Comparator;

public class VergleicheMusikStueckLaenge implements Comparator<MusikStueck> {

    @Override
    public int compare(MusikStueck o1, MusikStueck o2) {
        return o1.getLaenge() - o2.getLaenge();
    }

}
