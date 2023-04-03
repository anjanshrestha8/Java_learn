package Day22_Object_Serialization;

import java.io.Serializable;

public class Person implements Serializable {
    int age = 10;
    String name ="Anjan";
    double height = 5.6;
    String getName(){
        return name;
    }
    int getAge() {
        return age;
    }
}
