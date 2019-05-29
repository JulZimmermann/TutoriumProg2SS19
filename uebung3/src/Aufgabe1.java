import java.io.*;

public class Aufgabe1 {

    public static void main(String[] args) {
        createFile();
        countB();
    }

    private static void createFile() {
        try(BufferedWriter fw = new BufferedWriter(new FileWriter("somefile.txt"))) {
            fw.write("Test mit 5 b's: 2. b a\n3b\n a 4b a 5b");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void countB() {
        try (BufferedReader reader = new BufferedReader(new FileReader("somefile.txt"))) {
            long count = 0;
            String line = reader.readLine();

            while (line != null) {
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == 'b') {
                        count++;
                    }
                }

                line = reader.readLine();
            }

            System.out.printf("Anzahl der b's: %d%n", count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
