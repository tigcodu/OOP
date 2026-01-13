/*
  Events are what normally (or abnormally) occurs in our computer i.e. 
    keyboard presses, mouse-clicks, mouse-hovering, etc.

  try {
    code-block that causes an exception
  } catch (Exception 1) {

  } catch (Exception 2)

  ...

  } finally {

  }

*/

import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {

        Scanner objInput = new Scanner(System.in);

        int intNumerator, intDenominator;
        float fltQuotient;

        fltQuotient = intNumerator = intDenominator = 0;

        System.out.print("\nEnter numerator: ");
        intNumerator = objInput.nextInt();
        System.out.print("Enter denominator: ");
        intDenominator = objInput.nextInt();

        try {
            /* 
              Enter line(s) of code here that will cause
                an exception
            */
            fltQuotient = intNumerator / intDenominator;
        } catch (Exception objEx) {
            System.out.println("Please do not enter a zero value..");
            System.out.println("Actual exception: " + objEx);
            System.out.println("Program will terminate gracefully..");
        } finally {
            System.out.println("The finally code block will always");
            System.out.println("execute no matter what..");
        }  // try
 
        System.out.println("\nQuotient is " + fltQuotient);

    }  // public static void main(String[] args)

}  // public class Exceptions