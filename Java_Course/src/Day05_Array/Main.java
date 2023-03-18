package Day05_Array;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // array syntax

//        int[] x = new int[5];
//        int [] y={10,20,30};
//        System.out.println(y[]); print array memory address;
//        System.out.println(y[0]); prints array index value;

        int[] x= new int[5];
        int i=0;
        System.out.println("Enter the numbers.");
        for(i=0;i<5;i++){
            Scanner inputObj = new Scanner(System.in);
            x[i] = inputObj.nextInt();

        }
//        for each syntax
//        for(data type element : array name)
        for(int element : x){
            System.out.println(element);
        }

    }
}