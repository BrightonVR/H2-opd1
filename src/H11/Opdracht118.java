package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht118 extends Applet {
    public void paint(Graphics g) {
        int count, x = 0, y = 0, w = 10, h = 10;

        for(count = 0; count < 100; count++) {
            x = 100;
            y = 100;
            w = w + 10;
            h = h + 10;
            g.drawOval(x,y,w,h);
        }
    }
}
