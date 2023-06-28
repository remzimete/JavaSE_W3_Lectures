package n05_java_variables_multiple;

public class Main {

    public static void main(String[] args) {
        int x2,y2,z2 = 55+55+55;

        System.out.println(z2);

        /* aynı anda birden fazla variable tanımlayıp değer atarken
        en son kim tanımlanmışsa ona değer atanıyor.
        hepsine aynı anda aynı değer atanmış olmuyor.

         */

        int x3 = 0,y3 = 1,z3 = 2; // her birine ayrı değer atandı
        System.out.println(x3+y3+z3); // sonuç 3 olarak döndürür. çünkü tamamen hepsi sayı ve matematiksel olarak algılanıyo

        int x4,y4,z4;
        x4 = y4 = z4 = 50;
        System.out.println(x4+y4+z4);


        /* bence en iyi variable tanımlama şekli */
        int var1,var2,var3;
        var1 = 1;
        var2 = 2;
        var3 = 3;



    }

}
