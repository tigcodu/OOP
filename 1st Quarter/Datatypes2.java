/*
  A wrapper class is a datatype that can have methods
*/

public class Datatypes2 {

    public static void main(String[] args) {

        String strName = "William Tell"; // wrapper class datatype

        int intNumerator, intDenominator;
        float fltQuotient;

        fltQuotient = intNumerator = intDenominator = 0;

        intNumerator = (int)15.25;  // type casting or casting
        
        intDenominator = 5;

        fltQuotient = intNumerator / intDenominator;

        System.out.print("Numerator: " + 
                         intNumerator + " | " +
                         "Denominator: " + 
                         intDenominator + "\n");

        System.out.println("Original:  " + strName);
        System.out.println("Formatted: " + strName.toUpperCase());
        System.out.println("Formatted: " + strName.toLowerCase());

        System.out.println("Quotient is " + fltQuotient);

    }  // public static void main(String[] args)

}  // public class Datatypes2