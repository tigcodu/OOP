/*
  Creating mutable strings using the StringBuilder class
*/

import java.util.Scanner;

public class StrMutable {

    public static void main(String[] args) {

        Scanner objStrData = new Scanner(System.in);
        Scanner objNumData = new Scanner(System.in);

        StringBuilder objStrFirst = new StringBuilder();
        StringBuilder objStrMiddle = new StringBuilder();
        StringBuilder objStrLast = new StringBuilder();

        int intSentinel = 1;

        while (intSentinel != 0) {

            System.out.print("\n\nEnter last name: ");
            objStrLast.append(objStrData.nextLine());
            
            System.out.print("Enter first name: ");
            objStrFirst.append(objStrData.nextLine());

            System.out.print("Enter middle name: ");
            objStrMiddle.append(objStrData.nextLine());

            System.out.println("\n\nName: " + objStrFirst + " " +
                                              objStrMiddle + " " +
                                              objStrLast);

            System.out.print("\nEnter another (1 - yes; 0 - no)? ");
            intSentinel = objNumData.nextInt();

            if (intSentinel != 0) {
                /* reset the string identifiers */
                objStrFirst.delete(0, objStrFirst.length());
                objStrMiddle.delete(0, objStrMiddle.length());
                objStrLast.delete(0, objStrLast.length());
            }  // if (intSentinel != 0)
  
        }  // while (intSentinel != 0)
    
    }  // public static void main(String[] args)

}  // public class StrMutable