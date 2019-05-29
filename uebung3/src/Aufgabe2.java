import java.io.*;

public class Aufgabe2 {

    public static void main(String[] args) {
        try (Writer cr = new CaesarWriter(new FileWriter("out1.txt"), 5)) {
            cr.write("Hallo");
        } catch (IOException e) {
            System.out.println("Fehler beim Caesar File schreiben");
        }

        // and some to the console...
        try (Writer cr = new CaesarWriter(new OutputStreamWriter(System.out), 10)) {
            cr.write("Dies ist eine sehr geheime Nachricht!");
        } catch (IOException e) {
            System.out.println("Fehler beim Caesar Ausgeben");
        }
    }
}