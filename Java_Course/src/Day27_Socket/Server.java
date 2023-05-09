package Day27_Socket;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args){
        System.out.println("Server");
        try {
            ServerSocket serversocket = new ServerSocket(12345);
            serversocket.accept();
            System.out.println("Connection established");
        } catch (IOException e) {
            System.out.println("Connection is not established");
            throw new RuntimeException(e);
        }
    }
}
