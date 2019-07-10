package sockets;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        try(ServerSocket server = new ServerSocket(8080)) {
            Socket socket = server.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            while (true) {
                String line = br.readLine();
                System.out.println(line);
                bw.write("OK");
                bw.newLine();
                bw.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
