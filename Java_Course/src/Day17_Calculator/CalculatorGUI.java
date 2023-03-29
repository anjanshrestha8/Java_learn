package Day17_Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI implements ActionListener {   // action vaye see listen hunxa

    JFrame frame = new JFrame("Calculator");
    JButton btnadd = new JButton("Add");
    JTextField input1 = new JTextField();
    JTextField input2 = new JTextField();
    JTextField output = new JTextField();

    public void render (){
        frame.setResizable(false);
        input1.setBounds(10,10,230,50);
        frame.add(input1);

        input2.setBounds(10,70,230,50);
        frame.add(input2);

        output.setBounds(10,130,230,50);
        frame.add(output);

        btnadd.setBounds(70,190,100,50);
        frame.add(btnadd);
        btnadd.addActionListener(this);



        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        text.getText();
//        input1.setText("stha");    // button click gare see text fild ma jane
//        System.out.println("Added");  // Added chai console ma print hunxca button click garda

       if(e.getSource()==btnadd){
           int a = Integer.parseInt(input1.getText());
           int b = Integer.parseInt(input2.getText());
           int sum = a+b;
           output.setText(String.valueOf(sum));
       }



    }
}
