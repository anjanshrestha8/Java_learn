package Day16_Swings;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame ("Hello World");                  // frame add garxa

        JButton button = new JButton("Click Here");                // button add garxa

        JTextField t1;
        t1=new JTextField("Welcome to java.");
        t1.setBounds(100,50, 200,30);
        frame.add(t1);
        button.setBounds(100,100,100,50);          // layout of button

        frame.add(button);                                           // button and frame attach

        frame.setSize(400,500);                         // frame ko size
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
