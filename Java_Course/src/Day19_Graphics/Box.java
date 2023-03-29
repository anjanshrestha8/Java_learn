package Day19_Graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Box extends JPanel implements ActionListener { 
    int boxX =10;
    int boxY = 10;

   Box(){
       setBackground(Color.black);
       JButton button = new JButton(" Click to Move");
       add(button);
       button.addActionListener(this);
   }
   // paint component
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.white);
        g.fillRect(boxX,boxY,100,100);


        g.setColor(Color.white);
        g.fillRoundRect(10,220,100,100,25,25);

        g.setColor(Color.white);
        g.fillArc(200,10,100,100,35,35);

        g.setPaintMode();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("CLICKED");
        boxX+=10;
        repaint();
    }
}
