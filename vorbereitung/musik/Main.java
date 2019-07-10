package musik;

public class Main {

    public static void main(String[] args) {
        MusikStueckSammlung sammlung = new MusikStueckSammlung();

        sammlung.musikStueckEinfügen(new MusikStueck("xyz", "abc", 1));
        sammlung.musikStueckEinfügen(new MusikStueck("sadas", "rtr", 5));
        sammlung.musikStueckEinfügen(new MusikStueck("fjhfj", "zuzj", 6));

        MusikStueck[] array = sammlung.getAlleMusikStueckeNachTitel();

        for(MusikStueck musikStueck : array) {
            System.out.println(musikStueck);
        }

    }

}
