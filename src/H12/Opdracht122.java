package H12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht122 extends Applet {
    Button buttons[];

    public void init() {
        buttons = new Button[25];
        for (int i = 0; i < 25; i++) {
            buttons[i] = new Button("but"+i);
            add(buttons[i]);
        }
    }

    public void paint(Graphics g) {}
}
