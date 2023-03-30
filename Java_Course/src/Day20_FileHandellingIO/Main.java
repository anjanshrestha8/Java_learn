package Day20_FileHandellingIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

//        creating new file

        File file = new File("Anjan.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File create vayena ");
        }

        //        WRITE something on this file
        try {
            FileWriter fileWriter = new FileWriter("Anjan.txt");  // PEN HO YO
            fileWriter.write("lekhdai xu hai mah ");
            fileWriter.close();
        } catch (Exception e) {
            System.out.println(e);
        }

//        read something on this file
        try {
            FileReader fileReader = new FileReader("Anjan.txt");
          int value;
                while(( value = fileReader.read())!= -1){  // one by one read garxa
                    System.out.print((char)value);
                }
        }catch (Exception e) {
            System.out.println(e);

        }
//        file delete garxa
        file.delete();
    }
}
