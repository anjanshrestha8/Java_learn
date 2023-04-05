package Day22_Object_Serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Serialization
        FileOutputStream fileOutputStream = new FileOutputStream("src/Day22_Object_Serialization/anjan.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        Person obj = new Person();
        objectOutputStream.writeObject(obj);

//        Deserialization
        FileInputStream fileInputStream = new FileInputStream("src/Day22_Object_Serialization/anjan.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person obj1 =(Person) objectInputStream.readObject();
        obj1.getAge();
        obj1.getName();



    }
}
