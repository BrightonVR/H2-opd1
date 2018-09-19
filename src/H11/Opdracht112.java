package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht112 extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        int x = 20;

        for(int count = 0; count < 11; count++) {
            g.drawString("" + x,20,20+count*20);
            x--;
        }
    }
}
