package Day09_Opps;

public class Shape {
    public String sq;
    int width;
    int length ;


    // default constructor
    Shape(){
        width =10;
        length =10;
    }


    //Parameterized Constructor
    Shape(int a, int b){
        width =a;
        length =b;
    }


    public void area(){
        int a = width * length;
        System.out.println("The area of the shape is: "+ a);

    }

}
