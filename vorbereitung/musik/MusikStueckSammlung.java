package musik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MusikStueckSammlung {

    private HashMap<String, MusikStueck> musikStuecke;

    public MusikStueckSammlung() {
        musikStuecke = new HashMap<>();
    }

    public void musikStueckEinfügen(MusikStueck neu) throws IllegalArgumentException {
        if(musikStuecke.containsKey(neu.getTitel())) {
            throw new IllegalArgumentException("Musikstück bereits vorhanden");
        }

        musikStuecke.put(neu.getTitel(), neu);
    }

    public MusikStueck[ ] getAlleMusikStueckeNachTitel() {
        MusikStueck[] array = musikStuecke.values().toArray(new MusikStueck[1]);

        Arrays.sort(array, new VergleicheMusikStueckTitel());

        return array;
    }

}
