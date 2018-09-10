package H11;

import java.applet.*;
import java.awt.*;

public class Opdracht113 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int result = 0, oldVal = 0, newVal =1, limit = 20, temp=0, y = 20,x=1;

        while(newVal < limit) {
            x++;
            temp = oldVal;
            result = newVal + oldVal;
            oldVal = newVal;
            newVal = result;
            limit = 20+newVal*oldVal;
            g.drawString("Fib "+ result,10,y + x * 20);
        }
    }
}

