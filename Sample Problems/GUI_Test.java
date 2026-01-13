import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class GUI_Test  extends JFrame {

    private JPanel panelTitle, panelRadioButton, panelTextField, 
                    panelComboBox, panelAddons, panelDiscounts, panelTotalCost;

    private JLabel labelTitle, labelDestination, labelReturn, labelFrom, labelTo, labelDiscounts, labelVouchers, labelTotalCost;

    private JTextField tfDestination, tfReturn, tfVoucher, tfTotalCost;

    private JRadioButton rbOneWay, rbRoundTrip, rbDomestic, rbInternational, rbDiscount;

    private JComboBox comBFrom, comBTo;

    private JCheckBox cb20, cb12, cbMeal, cbClosedSeat;

    private JButton btnCalculate;

    private Double flightCost, totalCost;

    private Double baseFare;
    private Double discountOff = 0.20;
    private Double voucherOff = 0.67;
    private Double add20 = 500.0;
    private Double add12 = 300.0;
    private Double mealCost = 200.0;
    private Double closedSeatCost = 100.0;

    String cbDomesticFrom[] = {"Manila", "Cebu"};
    String cbInternationalFrom[] = {"Manila", "Hong Kong"};
    String cbDomesticTo[] = {"Manila", "Cebu"};
    String cbInternationalTo[] = {"Manila", "Hong Kong"};
    

    public GUI_Test() {

        Container container = getContentPane();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

        //title panel
        panelTitle = new JPanel(new FlowLayout(FlowLayout.CENTER));
        labelTitle = new JLabel("ABC Travels");

        panelTitle.add(labelTitle);
        add(panelTitle);

       //radio button panel
       panelRadioButton = new JPanel(new GridLayout(2,2)); 
       ButtonGroup group1 = new ButtonGroup();
       ButtonGroup group2 = new ButtonGroup();

       rbOneWay = createRadio("One Way", group1, panelRadioButton);
       rbRoundTrip = createRadio("Round Trip", group1, panelRadioButton);
       rbDomestic = createRadio("Domestic", group2, panelRadioButton);
       rbInternational = createRadio("International", group2, panelRadioButton);


        panelRadioButton.add(rbOneWay);
        panelRadioButton.add(rbRoundTrip);
        panelRadioButton.add(rbDomestic);
        panelRadioButton.add(rbInternational);

       add(panelRadioButton); 


        //text field panel
       panelTextField = new JPanel(new GridLayout(2,2));

        labelDestination = new JLabel("Destination: ");
        labelReturn = new JLabel("Return:");

        tfDestination = new JTextField(20);
        tfReturn = new JTextField(20);

        tfDestination.setEditable(false);
        tfReturn.setEditable(false);

        panelTextField.add(labelDestination);
        panelTextField.add(labelReturn);
        panelTextField.add(tfDestination);
        panelTextField.add(tfReturn);

        add(panelTextField);

        //combobox panel
        panelComboBox = new JPanel(new GridLayout(2,2));
        

        labelFrom = new JLabel("From: ");
        labelTo = new JLabel("To: ");
        comBFrom = new JComboBox<>();
        comBTo = new JComboBox<>();

        panelComboBox.add(labelFrom);
        panelComboBox.add(comBFrom);
        panelComboBox.add(labelTo);
        panelComboBox.add(comBTo);

        
        add(panelComboBox);

        //panel for addons
        panelAddons = new JPanel(new GridLayout(3,2));

        cb20 = new JCheckBox("Additional 20kg Luggage");
        cb12 = new JCheckBox("Additional 12kg Luggage");
        cbMeal = new JCheckBox("In-flight Meal");
        cbClosedSeat = new JCheckBox("Closed Seat");

        panelAddons.add(new JLabel("ADD-ONS:"));
        panelAddons.add(new JLabel(""));
        panelAddons.add(cb20);
        panelAddons.add(cb12);
        panelAddons.add(cbMeal);    
        panelAddons.add(cbClosedSeat);

        add(panelAddons);

        // instantiate panel
        // instantiate componets
        // add components to panel
        // add panel to frame

        //panel for discounts
        panelDiscounts = new JPanel(new GridLayout(2,2));

        ButtonGroup group3 = new ButtonGroup();

        labelDiscounts = new JLabel("DISCOUNTS: ");
        labelVouchers = new JLabel("Vouchers: ");
        tfVoucher = new JTextField(20);
        
        panelDiscounts.add(labelDiscounts);
        panelDiscounts.add(labelVouchers);
        rbDiscount = createRadio("PWD / Senior Citizen", group3, panelDiscounts);
        panelDiscounts.add(tfVoucher);

        add(panelDiscounts);

        //panel for total cost
        panelTotalCost = new JPanel(new GridLayout(2,2 ));

        btnCalculate = new JButton("Calculate");
        labelTotalCost = new JLabel("Total Cost: ");
        tfTotalCost = new JTextField(20);

        panelTotalCost.add(btnCalculate);
        panelTotalCost.add(new JLabel("")); // empty cell
        panelTotalCost.add(labelTotalCost);
        panelTotalCost.add(tfTotalCost);

        add(panelTotalCost);

        //set default selections
        rbDomestic.setSelected(true);
        rbOneWay.setSelected(true);
        baseFare = 1500.0;
        comBFrom.setModel(new DefaultComboBoxModel<>(cbDomesticFrom));
        comBTo.setModel(new DefaultComboBoxModel<>(cbDomesticTo));

        //actionlisteners
        rbDomestic.addActionListener(event -> countryListener(event));
        rbInternational.addActionListener(event -> countryListener(event));
        rbOneWay.addActionListener(event -> countryListener(event));
        rbRoundTrip.addActionListener(event -> countryListener(event));


        rbDiscount.addActionListener(event -> {
            if (rbDiscount.isSelected()) {
                tfVoucher.setText("");
                tfVoucher.setEditable(false);
            }
        });

        tfVoucher.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!tfVoucher.getText().isEmpty()) {
                    rbDiscount.setSelected(false);
                    tfVoucher.setEditable(true);
                }
            }
        });


        btnCalculate.addActionListener(event -> calculateCost());
        



        comBFrom.addActionListener(event -> updateDestination());
        comBTo.addActionListener(event -> updateDestination());
        updateDestination(); //to double check

        pack();
        setVisible(true);
    }

    public JRadioButton createRadio(String name, ButtonGroup group, JPanel panel) {
        JRadioButton radioButton = new JRadioButton(name);
        group.add(radioButton);
        panel.add(radioButton);

        return radioButton;
    }

    private void countryListener(ActionEvent event) {
        //set variables
        baseFare = 0.0;

        if(rbDomestic.isSelected()) {
            baseFare = 1500.0;
            comBFrom.setModel(new DefaultComboBoxModel<>(cbDomesticFrom));
            comBTo.setModel(new DefaultComboBoxModel<>(cbDomesticTo));


        } else if (rbInternational.isSelected()) {
            baseFare = 5000.0;
            comBFrom.setModel(new DefaultComboBoxModel<>(cbInternationalFrom));
            comBTo.setModel(new DefaultComboBoxModel<>(cbInternationalTo));
        }


        if(rbRoundTrip.isSelected()) {
            flightCost = baseFare * 2;
        } else {
            flightCost = baseFare;
            tfReturn.setText("");
        }
    }

    public void updateDestination() {
        String from = comBFrom.getSelectedItem().toString();
        String to = comBTo.getSelectedItem().toString();

        //to reflect  the textfield
        if(from != null && to != null) {
            tfDestination.setText(from + " -> " + to);
            if(rbRoundTrip.isSelected()) {
                tfReturn.setText(to + " -> " + from);
            }
        }
    }

    public void calculateCost() {

        totalCost = flightCost;

        //addons
        if(cb20.isSelected()) {
            totalCost += add20;
        }
        if(cb12.isSelected()) {
            totalCost += add12;
        }
        if(cbMeal.isSelected()) {
            totalCost += mealCost;
        }
        if(cbClosedSeat.isSelected()) {
            totalCost += closedSeatCost;
        }

        //apply discount
        if(rbDiscount.isSelected()) {
            totalCost = totalCost - (totalCost * discountOff);
        } else if (tfVoucher.getText().contains("FLIGHTDISCOUNT67")){
            totalCost = totalCost - (totalCost * voucherOff);
        }

        tfTotalCost.setText(String.valueOf(totalCost)); //displaying the total cost (in string format) to the textfield of total cost


    }


    
    public static void main(String[] args) {
        GUI_Test application = new GUI_Test();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}