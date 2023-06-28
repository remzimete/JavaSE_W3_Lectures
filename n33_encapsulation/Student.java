package n33_encapsulation;

public class Student {


    // Student ID
    /*
    Name
    Surname
    Age
    Class
    Major
    *
    * */

    private int student_ID;
    private String student_Name;
    private String student_Surname;
    private int student_Age;
    private String student_Class;
    private String student_Major;



    Student(int sID,String sName,String sSurName,int sAge,String sClass,String sMajor){
        this.student_ID = sID;
        this.student_Name = sName;
        this.student_Age = sAge;
        this.student_Class = sClass;
        this.student_Major = sMajor;

    }


    // Sets

    public void set_Student_ID(int set_ID){
        student_ID = set_ID;
    }

    public void set_Student_Name(String set_Name){
        this.student_Name = set_Name;
    }

    public void set_Student_SurName(String set_SurName){
        this.student_Surname = set_SurName;
    }

    public void set_Student_Age(int set_Age){
        this.student_Age = set_Age;
    }

    public void set_Student_Class(String set_Class){
        this.student_Class = set_Class;
    }

    public void set_Student_Major(String set_Major){
        this.student_Major = set_Major;
    }



    //Gets


    public int get_Student_ID(){
        return this.student_ID;
    }

    public String get_Student_Name(){
        return this.student_Name;
    }

    public String get_Student_Surname(){
        return this.student_Surname;
    }

    public int get_Student_Age(){
        return this.student_Age;
    }
    public String get_Student_Class(){
        return this.student_Class;
    }

    public String get_Student_Major(){
        return this.student_Major;
    }











}
