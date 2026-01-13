import java.util.*;

abstract class FunctionKit {

    String strInput;

    FunctionKit(String strInput) {
        this.strInput = strInput;
    }

    abstract void displayInfo();
}

class StringReversal extends FunctionKit {

    String strRes;

    StringReversal(String strInput) {
        super(strInput);
        this.strRes = stringReverse(strInput);
    }

    String stringReverse(String strInput) {
        String strRev = "";
        int strLength = strInput.length();

        for (int i = strLength - 1; i >= 0; i--) {
            strRev += strInput.charAt(i);
        }
        return strRev;
    }

    @Override
    void displayInfo() {
        System.out.println("Reversed string: " + strRes);
    }
}

class PalindromeChecker extends StringReversal {

    String strLower;
    String strRes;
    boolean palRes;

    PalindromeChecker(String strInput) {
        super(strInput);
        this.strLower = strInput.replaceAll(" ", "").toLowerCase();
        this.strRes = stringReverse(this.strLower);
        this.palRes = isPalindrome();
    }
    
    String stringReverse(String strInput) {
        String strRev = "";
        int strLength = strInput.length();
        for (int i = strLength - 1; i >= 0; i--) {
            strRev += strInput.charAt(i);
        }
        return strRev;
    }

    boolean isPalindrome() {
        return strRes.equals(strLower);
    }

    @Override
    void displayInfo() {
        System.out.println("Is Palindrome: " + palRes);
    }
}

class AnagramChecker extends FunctionKit {

    String strInputTwo, strResOne, strResTwo;
    boolean anaRes;

    AnagramChecker(String strInput, String strInputTwo) {
        super(strInput);
        this.strInputTwo = strInputTwo;
        this.strResOne = sortString(strInput);
        this.strResTwo = sortString(strInputTwo);
        this.anaRes = isAnagram();
    }

    String sortString(String input) {
        char charStr[] = input.toCharArray();
        Arrays.sort(charStr);
        String strSorted = new String(charStr);
        return strSorted;
    }

    boolean isAnagram() {
        return strResOne.equals(strResTwo);
    }

    @Override
    void displayInfo() {
        System.out.println("Is Anagram: " + anaRes);
    }
}

public class StringToolkit {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int intInput;
        String strInput = "";

        do {
            System.out.println("----------------------------");
            System.out.println("String Manipulation Toolkit");
            System.out.println("1. String Reversal");
            System.out.println("2. Palindrome Checker");
            System.out.println("3. Anagram Checker");
            System.out.println("4. Word Count");
            System.out.println("5. Character Count");
            System.out.println("6. Substring Finder");
            System.out.println("7. Lower Case Converter");
            System.out.println("8. Upper Case Converter");
            System.out.println("9. Vowel Remover");
            System.out.println("10. Consonant Remover");

            System.out.print("Enter a function number to perform: ");
            intInput = sc.nextInt();
            sc.nextLine();

            switch (intInput) {
                case 1:
                    System.out.print("Enter a string: ");
                    strInput = sc.nextLine();
                    FunctionKit objStrRev = new StringReversal(strInput);
                    objStrRev.displayInfo();
                    break;
                case 2:
                    System.out.print("Enter a string: ");
                    strInput = sc.nextLine();
                    FunctionKit objPal = new PalindromeChecker(strInput);
                    objPal.displayInfo();
                    break;
                case 3:
                    System.out.print("Enter a string: ");
                    strInput = sc.nextLine();
                    System.out.print("Enter another string: ");
                    String strInputTwo = sc.nextLine();
                    FunctionKit objAna = new AnagramChecker(strInput, strInputTwo);
                    objAna.displayInfo();
                    break;
                /* 
                case 4:

                case 5:

                case 6:

                case 7:

                case 8:

                case 9:

                case 10:

                */
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Number is not in the options. Try again.");
            }
        } while (intInput != 0);
    }
}
