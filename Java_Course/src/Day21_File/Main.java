package Day21_File;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/Day21_File/day21.txt");
        file.createNewFile();
//        write files
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("day 21 course is about file handeling.");
        fileWriter.close();
//        read line using buffer
       // FileReader fileReader = new FileReader(file);
        BufferedReader bufferReader = new BufferedReader(new FileReader(file));
        String line = bufferReader.readLine();
        while (line !=null){
            System.out.println(line);
            line = bufferReader.readLine();
        }

//        Scanner sc = new Scanner("day21.txt");
//        while(sc.hasNextLine()){
//            String line1 = sc.nextLine();
//            System.out.println(line1);
//        }

    }
}
