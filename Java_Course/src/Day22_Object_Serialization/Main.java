package Day22_Object_Serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputtream = new FileOutputStream("src/Day22_Object_Serialization/anjan.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputtream);
        Person obj = new Person();
        objectOutputStream.writeObject(obj);
    }
}
