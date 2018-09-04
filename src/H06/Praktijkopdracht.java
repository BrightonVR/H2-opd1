package H06;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {

    double C1;
    double C2;
    double C3;
    double Gcijfer;
    double Pcijfer;
    int Tcijfer;
    double T2cijfer;
    double Ecijfer;

    public void init(){
        C1 = 5.9;
        C2 = 6.3;
        C3 = 6.9;

        Gcijfer = ((C1 + C2) + C3) / 3;
        Pcijfer = Gcijfer * 10;
        Tcijfer = (int)Pcijfer;
        T2cijfer = Tcijfer;
        Ecijfer = T2cijfer / 10;

    }
    public void paint(Graphics g){
        g.drawString("Eind Cijfer: " + Ecijfer,20,20);
    }
}
