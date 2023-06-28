package n29_oop_access_methods_with_an_object;

import n01_JAVA_HOME.Main;

public class MainOfMyClass_N29 {

    // fullThrottle
    // speed

    public void fullThrottle(){
        System.out.println("The car is going fast as it can");
    }
    //create a speed() method and add a parameter
    public void speed(int maxSpeed){
        System.out.println("max Speed İs : "+  maxSpeed);
    }


    public static void main(String[] args) {

        MainOfMyClass_N29 myCarObj = new MainOfMyClass_N29();
        myCarObj.fullThrottle();
        myCarObj.speed(200);

    }

}


// the car is going as fast as it can!
// max speed is : 200