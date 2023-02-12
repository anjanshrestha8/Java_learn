import java.util.Scanner;
public class FullName {
    public static void main(String[] args) {
        // making scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur first name");
        String f=sc.nextLine();
        System.out.println("Enter ur last name ");
        String g=sc.nextLine();
        System.out.println("My name is "+f+" "+g);
    }
}
