package Day07_String;

public class Main {
    public static void main(String[] args) {
        String name = "Anjan ";

     // modify name;
        name+= "Shrestha";
        System.out.println(name);

        // This will create the new instance of the sring
        String name2= new String("Hello World");

        // buffer concept

        StringBuffer name3 = new StringBuffer("Anjan ");
        name3.append("Shrestha");
        System.out.println(name3);


    }
}