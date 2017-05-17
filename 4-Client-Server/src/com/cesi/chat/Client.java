package com.cesi.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by kriyss on 17/05/17.
 */
public class Client {
    private Socket socket;

    public static void main(String[] args) throws IOException, InterruptedException {
        Client client = new Client();
        client.socket = new Socket("127.0.0.1", 3000);
        System.out.println("CONNECTED TO SERVER");

        PrintWriter writer = new PrintWriter(
                client.socket.getOutputStream());
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        client.socket.getInputStream()));
        writer.println("Client 1");
        writer.flush();
        System.out.println("from Server : " + reader.readLine());
    }
}
