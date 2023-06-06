package Day34_Applet;

import java.applet.Applet;
import java.awt.*;

public class HelloApplet extends Applet {
    @Override
    public void paint(Graphics g) {
        g.drawString("Hello World",20,20);
    }
}
