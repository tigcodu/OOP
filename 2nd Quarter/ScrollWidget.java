import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;

import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

import java.awt.FlowLayout;
import java.awt.Dimension;

public class ScrollWidget {

    JLabel lblMall;
    JList lstMall;
    JScrollPane scpMall;
    String[] objArrMall;

    public ScrollWidget() {

        lblMall = new JLabel("");
        objArrMall = new String[] {"Gateway", "Virramall", 
                                   "SM North Edsa", "SM Centerpoint",
                                   "Robinsons Galleria"};
        lstMall = new JList(objArrMall);
        scpMall = new JScrollPane(lstMall);
        scpMall.setPreferredSize(new Dimension(120, 90));
        
        JFrame frmScrollWidget = new JFrame("Listbox widget");

        frmScrollWidget.setLayout(new FlowLayout());
        frmScrollWidget.setSize(500, 200);
        frmScrollWidget.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frmScrollWidget.add(scpMall); 
        frmScrollWidget.add(lblMall);

        frmScrollWidget.setVisible(true);

        lstMall.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lstMall.addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent objLE) {

                int intIndex = lstMall.getSelectedIndex();

                if (intIndex != -1) {               
                    lblMall.setText("We're going to visit: " + objArrMall[intIndex]);
                }  // if (intIndex != -1)

            }  // public void valueChanged(ListSelectionEvent objLE)

        });

    }  // public ScrollWidget()

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ScrollWidget();
            }  // public void run()
        });    
    }  // public static void main(String[] args)

}  // public class ScrollWidget