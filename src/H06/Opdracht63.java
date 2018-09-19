package H06;

import java.applet.*;
import java.awt.*;

public class Opdracht63 extends Applet {

    int a;
    int b;

    public void init(){
        a = 2147483647;
        b = 1;
    }

    public void paint(Graphics g){g.drawString("" + (a+b),20,20); }
}
