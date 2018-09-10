package H11;

import java.applet.*;
import java.awt.*;

public class H11Test extends Applet {
    int x, y, row;
    boolean Switch;
    public void init() {
        Switch = true;
        y = 10;
        setSize(600,600);
    }

    public void paint(Graphics g) {
        int checker = 0;
        while (Switch) {
            if (row == 8) {checker = 3;}
            switch (checker) {
                case 0:
                    x = 10;
                    for (int map = 0; map < 8; map++) {
                        if (map == 0 || map == 2 || map == 4 || map == 6) {
                            g.setColor(Color.black);
                            g.fillRect(x, y, 20, 20);
                        } else {
                            g.setColor(Color.magenta);
                            g.fillRect(x, y, 20, 20);

                        }
                        x += 20;
                    }
                    y += 20;
                    checker++;
                    row++;
                    break;

                case 1:
                    x = 10;
                    for (int map = 0; map < 8; map++) {
                        if (map == 0 || map == 2 || map == 4 || map == 6) {
                            g.setColor(Color.magenta);
                            g.fillRect(x, y, 20, 20);
                        } else {
                            g.setColor(Color.black);
                            g.fillRect(x, y, 20, 20);

                        }
                        x += 20;
                    }
                    y += 20;
                    checker--;
                    row++;
                    break;
            }
        }
    }
}
