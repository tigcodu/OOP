import javax.swing.JOptionPane;
import javax.swing.JTextArea;    // edit box widget
import javax.swing.JScrollPane;

public class Dialog2 {

    public static void main(String[] args) {

        JTextArea edtOutput = new JTextArea(3, 45);

        JScrollPane scpOutput = new JScrollPane(edtOutput,
                                            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        String strProdCode;    // Product ID
        String strProdName;    // Description
        double dblProdPrice;
        int intProdQty;        // Quantity
        double dblProdAmount;  // Price * Quantity
        String strOutput;

        strProdCode = JOptionPane.showInputDialog(null, "Product ID");
        strProdName = JOptionPane.showInputDialog(null, "Description");
        dblProdPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Price"));
        intProdQty = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantity", "1"));

        dblProdAmount = dblProdPrice * intProdQty;

        strOutput = "ID: " + strProdCode + "\n" +
                    "Description: " + strProdName + "\n" +
                    "Price: " + Double.toString(dblProdPrice) + "\n" + 
                    "Quantity: " + Integer.toString(intProdQty) + "\n" +
                    "Amount: " + Double.toString(dblProdAmount);

        edtOutput.setText(strOutput);

        /*

          put the scroll pane (scpOutput) and not the text area 

        */
        JOptionPane.showMessageDialog(null, 
                                      scpOutput,
                                      "Product Info",
                                      JOptionPane.INFORMATION_MESSAGE);


    }  // public static void main(String[] args)

}  // public class Dialog2