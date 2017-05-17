package com.cesi.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by kriyss on 17/05/17.
 */
public class Server {

    private ServerSocket serverSocket;

    public static void main(String[] args) throws IOException {

        Server server = new Server();
        server.serverSocket = new ServerSocket(3000);


        while (true) {
            Socket client = server.serverSocket.accept();
            System.out.println("CONNECTED");
            PrintWriter writer = new PrintWriter(
                    client.getOutputStream());
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            client.getInputStream()));

            String received = reader.readLine();
            writer.println("5/5 : "+ received);
            writer.flush();
        }
    }
}
