/*
  Read a file
*/

import java.io.BufferedReader; // to utilize readLine()
import java.io.FileReader;
import java.io.IOException;  // optional - will run without this

public class FileHand2 {

    static BufferedReader objFH;

    public static void main(String[] args) {

        String strFile = "grades.txt";    
        String strGrade;

        try {

            objFH = new BufferedReader(new FileReader(strFile));

            System.out.println("Grade Listing..");
            while ((strGrade = objFH.readLine()) != null) {
                System.out.println(strGrade);
            }  // while ((strGrade = objFH.readLine()) != null)

        } catch (IOException objEx) {       
            System.out.println("Problem reading data to file " +
                               strFile + "!\n" +
                               "Please take note and contact developer..");
            System.out.println("Exception: " + objEx);
        } catch (Exception objEx) {
            System.out.println("Problem encountered!\n" +
                               "Please take note and contact developer..");
            System.out.println("Exception: " + objEx);
        } finally {
            if (objFH != null) {
                try {
                    objFH.close();
                } catch (Exception objEx) {
                    System.out.println("Exception: " + objEx);
                }  // try
            }  // if (objFH != null)
        }  // try

    }  // public static void main(String[] args)

}  // public class FileHand2