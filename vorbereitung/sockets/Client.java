package sockets;

import java.io.*;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {

        try (Socket socket = new Socket("localhost", 8080)) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader br2 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            while (true) {
                String str = br.readLine();
                bw.write(str);
                bw.newLine();
                bw.flush();

                String str2 = br2.readLine();
                System.out.println(str2);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
