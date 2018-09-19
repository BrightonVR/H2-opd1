package Main.Brighton.App;


import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.blue);

        // Opdracht 2.2? voor je naam en achternaam
        g.setColor(Color.blue);
        g.drawString("Brighton", 200, 60);
        g.setColor(Color.red);
        g.drawString("van Rouendal", 200, 75);

        // Gelijkbenige driehoek opdracht 4.1
        int x[]={100,70,130};
        int y[]={50,100,100};
        g.drawPolygon(x,y,3);

        // Huisje Opdracht 4.2 (het dak is die code van 4.1
        g.drawLine(70,100,70,150);
        g.drawLine(130,100,130,150);
        g.drawLine(70,150,130,150);
        g.drawRect(80,120,10,30);
        g.drawRect(100,110,25,20);

        // Nederlandse vlag opdracht 4.3
        g.setColor(Color.gray);
        g.drawRect(150,200,5,70);

        g.setColor(Color.RED);
        g.fillRect(155,200,40,10);

        g.setColor(Color.WHITE);
        g.fillRect(155,210,40,10);

        g.setColor(Color.BLUE);
        g.fillRect(155,220,40,10);

        // Staaf diagram van de gewichte opdracht 4.4
        g.setColor(Color.black);
        g.drawRect(300,100,225,200);
        //40 van el kaar af
        g.drawLine(375,100,375,300);
        g.drawLine(450,100,450,300);

        g.drawLine(300,140,525,140);
        g.drawLine(300,180,525,180);
        g.drawLine(300,220,525,220);
        g.drawLine(300,260,525,260);

        g.setColor(Color.RED);
        g.fillRect(301,221,73,80);

        g.setColor(Color.BLUE);
        g.fillRect(376,101,73,200);

        g.setColor(Color.YELLOW);
        g.fillRect(451,141,73,160);

        g.setColor(Color.BLACK);
        g.drawString("100 kg", 260, 100);
        g.drawString("80 kg", 260, 140);
        g.drawString("60 kg", 260, 180);
        g.drawString("40 kg", 260,220);
        g.drawString("20 kg",260,260);
        g.drawString("0 kg", 260, 300);
        g.drawString("Valerie",310,315);
        g.drawString("Jeroen",380,315);
        g.drawString("Hans",460,315);

        // Gele Eclipse opdracht 4.5
        g.setColor(Color.BLUE);
        g.fillRect(80,280,140,90);

        g.setColor(Color.YELLOW);
        g.fillArc(100, 300, 100, 50, 90, 360);
    }
}