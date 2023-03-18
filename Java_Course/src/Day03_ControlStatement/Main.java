package Day03_ControlStatement;

public class Main {
    public static void main(String[] args) {

       // if conditional


//        int age =40;
//        if(age==40){
//            System.out.println("I will marry.");
//        }
//        else {
//            System.out.println("I will buy house ");
//        }


        // else if


//        int age=60;
//        if(age==40){
//            System.out.println("I will marry.");
//        }
//        else if(age ==60){
//            System.out.println("I will retire.");
//        }
//        else {
//            System.out.println("I will buy house.");
//        }

        // switch case
        int age=40;
        switch(age){
            case 40:
                System.out.println("I will marry.");
                break;
            case 60:
                System.out.println("I will retire.");
                break;
            default:
                System.out.println("I will buy a house.");
                break;
        }
    }
}