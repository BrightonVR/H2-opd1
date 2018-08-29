package Main.Brighton.App;

import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Brighton", 50, 60 );
        g.setColor(Color.red);
        g.drawString("van Rouendal", 50, 75);
    }
}
