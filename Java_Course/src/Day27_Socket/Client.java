package Day27_Socket;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args){
        System.out.println("Client");
        try {
            Socket socket = new Socket("localhost",12345);
        } catch (IOException e) {
            System.out.println("Connection is not established");
            throw new RuntimeException(e);
        }
    }
}
