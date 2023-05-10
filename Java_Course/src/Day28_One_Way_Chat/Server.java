package Day28_One_Way_Chat;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {


        System.out.println("Server");
        try {
            ServerSocket serversocket = new ServerSocket(1000);
            Socket socket = serversocket.accept();
            System.out.println("Connection established......");

            // user le input dinxa tei lai nai clinet lai sent garne
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the message..");



            OutputStream outputStream = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(outputStream,true);
            pw.println("Welcome to my server");

           while(true){
               String a = input.nextLine();
               pw.println(a); // user le haleko message lai server bata message ko through pathauxa

           }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
