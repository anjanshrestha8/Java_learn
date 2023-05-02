package Day19_Graphics;

import javax.swing.*;

public class GUI {
    JFrame frame = new JFrame("GRAPHIC");
    Box box = new Box();   // box lai extend gareko jpanel bana ra


    public void render(){
        frame.setSize(400,400);
        frame.add(box);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        

    }
}
