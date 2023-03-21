package Day16_SwingsComponents_Extended;

import javax.swing.*;
public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("Components Extended");
        frame.setSize(400,400);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);


        JTextField username = new JTextField("Enter Your Name.");
        username.setBounds(80,10,150,50);
        frame.add(username);

        JTextField password = new JTextField("Enter Your Password.");
        password.setBounds(80,80,150,50);
        frame.add(password);

        JButton button = new JButton("Login");
        button.setBounds(100,150,100,30);
        frame.add(button);

        frame.setVisible(true);
    }
}
