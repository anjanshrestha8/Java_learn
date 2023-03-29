package Enviroment;

import javax.swing.*;
import java.awt.*;

public class GUI {
    JFrame frame = new JFrame();
    GUI(){
        Sun sun = new Sun();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.add(sun);
        frame.setVisible(true);
        frame.setTitle("Environment");

    }

}
