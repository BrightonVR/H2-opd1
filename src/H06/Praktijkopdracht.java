package H06;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {

    double C1;
    double C2;
    double C3;
    double uitkomst;
    int uitkomst2;

    public void init(){
        C1 = 5.9;
        C2 = 6.3;
        C3 = 6.9;

        uitkomst = (C1+C2+C3)/3;
        uitkomst = uitkomst*10;
        uitkomst2 = (int)uitkomst;
        uitkomst = uitkomst2;
        uitkomst = uitkomst / 10;

    }
    public void paint(Graphics g){
        g.drawString("Eind Cijfer: " + uitkomst,20,20);
    }
}
