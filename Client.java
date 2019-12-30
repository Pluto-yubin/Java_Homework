package Homework;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException, InterruptedException {
        int portNumber = 4444;
        Socket socket = new Socket("localhost", portNumber);
        Thread.sleep(1000);
        
    }
}
