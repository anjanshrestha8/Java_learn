package Enviroment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sun extends JPanel implements ActionListener {

    int sunX=-50;
    int sunY=10;
    Sun(){
        setBackground(Color.blue);
        JButton button = new JButton("Click to move");
        add(button);
        button.addActionListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.orange);
        g.fillOval(sunX,sunY,50,50);

        g.setPaintMode();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        sunX+=10;
        repaint();
        System.out.println("sun moved");
    }
}
