import java.io.BufferedWriter;  // to utilize write()
import java.io.FileWriter;

import java.util.Scanner;

public class FileHand1 {

    static BufferedWriter objFH; // File Handle

    public static void main(String[] args) {

        int intSentinel = 1;
        String strFile, strGrade;

        Scanner objDataEntry = new Scanner(System.in);
        Scanner objSentinel = new Scanner(System.in);

        strFile = "grades.txt";

        System.out.println("Grades entered will be " + 
                           "stored to " + strFile + "..");

        try {
            objFH = new BufferedWriter(new FileWriter(strFile));
        
            while (intSentinel >= 1) {
                System.out.print("\nEnter grade: ");
                strGrade = objDataEntry.next();
                
                // write data to the file   
                objFH.write(strGrade + "\n");

                System.out.print("Enter another (1 - yes/ 0 - no)? ");
                intSentinel = objSentinel.nextInt();
            }  // while (intSentinel >= 1)

        } catch(Exception objEx) {
            System.out.println("A problem has occured!\n" +
                               "Please take note of the error " +
                               "and contact developer..");
        } finally {
            /* this code block is for house-keeping */
            if (objFH != null) {
                try {
                    objFH.close(); 
                } catch (Exception objEx) {
                    System.out.println(objEx);
                }  // try
            }  // if (objFH != null)
        }  // try

    }  // public static void main(String[] args)

}  // public class FileHand1