package Calculator;

import javax.swing.*;

public class CalculatorGUI {
    JFrame frame = new JFrame("Calculator");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");

    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");

    JButton button10 = new JButton(".");
    JButton button11 = new JButton("0");
    JButton button12 = new JButton("=");
    JButton button13 = new JButton("+");
    JButton button14 = new JButton("-");
    JButton button15 = new JButton("%");
    JButton button16 = new JButton("x");

    JTextField text = new JTextField("Calculation");





    public void render(){

        frame.setResizable(false);
//        1
        button1.setBounds(10,70,50,50);
        frame.add(button1);
//      2
        button2.setBounds(70,70,50,50);
        frame.add(button2);
//      3
        button3.setBounds(130,70,50,50);
        frame.add(button3);
//      4
        button4.setBounds(10,130,50,50);
        frame.add(button4);
//      5
        button5.setBounds(70,130,50,50);
        frame.add(button5);
//      6
        button6.setBounds(130,130,50,50);
        frame.add(button6);
//      7
        button7.setBounds(10,190,50,50);
        frame.add(button7);
//      8
        button8.setBounds(70,190,50,50);
        frame.add(button8);
//      9
        button9.setBounds(130,190,50,50);
        frame.add(button9);
//      .
        button10.setBounds(10,250,50,50);
        frame.add(button10);
//      0
        button11.setBounds(70,250,50,50);
        frame.add(button11);
//      =
        button12.setBounds(130,250,50,50);
        frame.add(button12);
//      +
        button13.setBounds(190,70,50,50);
        frame.add(button13);
//      -
        button14.setBounds(190,130,50,50);
        frame.add(button14);
//      %
        button15.setBounds(190,190,50,50);
        frame.add(button15);
//      x
        button16.setBounds(190,250,50,50);
        frame.add(button16);
//      text
        text.setBounds(10,10,230,50);
        frame.add(text);


        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

}
