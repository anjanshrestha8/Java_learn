package Day01_Intro;

import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Enter your name.");
        Scanner inputObj = new Scanner(System.in);
        String name =inputObj.next();
        System.out.println("Your name is "+name);
    }
}