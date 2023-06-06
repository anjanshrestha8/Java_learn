package Day34_Applet;

import java.applet.Applet;
import java.awt.*;

public class HelloApplet extends Applet {
    @Override
    public void paint(Graphics g) {
       String str = getParameter("message");
       g.drawString(str,20,20);

    }
}
