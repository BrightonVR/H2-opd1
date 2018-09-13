package H12;


import java.awt.*;
import java.applet.*;
import java.util.*;

public class H12Test extends Applet {

    String[] namen = {"Valerie", "Jeroen", "Sander", "Frank"};

    public void init() {
        Arrays.sort(namen);
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < namen.length; teller++) {
            g.drawString("" + namen[teller], 50, 20 * teller + 20);
        }
    }
    /*
    double[] salaris, kopie;
    int count = 5;
    double[] salaris = {100, 200, 300, 400, 500};

    public void init() {

        salaris = new double [count];
        kopie = new double[count];

        for (int teller = 0; teller < salaris.length; teller ++) {
            count++;
            salaris[teller] = 100 * teller + 100;
        }
        for (int teller = 0; teller < salaris.length; teller ++) {
            kopie[teller] = salaris[teller];
        }
        kopie[3] = 1000;

    }

    public void paint(Graphics g) {

        for (int teller = 0; teller < salaris.length; teller ++) {
           g.drawString("" + kopie[teller], 50, 20 * teller + 20);
            g.drawString("" + salaris[teller], 100, 20 * teller + 20);
        }

    }
    */
}
