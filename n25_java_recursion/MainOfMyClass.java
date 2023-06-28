package n25_java_recursion;

public class MainOfMyClass {

    public static void main(String[] args) {


        int result = sum(100);

        int result2 = sum2(0,10);
        System.out.println(result2);


    }

    public static int sum(int k){

        if(k>0){
            return k + sum(k - 1);
        }else {
            return 0;
        }
    }

    public static int sum2(int start,int end){
        if(end > start){
            return end + sum2(start , end - 1);
        }else{
            return end;
        }

    }


}
