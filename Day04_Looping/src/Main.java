public class Main {
    public static void main(String[] args) {

        // for loop
//        int i=1;
//        for(i=1;i<=100;i++){
//            System.out.println("the loop run into:"+i+"times");
//        }

        //while loop
        int i=1;
        int money=1;
        while(i<=10){
            i++;
            money*=i;
        }
        System.out.println(money);
    }
}