package Main.Brighton.App;

import java.applet.Applet;
import java.awt.*;

public class H5Opdr extends Applet
{

    double Val;
    double ValNum;
    double Jer;
    double JerNum;
    double Han;
    double HanNum;
    int Dwidth;

    public void init()
    {
        // breete van graph
        Dwidth = 200;

        // Kg van persoon
        Val = 60;
        Jer = 100;
        Han = 80;
        // Kg van persoon naar de juiste lengte
        ValNum = Val * 2.5;
        JerNum = Jer * 2.5;
        HanNum = Han * 2.5;

    }

    public void paint(Graphics g)
    {
        g.drawString("Valerie",180,365);
        g.drawString("Jeroen",380,365);
        g.drawString("Hans",590,365);
        // In vulling can kg
        g.setColor(Color.red);
        g.fillRect(100,350-(int)ValNum,Dwidth,(int)ValNum);
        g.setColor(Color.blue);
        g.fillRect(300,350-(int)JerNum,Dwidth,(int)JerNum);
        g.setColor(Color.green);
        g.fillRect(500,350-(int)HanNum,Dwidth,(int)HanNum);
        // Graph it self
        g.setColor(Color.black);
        g.drawRect(100,50,600,300);
        g.drawLine(100,100,700,100);
        g.drawLine(100,150,700,150);
        g.drawLine(100,200,700,200);
        g.drawLine(100,250,700,250);
        g.drawLine(100,300,700,300);
        g.drawLine(300,50,300,350);
        g.drawLine(500,50,500,350);

        for(int i = -6; i < 0; i++)
        {
            g.drawString(""+-(i*20)+"kg",50,350+i*50);
        }
    }

}
