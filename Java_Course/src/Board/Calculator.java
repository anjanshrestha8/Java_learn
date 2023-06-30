package Board;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener
{
    JFrame frame = new JFrame("java program calulator");
    JTextField num1 = new JTextField();
    JTextField num2 = new JTextField();
    JTextField result = new JTextField();
    JButton add = new JButton("aDD");
    JButton sub = new JButton("SUB");



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==add){
            int sum = Integer.parseInt(num1.getText()+num2.getText());
            result.setText(String.valueOf(sum));

        }

    }
    Calculator(){
        frame.setLayout(null);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        num1.setBounds(10,10,100,50);
        frame.add(num1);
        num2.setBounds(10,80,100,50);
        frame.add(num2);
        result.setBounds(10,120,100,50);
        frame.add(result);
        add.setBounds(10,180,100,50);
        frame.add(add);
        add.addActionListener(this);
        sub.setBounds(10,230,100,50);
        frame.add(sub);
        sub.addActionListener(this);

        frame.setVisible(true);
    }


}
