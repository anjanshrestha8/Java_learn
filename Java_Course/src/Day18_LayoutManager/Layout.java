package Day18_LayoutManager;

import javax.swing.*;
import java.awt.*;

public class Layout {
    JFrame frame = new JFrame("Layout Manger");
    JPanel p1 = new JPanel();
    JPanel p2= new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    JPanel p5 = new JPanel();
    public void render(){
        frame.setSize(400,400);

        // panel
        frame.setLayout(new BorderLayout());

//        background colour set garxa
        p1.setBackground(Color.green);
        p2.setBackground(Color.pink);
        p3.setBackground(Color.red);
        p4.setBackground(Color.orange);
        p5.setBackground(Color.gray);

//        panel ma button add garne
        p1.add(new JButton("click me"));
        p1.add(new JButton("click me"));

        p2.add(new JButton("click me1"));
        p2.add(new JButton("click me"));

//        p3.add(new JButton("click me"));
//
//        p4.add(new JButton("click me"));
//        p5.add(new JButton("click me"));

//        panel ma vayeko button ko layout
        p1.setLayout(new FlowLayout(FlowLayout.LEFT));
        p2.setLayout(new FlowLayout(FlowLayout.TRAILING));


//        box layout
        p4.setLayout(new BoxLayout(p4,BoxLayout.Y_AXIS));
        p4.add(new JButton("click me"));
        p4.add(new JButton("click me"));
        p4.add(new JButton("click me"));
        p4.add(new JButton("click me"));

//        GRID LAYOUT
        p5.setLayout( new GridLayout(2,2));
        p5.add(new JButton("GRID"));
        p5.add(new JButton("GRID"));
        p5.add(new JButton("GRID"));




//        panel lai set garne kam garxa
        frame.add(p1,BorderLayout.NORTH);
        frame.add(p2,BorderLayout.SOUTH);
        frame.add(p3,BorderLayout.EAST);
        frame.add(p4,BorderLayout.WEST);
        frame.add(p5,BorderLayout.CENTER);

        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
