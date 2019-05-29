import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ImportMain {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("out.dat"))) {
            boolean eof = false;

            while (!eof) {
                try {
                    Object o = ois.readObject();
                    if (o instanceof Auto) {
                        Auto auto = (Auto) o;
                        System.out.printf("%s %s mit %d PS aus dem Jahr %d mit dem Kennzeichen %s\n",
                                auto.getMarke(), auto.getModell(), auto.getPs(), auto.getYear(), auto.getKennzeichen()
                        );
                    }
                } catch (EOFException e) {
                    eof = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Die Datei ist ungültig!");
            e.printStackTrace();
        }
    }
}
