package H11;

import java.applet.*;
import java.awt.*;

public class Opdracht119 extends Applet {
    public void init() {
        setSize(600, 600);
        setBackground(Color.lightGray);
    }

    public void paint(Graphics g) {
        g.drawRect(50, 50, 160, 160);

        int x , y = 50, breedte, hoogte, row;
        breedte = 20;
        hoogte = 20;

        for (row = 0; row < 8;) {
            x = 50;
            for (int kolom = 0; kolom < 8; kolom++) {

                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte, hoogte);

                }
                x += breedte;
            }
            row++;
            y = y + hoogte;
            x = 50;

            for (int kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);

                }
                x += breedte;
            }
            row++;
            y = y + hoogte;
        }
    }
}
