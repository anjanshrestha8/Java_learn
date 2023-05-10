package Day28_One_Way_Chat;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost",1000);

            InputStream inputstream =socket.getInputStream(); // byte information

            InputStreamReader inputStreamReader = new InputStreamReader(inputstream);

            //      message from server

            //   System.out.println((char) inputStreamReader.read());

            int a = inputStreamReader.read();
           while(true){
               while(a!= -1){
                   System.out.print((char) a);
                   a = inputStreamReader.read();
               }
           }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
