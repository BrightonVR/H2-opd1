package H06;

import java.applet.*;
import java.awt.*;

public class Opdracht62 extends Applet {

    int sec;
    int min;
    int hour;
    int day;
    int week;
    int month;
    int year;

    public void init(){
        sec = 1;
        min = sec * 60;
        hour = min * 60;
        day = hour * 24;
        week = day * 7;
        month = week * 4;
        year = month * 12;
    }

    public void paint(Graphics g){
        g.drawString("uur: " + hour + " seconde", 20, 20);
        g.drawString("dag: " + day + " seconde",20,35);
        g.drawString("jaar: " + year + " seconde",20,50);
    }
}
