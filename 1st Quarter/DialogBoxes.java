import javax.swing.JOptionPane;

public class DialogBoxes {

    public static void main(String[] args) {
    
        float fltNumerator, fltDenominator, fltQuotient;

        String strValue1, strValue2;

        strValue1 = JOptionPane.showInputDialog(null, "Enter numerator: ");
        strValue2 = JOptionPane.showInputDialog(null, "Enter denominator: ");

        fltNumerator = Float.parseFloat(strValue1);
        fltDenominator = Float.parseFloat(strValue2);
        fltQuotient = fltNumerator / fltDenominator;

        JOptionPane.showMessageDialog(null, 
                                      fltQuotient,
                                      "Quotient",
                                      JOptionPane.PLAIN_MESSAGE);

    }  // public static void main(String[] args)

}  // public class DialogBoxes