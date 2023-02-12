import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
    // making scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        System.out.println("Enter the number");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("The sum of the number is "+sum);
    }
}
