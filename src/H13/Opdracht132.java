package H13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht132 extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        // eerste num start x pos tweede num start y num
        // deerde num wall height
        drawWall(g,40,40,10);
        //g.drawRect(x1,y1,100,10);
    }

    void drawWall(Graphics g, int x1, int y1, int height) {
        int x = x1;
        for (int row = 0; row < height;) {
            int x2 = 20,hoogte = 10;
            x1 = x;
            for (int kolom = 0; kolom < 4; kolom++) {
                g.setColor(Color.red);
                g.fillRect(x1-10,y1,x2,hoogte);
                g.setColor(Color.black);
                g.drawRect(x1-10,y1,x2,hoogte);
                x1 += x2;
            }
            row++;
            y1 = y1 + hoogte;
            x1 = x;

            for (int kolom = 0; kolom < 4; kolom++) {
                g.setColor(Color.red);
                g.fillRect(x1,y1,x2,hoogte);
                g.setColor(Color.black);
                g.drawRect(x1,y1,x2,hoogte);
                x1 += x2;
            }
            row++;
            y1 = y1 + hoogte;
        }
    }
}
