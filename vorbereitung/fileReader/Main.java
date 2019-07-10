package fileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReader read = new FileReader("test.txt");

        char[] arr = new char[30];

        read.read(arr, 0, 30);

    }

}
