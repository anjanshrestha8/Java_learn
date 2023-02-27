
// Arrays are  like boxes of a fixed size,
// while Vectors are like expandable boxes that can grow or shrink as needed.

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        // this is a fixed length array.
        int[] age ={10,20,30}; // length =3
        Vector age2 =new Vector(); // initial capacity =10;
        age2.add(10);
        age2.add(20);
        age2.add(30);
        age2.add(40);
        age2.add(50);
        age2.add(50);
        age2.add(50);
        age2.add(50);
        age2.add(50);
        age2.add(50);
        age2.add(50);
        age2.add(50);
        age2.add(50);
        age2.add(50);
        age2.add(50);
        age2.add(50);
        age2.add(50);
        age2.add(50);

        System.out.println(age.length); // finds age length
        System.out.println(age2);
        System.out.println("Data in vector-->" +age2.capacity());


       // Vector age3 =new Vector(3); // initial capacity =3;
        //  System.out.println(age3.capacity());


    }
}