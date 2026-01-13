/*

    Code demonstrating the use of a listbox widget

*/

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;   //listbox widget

import javax.swing.SwingUtilities;
import javax.swing.ListSelectionModel;

import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

import java.awt.FlowLayout;

import java.util.Arrays;
import java.util.List;

public class SwingList {

    JFrame frmWindow;
    JLabel lblAutobot;
    JList lstAutobot;

    String[] objTF = {"Mirage", "Ironhide", "Hound",
                      "Cosmos", "Wheeljack", "Cliffjumper"};

    List<String> objAutobot;

    int intIndex; // what element did we pick from the listbox

    SwingList() {
        lblAutobot = new JLabel("");
        
        objAutobot = Arrays.asList(objTF);

        lstAutobot = new JList(objAutobot.toArray());

        frmWindow = new JFrame("Using a listbox widget..");
        frmWindow.setSize(500, 300);
        frmWindow.setLayout(new FlowLayout());
        frmWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frmWindow.add(lstAutobot);
        frmWindow.add(lblAutobot);

        frmWindow.setVisible(true);

        lstAutobot.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        lstAutobot.addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent objLE) {

                intIndex = lstAutobot.getSelectedIndex();

                if (intIndex != -1) {
                
                    lblAutobot.setText("Autobot " + objAutobot.get(intIndex));

                }

            }

        });

    }  // SwingList()


    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                new SwingList();

            }

        });

    }  // public static void main(String[] args)

}  // public class SwingList