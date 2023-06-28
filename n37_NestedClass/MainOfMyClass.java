package n37_NestedClass;

public class MainOfMyClass {


    public static void main(String[] args) {


        // create an object of OuterClass and InnerClass

        OuterClass objOuterClass = new OuterClass();
        OuterClass.InnerClass objInnerClass = objOuterClass.new InnerClass();
        System.out.println(objInnerClass.y + objOuterClass.x);




    }









}
