package H13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht131 extends Applet {
    public void init() {
        //int x1 = 100, y1 = 100, x2 = 200, y2 = 50, x3 = 50;
    }
    public void paint(Graphics g) {
        drawTriangle(g,100,100,200,50,150);
    }

    void drawTriangle(Graphics g, int x1, int y1, int x2, int y2, int x3) {
        g.drawLine(x1,y1,x2,y1);
        g.drawLine(x2,y1,x3,y2);
        g.drawLine(x3,y2,x1,y1);
    }
}
