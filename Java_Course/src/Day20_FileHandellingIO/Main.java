package Day20_FileHandellingIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{    // TRY CATCH THROW LEKHNA PARDAINA ;

//      creating new file

            File file = new File("Anjan.txt");

            file.createNewFile();

//      WRITE something on this file

            FileWriter fileWriter = new FileWriter("Anjan.txt");  // PEN HO YO
            fileWriter.write("lekhdai xu hai mah ");
            fileWriter.close();


//      read something on this file

        FileReader fileReader = new FileReader("Anjan.txt");
          int value;
                while(( value = fileReader.read())!= -1)
                {  // one by one read garxa
                    System.out.print((char)value);
                }

//      File delete vayena vane file reader ra writer lai close garne

//      file delete garxa

           file.delete();
    }
}
