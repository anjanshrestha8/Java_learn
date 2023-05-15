package Day30_UDP_Socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("Client Start");
        DatagramSocket socket = new DatagramSocket(12345);
        byte[] dataPacket = new byte[1024];
        DatagramPacket packet = new DatagramPacket(dataPacket,dataPacket.length);

       while(true){
           socket.receive(packet);
           System.out.println(packet);
           String recievePacket =new String(packet.getData(),0,packet.getLength());
           System.out.println(recievePacket);
       }
    }

}
