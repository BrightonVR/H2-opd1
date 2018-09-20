package H13;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        for (int y = 0; y < 2; y++) {
            for (int count = 0; count < 5; count++) {
                if (y % 2 == 0) {
                    tree(g, 60 + count * 80, 60+y*160, 30, 100);
                } else{
                    tree(g, 40 + count * 80, 60+y*160, 30, 100);
                }
            }
        }
    }

    void tree(Graphics g, int startX, int startY, int width, int height) {
        g.setColor(new Color(99, 11, 11));
        g.fillRect(startX, startY, width, height);
        g.setColor(Color.black);
        g.drawRect(startX, startY, width, height);
        g.setColor(Color.GREEN);
        g.fillOval(startX - 25, startY - 40, width + 50, height - 20);
    }
}
