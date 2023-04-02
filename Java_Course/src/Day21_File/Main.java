package Day21_File;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/Day21_File/day21.txt");
        file.createNewFile();
//        write files
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("day 21 course is about file handeling.");
        fileWriter.close();
//        read line using buffer
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferReader = new BufferedReader(fileReader);
        String line = bufferReader.readLine();
        while (line !=null){
            System.out.println(line);
            line = bufferReader.readLine();
        }

    }
}
