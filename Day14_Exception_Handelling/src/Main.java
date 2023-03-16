public class Main {
    public static void main(String[] args) {
        try{
            int divider=0;
            int value =100;
            int result = value/divider;
            if(divider ==0){
                throw new Exception();    // problem xa vane tha xa vane throw use garne
            }
            System.out.println("result"+result);
//        ----


        }catch(Exception error) {
            System.out.println("error" +error);
        }finally {
            System.out.println("this is finally ");
        }
        anotherWork();
    }

    static void anotherWork() {
        System.out.println("Another Work");
    }
}