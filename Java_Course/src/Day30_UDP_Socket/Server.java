package Day30_UDP_Socket;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        // datagramSocket new socket is made
        DatagramSocket socket = new DatagramSocket();
        InetAddress address = InetAddress.getByName("localhost");
        //String message = "Hello World";

        // sending packing via socket
        Scanner input= new Scanner(System.in);

     while(true){
         String inputMessage = input.nextLine();
         DatagramPacket packet = new DatagramPacket(inputMessage.getBytes(),inputMessage.length(),address,12345);

         System.out.println("Sending Message......");
         socket.send(packet);
     }



    }
}
