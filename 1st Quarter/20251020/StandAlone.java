/*
  Static methods are methods that can be called directly without instantiating an object
*/
public class StandAlone {

    public static void main(String[] args) {

        int[] objNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        String[] objFriends = {"Monica", "Rachel", "Phoebe", "Ross", "Chandler", "Joey"};

        int intFriends = 0;

        System.out.println(showGreet("Jo"));

        showArray(objNumbers);

        System.out.println("My Friend List");
        intFriends = showFriends(objFriends);
        System.out.println("I have " + 
                           intFriends +
                           " friends :)");
       
    }  // public static void main(String[] args)

    public static String showGreet(String tstrName) {

        return "Hello " + 
               tstrName +
               " :)";

    }  // public static String showGreet(String tstrName)

    public static void showArray(int[] tobjNums) {

        int intSum = 0;

        System.out.println("Displaying elements in an array..");
        for (int intValue : tobjNums) {

            System.out.print(intValue + " ");
            
            intSum += intValue;

        }  // for (int intValue : tobjNums)
        System.out.println("Total is " + intSum);

    }  // public static showArray(int[] tobjNums)

    public static int showFriends(String[] tobjTomodachi) {

        int intRetVal = 0;

        for (int intIndex = 0; intIndex < tobjTomodachi.length; intIndex++) {

            intRetVal++;

            System.out.println(tobjTomodachi[intIndex]);

        }  // for (int intIndex = 0; intIndex < tobjTomodachi.length; intIndex++)

        return intRetVal;
    }  // public static int showFriends(String[] tobjTomodachi)

}  // public class StandAlone