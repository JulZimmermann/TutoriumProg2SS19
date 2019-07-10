package streams;

import java.io.*;
import java.nio.Buffer;

public class AufgabeA {

    public static void main(String[] args) {

    }

    static int liesWerteAusIntDatei(String dateiname) {
        int count = 0;

        try (FileInputStream fis = new FileInputStream(dateiname)) {
            int i = fis.read();
            while (i != -1) {
                count += i;
                i = fis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return count;
    }

    static double liesWerteAusSystemIn() {
        double sum = 0;
        int count = 0;

        try(BufferedReader rd = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String str = rd.readLine();
                try {
                    double d = Double.parseDouble(str);
                    sum += d;
                    count++;
                } catch (NumberFormatException e) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sum / count;
    }

}
