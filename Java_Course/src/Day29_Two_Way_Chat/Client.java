package Day29_Two_Way_Chat;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        System.out.println("Client");
        try {


//            localhost ko ip address = 127.0.0.1
            Socket socket= new Socket("127.0.0.1",11111);

            BufferedReader socketDataReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //              this is for asking inoput from user
            BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));

            // I need a pen to write a message
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream);
            String sendingMessage, receivingMessage;
            while(true){

                // receiving message;

                receivingMessage = socketDataReader.readLine();
                System.out.println("Server : "+ receivingMessage);


                // sending message;
                sendingMessage= userInputReader.readLine();  // get input from user
                printWriter.println(sendingMessage);
                printWriter.flush();



            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
