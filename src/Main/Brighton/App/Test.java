package Main.Brighton.App;

import java.applet.*;
import java.awt.*;

public class Test extends Applet {
    String Ans[],PosAns1;
    Button But1,But2,But3,But4;
    int test;

    public void init() {
        Ans = new String[20];
        But1 = new Button(PosAns1);
        test = 10;
    }

    public void paint(Graphics g) {
        g.drawString("hoi "+test+ " hoe gaat hety", 20,50 );
    }
}
