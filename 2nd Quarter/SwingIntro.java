/*

  Swing - It's a framework
    ^
    |
   AWT - Abstract Window Toolkit

   Widgets - controls such as listbox, textbox, buttons, etc.

   Multi-task   ~ capability of the OS to run multiple apps all at once
   Multi-thread ~ capability of the app to run multiple processes (threads) all at once

*/

import javax.swing.JFrame;  // main window
import javax.swing.JLabel;  // label widget

import javax.swing.SwingUtilities;  // run on a separate thread

public class SwingIntro {

    SwingIntro() {

        JFrame frmWindow = new JFrame("Intro to Java Swing..");
      
        //                 w    h
        frmWindow.setSize(300, 300);  // in pixels

        // put a close button
        frmWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create a widget (label)
        JLabel lblFirst = new JLabel("My first GUI code.");

        // add our widget to the window (frame)
        frmWindow.add(lblFirst);

        // display the window on our screen (desktop)
        frmWindow.setVisible(true);

    }  // SwingIntro()

    public static void main(String[] args) {

        // create another thread to run our small GUI program
        // second thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingIntro();
            }
        });

        // bad - do not follow
        //   to demonstrate multithreading
        // main thread
        int intCounter = 0;
        while (true) {
            intCounter++;
            System.out.println(intCounter);
        }

    }  // public static void main(String[] args)

}  // public class SwingIntro