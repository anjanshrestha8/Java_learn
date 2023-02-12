import java.util.Scanner;
public class PersonalInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur name");
        String a = sc.nextLine();
        System.out.println("Enter ur age");
        int b= sc.nextInt();
        System.out.println("Enter ur ph no");
        double c= sc.nextDouble();
        System.out.println("Enter your address");
        String d= sc.nextLine();
        //display ur info
        System.out.println("name:-"+a);
        System.out.println("age:-"+b);
        System.out.println("ph:-"+c);
        System.out.println("address:-"+d); 
    }
}
