import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;  // button widget

import javax.swing.SwingUtilities;

import java.awt.FlowLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwingButton {

    JLabel lblButton;
    JTextField txtButton;
    JButton btnCopy;  // button object

    SwingButton() {

        JFrame frmWindow = new JFrame("Using a Button Widget..");

        lblButton = new JLabel("");
        txtButton = new JTextField("Enter text here..");
        btnCopy = new JButton("Copy");

        frmWindow.setLayout(new FlowLayout());

        frmWindow.setSize(200, 150);

        frmWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frmWindow.add(txtButton);
        frmWindow.add(btnCopy);
        frmWindow.add(lblButton);

        frmWindow.setVisible(true);

        btnCopy.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent objAE) {

                lblButton.setText(txtButton.getText());

            }

        });

    }  // SwingButton()

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                new SwingButton();

            }

        });

    }  // public static void main(String[] args)

}  // public class SwingButton