package n22_multi_dimensional_arrays;

public class MainOfMyClass {

    public static void main(String[] args) {

        // identify an multidimensional array
        int[][] myArrays = {
                {1242141,235325,235235,2352352},
                {252552,2525252,2525252,2525252}
        };

        // accessing an array

        System.out.println(myArrays[0][0]);
        System.out.println(myArrays[0][1]);
        System.out.println(myArrays[1][1]);

        // identify an new multi-dimensional array
        int[][] myNumbers = {
                              {0,1,2,3},
                              {4,5,6}
                            };

        // changing an array
        System.out.println(myNumbers[0][0]);
        myNumbers[0][0] = 99;
        System.out.println(myNumbers[0][0]);


        // for-loop for myNumbers for all elements
        for (int i = 0; i < myNumbers.length; i++) { // calculate size of array how many array at there
            for (int j = 0; j < myNumbers[i].length; j++) { // calculate size of elements that inside of the array
                System.out.println(myNumbers[i][j]);
            }
        }




    }

}
