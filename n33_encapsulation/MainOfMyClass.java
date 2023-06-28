package n33_encapsulation;

public class MainOfMyClass {


    public static void main(String[] args) {
        Student objStudent = new Student(5,"Mete","Specter",19,"12/A","Information Technology");


        System.out.println(objStudent.get_Student_ID());
        objStudent.set_Student_ID(55);
        System.out.println(objStudent.get_Student_ID());


    }


}
