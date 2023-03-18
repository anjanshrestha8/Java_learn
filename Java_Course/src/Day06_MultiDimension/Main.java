package Day06_MultiDimension;

public class Main {
    public static void main(String[] args) {
        int[] x ={10,20,30}; // simple array;
        int [][] y={{10,20,30},
                    {40,50,60}};  // multi dimensional array;


//        System.out.println(x[1]);
//        System.out.println(y[0][1]);


        // for loop for print sigle dimension array;
//        for(int i =0;i<=2;i++){
//            System.out.println(x[i]);
//        }


        //  for loop for print multi dimension array;


//        System.out.println(y.length); // length helps o find length of array

        // printing multi dimensional array using length function

        for(int i=0;i<y.length;i++){
            for(int j=0;j<y[i].length;j++){
                System.out.println(y[i][j]);
            }
            System.out.println("\n");
        }
    }
}