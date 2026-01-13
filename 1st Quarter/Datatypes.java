/*
  This program demonstrates the use
    of primitive data types (primitives)

  Java is a strongly typed language
    Strongly typed - declare the identifier(s) or variables first

  Javascript is a weakly typed language
    e.g.
    
    strName = "John";
    ...
    strName = 123;  // valid statement
    ...
    strName = 1.1415;  // valid statement
    ...
    strName = "Yohann V. Salazar"; 
*/

public class Datatypes {

    public static void main(String[] args) {

        int intVal1;       // declaration
        
        int intVal2 = 10;  // declaration and initialization

        //intVal1 = 15.25;      // initialization - will cause an error
        intVal1 = 12;

        int intSum = 0;

        intSum = intVal1 + intVal2;

        System.out.print("Value 1: " + 
                         intVal1);  // displays output without a linefeed
 
        System.out.println(" | Value 2: " +
                           intVal2);

        System.out.print("Sum of Value 1 and 2: " + intSum);

    }  // public static void main(String[] args)

}  // public class Datatypes