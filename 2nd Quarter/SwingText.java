/*

  This ?small? program will display a label and textbox
    on a window (frame)  

*/

import javax.swing.JFrame;      // window (frame)
import javax.swing.JLabel;      // label widget
import javax.swing.JTextField;  // textbox widget

import javax.swing.SwingUtilities;  // to run our GUI on a separate thread

import java.awt.FlowLayout;     // layout manager

import java.awt.event.ActionListener;  // needed for exception (event) 
import java.awt.event.ActionEvent;     //

public class SwingText {

    SwingText() {

        JFrame frmWindow = new JFrame("Using Textbox widget");

        JLabel lblFirst = new JLabel("");
        JTextField txtFirst = new JTextField(25);  // length in chars

        frmWindow.setLayout(new FlowLayout()); // put layout manager inside the window/frame

        frmWindow.setSize(500, 200);
 
        frmWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frmWindow.add(lblFirst);  // widgets will be placed
        frmWindow.add(txtFirst);  // based on sequence

        frmWindow.setVisible(true);

        txtFirst.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent objAE) {

                lblFirst.setText(txtFirst.getText());

            }

        });

    }  // SwingText()


    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                new SwingText();
            }

        });

    }  // public static void main(String[] args)

}  // public class SwingText