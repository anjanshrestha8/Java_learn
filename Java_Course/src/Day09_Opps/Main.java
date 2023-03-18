package Day09_Opps;

public class Main {
    public static void main(String[] args) {
    Shape obj = new Shape();  // Here the shape is a new class with new object obj.


//Default Constructor
        System.out.println("The width of the shape is:  "+ obj.width);
        System.out.println("The length os the shape is: " + obj.length);
        obj.area();


//         Parameterized Constructor
         Shape obj1 =new Shape(20,30);
        System.out.println("The width of the shape is:  "+ obj1.width);
        System.out.println("The length os the shape is: " + obj1.length);
        obj1.area();
    }
}