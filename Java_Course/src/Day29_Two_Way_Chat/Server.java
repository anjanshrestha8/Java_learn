package Day29_Two_Way_Chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        System.out.println("Server");
        try {
            ServerSocket serverSocket = new ServerSocket(11111);
            Socket socket = serverSocket.accept();
            System.out.println("Connection Established.....");

            // aako data lai caputer garne kam garxa

            // inputstreamreader ma vako data lai display garne kam garxa


            // this is foe getting scoket value (message)
            BufferedReader socketDataReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //              this is for asking inoput from user
            BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));

            // I need a pen to write a message
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream);
            String sendingMessage, receivingMessage;
            while(true){

                // sending message;
                sendingMessage= userInputReader.readLine();  // get input from user
                printWriter.println(sendingMessage);
                printWriter.flush();


                // receiving message;

                receivingMessage = socketDataReader.readLine();
                System.out.println( "Client : "+ receivingMessage);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
