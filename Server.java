package Homework;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Server {
    public static int portNumber = 4444;
    public static void main(String[] args) throws IOException {

        java.net.ServerSocket serverSocket = new java.net.ServerSocket(portNumber);

    }
    public static void accept(ServerSocket serverSocket) {
        ArrayList<ClientThread> clients = new ArrayList<ClientThread>();
        while (true) {
            try {
                Socket socket = serverSocket.accept();
                ClientThread client = new ClientThread(socket);
                Thread thread = new Thread(client);
                thread.start();
                clients.add(client);
            }catch (IOException e) {
                System.out.println("Accept failed on: "+ portNumber);
            }
        }
    }

}
