/*
  Common String Methods
*/

public class StrMethods {

    public static void main(String[] args) {

        String strVal1, strVal2;
        String strValue = "    Albert R. Garcia    ";
        String strCountry = "Philippines";        
 
        strVal1 = "Java";
        strVal2 = "jAVa";

        if (strVal1.equals(strVal2)) {
            System.out.println("strVal1 and strVal2 are identical..");
        } else {
            System.out.println("strVal1 and strVal2 are not identical!");
        }  // if (strVal1.equals(strVal2))

        if (strVal1.equalsIgnoreCase(strVal2)) {
            System.out.println("strVal1 and strVal2 are identical (ignore case on)..");
        } else {
            System.out.println("strVal1 and strVal2 are not identical (ignore case on)!");
        }  // if (strVal1.equalsIgnoreCase(strVal2))

        System.out.println(strValue.toUpperCase());  // convert all to upper case
        System.out.println(strValue.toLowerCase());  // convert all to lower case
        System.out.println(strValue.trim());         // remove leading and trailing space(s)
        
        System.out.println(strCountry.indexOf("l"));  // returns the first occurence
        System.out.println(strCountry.charAt(3));     // returns a character at a particular
        System.out.println(strCountry.substring(8, 11));

    }  // public static void main(String[] args)

}  // public class StrMethods