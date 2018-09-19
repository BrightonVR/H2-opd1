package H11;

import java.applet.*;
import java.awt.*;

public class Opdracht111 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int x = 0;

        for( int count = 0; count < 10; count++) {
            x +=20;
            g.drawLine(x, 50,x, 300);
        }
    }
}