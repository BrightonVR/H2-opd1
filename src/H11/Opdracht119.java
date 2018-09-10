package H11;

import java.applet.*;
import java.awt.*;

public class Opdracht119 extends Applet {
    public void paint(Graphics g) {
        int set, count = 0, x =50, y=50, breedte = 10, hoogte = 10;


        for (set = 0; set < 8;) {
            y = y + hoogte;
            if (count == 0) {

                for (int kolom = 0; kolom < 8; kolom++) {
                    if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                        g.setColor(Color.black);
                        g.fillRect(x, y, breedte, hoogte);
                    } else {
                        g.setColor(Color.magenta);
                        g.fillRect(x, y, breedte, hoogte);

                    }
                    x += breedte;
                    count++;
                    set++;
                }
            }
            if (count == 1) {

                for (int kolom = 0; kolom < 8; kolom++) {
                    if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                        g.setColor(Color.magenta);
                        g.fillRect(x, y, breedte, hoogte);
                    } else {
                        g.setColor(Color.black);
                        g.fillRect(x, y, breedte, hoogte);

                    }
                    x += breedte;
                    count--;
                    set++;
                }
            }
        }
    }
}
