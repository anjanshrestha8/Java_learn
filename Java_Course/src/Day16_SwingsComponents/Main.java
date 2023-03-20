// 2 components of Swing
// 1. Container
// 2. JComponent



package Day16_SwingsComponents;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
//        frame making
        JFrame frame = new JFrame("Food Menu");                 // title frame
        frame.setTitle("Food Menu");                                // another method to title frame
        frame.setResizable(false);                                  // disable resize or maximizing option
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       // exit when program is closed
        frame.setSize(400,400);
        frame.setLayout(null);                                      // layout off garne
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.RED);                              // BACKGROUND COLOUR RED BANAUXA
//        button add making
        JButton button = new JButton("Click Me");               // button title
        button.setBounds(100,100,100,30);       //  dimension of button
        frame.add(button);                                         // add button in frame

    }

}
