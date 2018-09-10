package H11;

import java.applet.*;
import java.awt.*;

public class Opdracht114 extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        int count, x;

        for(count = 0; count < 10; count++) {
            x = 3 * (1 + count);
            g.drawString("" + x,20,20+count*20);
        }
    }
}
