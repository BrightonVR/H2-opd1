package H06;

import java.applet.*;
import java.awt.*;

public class Opdracht61 extends Applet {
    int a,b;
    double uitkomst;

    public void init() {
        a = 113;
        b = 4;
        uitkomst = a / b;
    }

    public void paint(Graphics g) {
        g.drawString("Jan Krijgt     : " + (int)uitkomst,20,20);
        g.drawString("Ali Krijgt     : " + (int)uitkomst,20,35);
        g.drawString("Jeanette Krijgt: " + (int)uitkomst,20,50);
        g.drawString("Brighton Krijgt: " + (int)uitkomst,20,65);
    }
}
