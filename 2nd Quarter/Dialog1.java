/*

  JOptionPane
  -----------
  showInputDialog()    // accepts data-entry
  showMessageDialog()  // displays information

*/

import javax.swing.JOptionPane;  // The class that is needed

public class Dialog1 {

    public static void main(String[] args) {

        String strProdCode;    // Product ID
        String strProdName;    // Description
        double dblProdPrice;
        int intProdQty;        // Quantity
        double dblProdAmount;  // Price * Quantity
        String strOutput;

        strProdCode = JOptionPane.showInputDialog(null, "Product ID");
        strProdName = JOptionPane.showInputDialog(null, "Description", 
                                                  "Enter Description");
        dblProdPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Price"));
        intProdQty = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantity", "1"));

        dblProdAmount = dblProdPrice * intProdQty;

        strOutput = "ID: " + strProdCode + "\n" +
                    "Description: " + strProdName + "\n" +
                    "Price: " + Double.toString(dblProdPrice) + "\n" + 
                    "Quantity: " + Integer.toString(intProdQty) + "\n" +
                    "Amount: " + Double.toString(dblProdAmount);

        JOptionPane.showMessageDialog(null, 
                                      strOutput,
                                      "Product Info",
                                      JOptionPane.INFORMATION_MESSAGE);

    }  // public static void main(String[] args)

}  // public class Dialog1