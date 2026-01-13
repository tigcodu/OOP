/*
  ArrayList is a class in java that deals
    with dynamic arrays

  note: the datatypes must be wrapper classes
*/

import java.util.ArrayList;

public class Array3 {

    public static void main(String[] args) {

        String strDecepticon = "Starscream";

        ArrayList<String> objAutobot = new ArrayList<>();

        objAutobot.add("Wheeljack");
        objAutobot.add("Hound");
        objAutobot.add(strDecepticon);
        objAutobot.add("Hot Rod");

        System.out.println("Original listing");
        for (String strName : objAutobot) {
            System.out.println(strName);
        }  // for (String strName : objAutobot)

        objAutobot.add("Jazz");
        objAutobot.add("Mirage");
        objAutobot.add("Sideswipe");
        
        System.out.println("\nNew listing");
        for (int intRow = 0; intRow < objAutobot.size(); intRow++) {

            System.out.println(objAutobot.get(intRow));        

        }  // for (int intRow = 0; intRow < objAutobot.size(); intRow++)

        if (objAutobot.contains(strDecepticon)) {

            int intBadIndex = 0; 

            for (int intRow = 0; intRow < objAutobot.size(); intRow++) {

                if (objAutobot.get(intRow) == strDecepticon) {

                    intBadIndex = intRow;
                    break;

                }  // if (objAutobot.get(intRow) == strDecepticon)
            
            }  // for (int intRow = 0; intRow < objAutobot.size(); intRow++)

            objAutobot.remove(intBadIndex);

        }  // if (objAutobot.contains(strDecepticon))

        System.out.println("\n\nFinal listing..");
        for (String strBot : objAutobot) {
            System.out.println(strBot);
        }  // for (String strBot : objAutobot)

    }  // public static void main(String[] args)

}  // public class Array3