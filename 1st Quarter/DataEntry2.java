/*
  Demonstrates the use of multiple inputs
    e.g. Strings, numbers, etc.
*/

import java.util.Scanner;

public class DataEntry2 {

    public static void main(String[] args) {

        String strLast, strFirst, strMiddle;
        int intYear, intMonth, intDay;

        Scanner objDataEntryStr = new Scanner(System.in);
     
        Scanner objDataEntryNum = new Scanner(System.in);
    
        System.out.print("Enter lastname: ");
        //strLast = objDataEntryStr.next();  // it only captures one word at a time
        strLast = objDataEntryStr.nextLine();

        System.out.print("Enter firstname: ");
        strFirst = objDataEntryStr.nextLine();  // accepts more than one word at a time

        System.out.print("Enter middlename: ");
        strMiddle = objDataEntryStr.nextLine();

        System.out.print("\nEnter birthday (year): ");
        intYear = objDataEntryNum.nextInt();
         
        System.out.print("Enter birthday (month [1-12]): ");
        intMonth = objDataEntryNum.nextInt();

        System.out.print("Enter birthday (day [1-31]: ");
        intDay = objDataEntryNum.nextInt();

        System.out.println("\nName: " + 
                           strFirst + " " +
                           strMiddle + " " + 
                           strLast + " | Birth " +
                           intYear + "-" +
                           intMonth + "-" +
                           intDay);

    }  // public static void main(String[] args)

}  // public class DataEntry2