public class Rectangle implements Shape,Another_Shape {
    public void getArea(int a ,int b) {

        System.out.println("It's area is :" + a*b);  // rectangle inherits shape

    }
    public void name(){
        System.out.println("It is a rectangle");
    }
    public void getColor(){
        System.out.println("its black in colour.");
    }
}
