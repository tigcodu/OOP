/*
  program that demonstrates the use of multi-dimensional array
    Two Dimension
    e.g.    
      array[R][C] **
    
    ** R - row
       C - column

*/

public class Array2 {

    public static void main(String[] args) {
        
        // declaration - 5 rows, 2 columns
        float[][] objProduct = new float[5][2];

        // initialization
        objProduct[0][0] = 1001f;  // row 1 col 1
        objProduct[0][1] = .34f;  // row 1 col 2
        objProduct[1][0] = 1002f;  // row 2 col 1
        objProduct[1][1] = 2.75f;  // row 2 col 2
        objProduct[2][0] = 1003f;
        objProduct[2][1] = .45f;
        objProduct[3][0] = 1004f;
        objProduct[3][1] = 1.67f;
        objProduct[4][0] = 1005f;
        objProduct[4][1] = .83f;

        // the ".length" of the outer loop determines the number of rows
        for (int intRow = 0; intRow < objProduct.length; intRow++) {

            System.out.println("\nRow " + (intRow + 1));

            // the ".length" of the inner loop determines the number of columns 
            for (int intCol = 0; intCol < objProduct[0].length; intCol++) {

                System.out.print((intCol == 0 ? "ID: " : " | Price: ") + 
                                 objProduct[intRow][intCol]);

            }  // for (int intCol = 0; intCol < objProduct[0].length; intCol++)
       
        }  // for (int intRow = 0; intRow < objProduct.length; intRow++) 

    }  // public static void main(String[] args)

}  // public class Array2