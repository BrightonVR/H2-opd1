package Main.Brighton.App;

import java.awt.*;
import java.applet.*;

public class PrakH4 extends Applet {

    public void init() {}

    public void paint(Graphics g)
    {
        setBackground(Color.WHITE);
        g.setColor(Color.BLACK);

        g.drawLine(10,20,220,20);
        g.drawString("Lijn",110,35);

        g.drawRect(10,55,210,100);
        g.drawString("Rechthoek",85,170);

        g.setColor(Color.magenta);
        g.fillRect(230,55,210,100);
        g.setColor(Color.black);
        g.drawOval(230,55,210,100);
        g.drawString("Gevulde rechthoek met ovaal", 260,170);

        g.drawOval(450,55,210,100);
        g.setColor(Color.magenta);
        g.fillArc(450, 55, 210, 100, 0, 45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen",465,170);

        g.drawRoundRect(10,175,210,100,30,30);
        g.drawString("Adgeronde rechthoek",50,290);

        g.setColor(Color.magenta);
        g.fillOval(230,175,210,100);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",295,290);

        g.drawArc(510,175,100,100,0,360);
        g.drawString("Cirkel",540,290);
    }
}
