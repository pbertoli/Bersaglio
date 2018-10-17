package bersaglio;

import javax.swing.JPanel;
import java.awt.*;

public class Bersaglio extends JPanel {

    public Bersaglio() {
        setBackground(Color.PINK);
        setPreferredSize(new Dimension(300, 300));
    }

    // tracciamento della grafica
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        int cerchi = 6;
        int x = 0, y = 0, diametro = 300;
        int delta=diametro/(2*cerchi)-3;
        for (int i = 0; i < cerchi; i++) {
            if (i%2==0)
                page.setColor(Color.BLUE);
            else
                page.setColor(Color.ORANGE);
            page.fillOval(x, y, diametro, diametro);
            y=(x+=delta);
            diametro-=2*delta;
        }
        page.setColor(Color.RED);
        page.fillOval(x, y, diametro, diametro);
    }
}
