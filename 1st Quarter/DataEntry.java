import java.util.Scanner;  // use the Scanner class for input

/*
  The Scanner class has the following methods:
     next()       - enter a word
     nextLine()   - enter a sentence
     nextInt()    - enter an integer data
     nextFloat()  - enter a float data
     nextDouble() - enter a double data
*/

public class DataEntry {

    public static void main(String[] args) {

        int intNumerator, intDenominator;
        float fltQuotient;

        fltQuotient = intNumerator = intDenominator = 0;

        Scanner objEnterData = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        intNumerator = objEnterData.nextInt();  // accept integer input
     
        System.out.println("Enter denominator: ");
        intDenominator = objEnterData.nextInt();

        fltQuotient = intNumerator / intDenominator;
 
        System.out.println("\nQuotient is " + fltQuotient);

    }  // public static void main(String[] args)

}  // public class DataEntry