package n36_java_polymorphism;

public class MainOfMyClass {



    // polymorphism



    public static void main(String[] args) {


        // create a object for Pig , Dog , Animal
        Pig_Animal pigObject = new Pig_Animal();
        Dog_Animal dogObject = new Dog_Animal();
        Animal animalObject = new Animal();



        pigObject.animalSound();
        dogObject.animalSound();
        animalObject.animalSound();


        System.out.println();
        System.out.println("end");









    }













}
