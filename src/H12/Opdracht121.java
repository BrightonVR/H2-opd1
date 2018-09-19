package H12;

import java.applet.*;
import java.awt.*;

public class Opdracht121 extends Applet {
    int[] Num1 = {1,2,3,4,5,6,7,8,9,10};
    int x, teller;
    double Num2,Num3,Num4;
    public void init() {
        for (int i = 0; i < Num1.length; i++) {
            Num2 = Num1[i];
            Num3 = Num2 + Num3;
        }
        Num4 = Num3 / (Num1.length+1);
    }

    public void paint(Graphics g) {
        for (teller = 0; teller < Num1.length; teller ++) {
            g.drawString("" + Num1[teller] + ", ",20*(teller+1), 20);
        }
        g.drawString("Gemiddelde: " + Num4,20,40);
    }
}
