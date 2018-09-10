package H10;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdrachten extends Applet {
    TextField text1;
    Button but1;
    int Num1, Num2;
    String num1;

    public void init() {
        text1 = new TextField();
        but1 = new Button("Ok");
        but1.addActionListener( new But1Listener() );

        add(text1);
        add(but1);
    }

    public void paint(Graphics g) {
        g.drawString(""+num1,50,100);
    }

    class But1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            Num1 = Integer.parseInt( text1.getText());
            switch (Num1) {
                case 1:     num1 = "1 is slecht";
                break;
                case 2:     num1 = "2 is slecht";
                    break;
                case 3:     num1 = "3 is slecht";
                    break;
                case 4:     num1 = "4 is onvoldoende";
                    break;
                case 5:     num1 = "5 is matig";
                    break;
                case 6:     num1 = "6 is voldoende";
                    break;
                case 7:     num1 = "7 is voldoende";
                    break;
                case 8:     num1 = "8 is goed";
                    break;
                case 9:     num1 = "9 is goed";
                    break;
                case 10:     num1 = "10 is goed";
                    break;
                default: num1 = "is niet een nummer tussen de 1/10";
                }
                repaint();
            }
        }
    }

