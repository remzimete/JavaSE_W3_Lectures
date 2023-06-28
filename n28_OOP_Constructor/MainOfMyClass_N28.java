package n28_OOP_Constructor;

public class MainOfMyClass_N28 {


    public static void main(String[] args) {

        MainOfMyClass_N28 objName = new MainOfMyClass_N28(25);
        System.out.println(objName.x);


    }
    int x;

    public MainOfMyClass_N28(int y){
        x = y;
    }
}
