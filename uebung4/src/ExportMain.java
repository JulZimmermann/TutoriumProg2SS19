import com.sun.corba.se.impl.orbutil.ObjectWriter;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ExportMain {


    public static void main(String[] args) {
        Auto[] huberAutos = {
                new Auto(100, "VW", "Golf", 2000, "DE FG 1234"),
                new Auto(300, "Honda", "Civic", 2010, "DE AH 1234"),
                new Auto(400, "Porsche", "911", 1990, "DE FG 1255"),
        };

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("out.dat"))) {
            for (Auto huberAuto : huberAutos) {
                oos.writeObject(huberAuto);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
