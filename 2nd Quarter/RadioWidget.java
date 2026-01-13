import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;  // Radio Button widget
import javax.swing.ButtonGroup;   // used to group radio buttons

import javax.swing.SwingUtilities;

import java.awt.FlowLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RadioWidget {

    JLabel lblRadio;
    JButton btnRadio;
    JRadioButton optCPU1;
    JRadioButton optCPU2;
    JRadioButton optCPU3;

    ButtonGroup btgRadio;

    RadioWidget() {
   
        JFrame frmWindow = new JFrame("Using Radio Button widget");

        lblRadio = new JLabel("");
        btnRadio = new JButton("Accept");

        btgRadio = new ButtonGroup();

        optCPU1 = new JRadioButton();
        optCPU2 = new JRadioButton();
        optCPU3 = new JRadioButton();
      
        optCPU1.setText("Snap Dragon");
        optCPU2.setText("Exynos");
        optCPU3.setText("M4");

        btgRadio.add(optCPU1);
        btgRadio.add(optCPU2);
        btgRadio.add(optCPU3);        

        frmWindow.setLayout(new FlowLayout());
        frmWindow.setSize(250, 150);
        frmWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        frmWindow.add(lblRadio);
        frmWindow.add(optCPU1);
        frmWindow.add(optCPU2);
        frmWindow.add(optCPU3);
        frmWindow.add(btnRadio);

        frmWindow.setVisible(true);

        btnRadio.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent objAE) {

                String strManufacturer;

                if (optCPU1.isSelected()) {
                    strManufacturer = "Qualcomm";
                } else if (optCPU2.isSelected()) {
                    strManufacturer = "Samsung";
                } else if (optCPU3.isSelected()) {
                    strManufacturer = "Apple";
                } else {
                    strManufacturer = "No selection..";
                }
             
                lblRadio.setText(strManufacturer);
            }

        });

    }  // RadioWidget()


    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                new RadioWidget();

            }

        });

    }  // public static void main(String[] args)

}  // public class RadioWidget