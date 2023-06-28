package n49_throw_structure;

public class n49_throw_structure {

    public int studentAge;





    public static void main(String[] args){

        n49_throw_structure objN49 = new n49_throw_structure();

        objN49.studentAge = 10;

        if(objN49.studentAge == 50){
            System.out.println("Yes");
        }else{
            System.out.println("Not");
            throw new IllegalArgumentException("DEĞİL BRO DEĞİL");
        }


    }



}
