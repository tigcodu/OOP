/*
  An array is a collection of the same datatype of fixed length

  The two types of arrays are:
    - simple - one dimensional array
    - complex or multidimensional
*/

public class Array1 {

    public static void main(String[] args) {

        int[] objEven = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
    
        int[] objOdd = new int[8];  // declaration
        
        // initialization
        objOdd[0] = 1; // zero-based index
        objOdd[1] = 3;
        objOdd[2] = 5;
        objOdd[3] = 7;
        objOdd[4] = 9;
        objOdd[5] = 11;
        objOdd[6] = 13;
        objOdd[7] = 15;
        //objOdd[8] = 17; // array out of bounds exception (error)

        System.out.print("Displaying even numbers: ");
        // for-loop condition (initialization; condition; iteration)
        //  the property length determines the size of an array
        for (int intCounter = 0; intCounter < objEven.length; intCounter++) {

            System.out.print(objEven[intCounter] + " ");

        }  // for (int intCounter = 0; intCounter < objEven.length; intCounter++)

        System.out.println("\n\nDisplaying odd numbers: ");
        /*
        for (int intCounter = 0; intCounter < objOdd.length; intCounter++) {
            System.out.println(objOdd[intCounter]);
        }  // for (int intCounter = 0; intCounter < objOdd.length; intCounter++)
        */
        // utilizing the for-each loop
        for (int intValue : objOdd) {

            System.out.print(intValue + " ");

        }  // for (int intValue : objOdd)

    }  // public static void main(String[] args)

}  // public class Array1