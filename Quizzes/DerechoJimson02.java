import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DerechoJimson02 {

    public static void listItems(ArrayList<String> arrList) {
        System.out.println("\n--- Your To-Do List ---");
        if (arrList.isEmpty()) {
            System.out.println("Your list is empty.");
        } else {
            for (int i = 0; i < arrList.size(); i++) {
                System.out.println((i + 1) + ". " + arrList.get(i));
            }
        }
        System.out.println("-------------------------");
    }

    public static void addNewItem(ArrayList<String> arrList, Scanner varInput) {
        listItems(arrList);
        System.out.print("Please enter what to do? ");
        String strNewItem = varInput.nextLine();
        arrList.add(strNewItem);
    }

    public static void modifyItem(ArrayList<String> arrList, Scanner varInput) {
        if (arrList.isEmpty()) {
            System.out.println("List is empty. Nothing to modify.");
            return;
        }

        listItems(arrList);
        System.out.print("Press what item to modify: ");

        if (varInput.hasNextInt()) {
            int intItemNumber = varInput.nextInt();
            varInput.nextLine();
            
            int intIndex = intItemNumber - 1;

            if (intIndex >= 0 && intIndex < arrList.size()) {
                System.out.print("Please enter what to do? ");
                String strModifiedItem = varInput.nextLine();
                arrList.set(intIndex, strModifiedItem);
            } else {
                System.out.println("Invalid item number. No item modified.");
            }

        } else {
            System.out.println("Invalid input. Please enter a number.");
            varInput.nextLine(); 
        }
    }

    public static void removeItem(ArrayList<String> arrList, Scanner varInput) {
        if (arrList.isEmpty()) {
            System.out.println("List is empty. Nothing to remove.");
            return;
        }

        listItems(arrList);
        System.out.print("Press what item to remove: ");

        if (varInput.hasNextInt()) {
            int intItemNumber = varInput.nextInt();
            varInput.nextLine();
            
            int intIndex = intItemNumber - 1;

            if (intIndex >= 0 && intIndex < arrList.size()) {
                arrList.remove(intIndex);
            } else {
                System.out.println("Invalid item number. No item removed.");
            }

        } else {
            System.out.println("Invalid input. Please enter a number.");
            varInput.nextLine(); 
        }
    }

    public static void saveList(ArrayList<String> arrList, Scanner varInput) throws IOException {
        if (arrList.isEmpty()) {
            System.out.println("List is empty. Nothing to save.");
            return;
        }

        System.out.print("Enter filename to save list: ");
        String strFileName = varInput.nextLine();

        StringBuilder flContent = new StringBuilder();
        flContent.append("--- To-Do List ---\n");
        for (int i = 0; i < arrList.size(); i++) {
            flContent.append((i + 1)).append(". ").append(arrList.get(i)).append(System.lineSeparator());
        }

        try (BufferedWriter flWriter = new BufferedWriter(new FileWriter(strFileName))) {
            flWriter.write(flContent.toString());
        }
    }

    public static void displayMenu() {
        System.out.println("\nTo-do List App");
        System.out.println("------------------------");
        System.out.println("A. New");
        System.out.println("B. Modify");
        System.out.println("C. Remove");
        System.out.println("D. List");
        System.out.println("E. Save");
        System.out.println("X. Exit");
        System.out.println("------------------------");
        System.out.print("Choose your option [Press A-E or X to quit]: ");
    }

    public static void main(String args[]) throws IOException {

        ArrayList<String> arrList = new ArrayList<>();
        boolean boolRunning = true;
        Scanner varInput = new Scanner(System.in);

        while (boolRunning) {

            displayMenu();
            String charChoice = varInput.nextLine().toUpperCase();

            switch (charChoice) {
                case "A":
                    addNewItem(arrList, varInput);
                    break;
                case "B":
                    modifyItem(arrList, varInput);
                    break;
                case "C":
                    removeItem(arrList, varInput);
                    break;
                case "D":
                    listItems(arrList);
                    break;
                case "E":
                    saveList(arrList, varInput);
                    break;
                case "X":
                    boolRunning = false;
                    System.out.println("Exiting the program.");
                    break;
                default: 
                    System.out.println("Invalid option. Please choose a valid option.");
                    break;
            }
        }
        varInput.close();
    }
}