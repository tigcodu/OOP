import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DerechoJimsonG1 {

    JFrame frmCoffeeShop;
    JComboBox<String> objComboDrinks;
    JRadioButton rbDrip, rbPourOver, rbCold, rbEspressoStyle, rbRistretto;
    ButtonGroup btgBrewingGroup;
    JCheckBox cbHot, cbBread, cbToastedBread;
    JTextField txtAmount;

    public DerechoJimsonG1() {
        frmCoffeeShop = new JFrame("OOP Coffee Shop");
        frmCoffeeShop.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmCoffeeShop.setSize(300, 400);

        JPanel pnlMain = new JPanel();
        pnlMain.setLayout(new BoxLayout(pnlMain, BoxLayout.Y_AXIS));

        JPanel pnlDrink = new JPanel(new FlowLayout());
        pnlDrink.add(new JLabel("Drink"));

        String[] strDrinks = {
            "Espresso", "Red Eye", "Black Eye", "Americano", 
            "Macchiato", "Cappuccino", "Café Latte"
        };
        objComboDrinks = new JComboBox<>(strDrinks);
        objComboDrinks.setSelectedIndex(-1); 
        objComboDrinks.setPreferredSize(new Dimension(120, 25));
        pnlDrink.add(objComboDrinks); 
        
        pnlMain.add(pnlDrink);

        JPanel pnlBrewLabel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlBrewLabel.add(new JLabel("Brewing Style"));
        pnlMain.add(pnlBrewLabel);

        JPanel pnlRadios = new JPanel(new GridLayout(0, 1)); 

        rbDrip = new JRadioButton("Drip");
        rbPourOver = new JRadioButton("Pour over");
        rbCold = new JRadioButton("Cold");
        rbEspressoStyle = new JRadioButton("Espresso");
        rbRistretto = new JRadioButton("Ristretto");

        btgBrewingGroup = new ButtonGroup();
        btgBrewingGroup.add(rbDrip);
        btgBrewingGroup.add(rbPourOver);
        btgBrewingGroup.add(rbCold);
        btgBrewingGroup.add(rbEspressoStyle);
        btgBrewingGroup.add(rbRistretto);

        pnlRadios.add(rbDrip);
        pnlRadios.add(rbPourOver);
        pnlRadios.add(rbCold);
        pnlRadios.add(rbEspressoStyle);
        pnlRadios.add(rbRistretto);
        
        JPanel pnlRadiosContainer = new JPanel(new FlowLayout());
        pnlRadiosContainer.add(pnlRadios);
        pnlMain.add(pnlRadiosContainer);

        JPanel pnlExtras = new JPanel(new GridLayout(0, 1)); 

        cbHot = new JCheckBox("Hot");
        cbBread = new JCheckBox("Bread");
        cbToastedBread = new JCheckBox("Toasted Bread");

        pnlExtras.add(cbHot);
        pnlExtras.add(cbBread);
        pnlExtras.add(cbToastedBread);
        
        JPanel pnlExtrasContainer = new JPanel(new FlowLayout());
        pnlExtrasContainer.add(pnlExtras);
        pnlMain.add(pnlExtrasContainer);

        JPanel pnlButtons = new JPanel(new FlowLayout());
        JButton btnCalculate = new JButton("Calculate");
        JButton btnClear = new JButton("Clear");
        
        pnlButtons.add(btnCalculate);
        pnlButtons.add(btnClear);
        pnlMain.add(pnlButtons);

        JPanel pnlResult = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlResult.add(new JLabel("Amount (Php) "));
        
        txtAmount = new JTextField(10);
        txtAmount.setEditable(false);
        pnlResult.add(txtAmount);
        pnlMain.add(pnlResult);

        frmCoffeeShop.add(pnlMain);

        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateTotal();
            }
        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });
        
        frmCoffeeShop.setVisible(true); 
    }

    void calculateTotal() {
        double dblTotal = 0.0;
        String strSelectDrink = (String) objComboDrinks.getSelectedItem();

        if (strSelectDrink != null) {
            switch (strSelectDrink) {
                case "Espresso": 
                    dblTotal += 120; 
                    break;
                case "Red Eye": 
                    dblTotal += 115; 
                    break;
                case "Black Eye": 
                    dblTotal += 115; 
                    break;
                case "Americano": 
                    dblTotal += 117; 
                    break;
                case "Macchiato": 
                    dblTotal += 125; 
                    break;
                case "Cappuccino": 
                    dblTotal += 126; 
                    break;
                case "Café Latte": 
                    dblTotal += 128; 
                    break;
            }
        }

        if (rbDrip.isSelected()) dblTotal += 15;
        else if (rbPourOver.isSelected()) dblTotal += 17;
        else if (rbCold.isSelected()) dblTotal += 12;
        else if (rbEspressoStyle.isSelected()) dblTotal += 10;
        else if (rbRistretto.isSelected()) dblTotal += 12;

        if (cbHot.isSelected()) dblTotal += 5;
        if (cbBread.isSelected()) dblTotal += 15;
        if (cbToastedBread.isSelected()) dblTotal += 23;

        txtAmount.setText(String.format("%.2f", dblTotal));
    }

    void clearFields() {
        btgBrewingGroup.clearSelection();
        objComboDrinks.setSelectedIndex(-1);
        cbHot.setSelected(false);
        cbBread.setSelected(false);
        cbToastedBread.setSelected(false);
        txtAmount.setText("");
    }
    
    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DerechoJimsonG1();
            } 
        }); 
    }
}