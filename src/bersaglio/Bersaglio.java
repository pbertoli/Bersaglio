package bersaglio;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Bersaglio extends JPanel implements ActionListener {

    private static final int SIZE = 100;
    private Timer timer = new Timer(50, this);
    private int x = 0, y = 0, dx = 7, dy = 5;

    public Bersaglio() {
        //setBackground(Color.PINK);
        setPreferredSize(new Dimension(SIZE, SIZE));
        timer.start();
    }

    public void sposta(int with, int hight) {
        if (x < 0 || x + SIZE >= with - 4 * dx) {
            dx = -dx;
        }
        if (y < 0 || y + SIZE >= hight - 8 * dy) {
            dy = -dy;
        }
        x += dx;
        y += dy;
        setLocation(new Point(x, y));
        repaint();
    }

    // tracciamento della grafica
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        int cerchi = 6;
        int x = 0, y = 0, diametro = SIZE;
        int delta = diametro / (2 * cerchi) - 1;
        for (int i = 0; i < cerchi; i++) {
            if (i % 2 == 0) {
                page.setColor(Color.BLUE);
            } else {
                page.setColor(Color.ORANGE);
            }
            page.fillOval(x, y, diametro, diametro);
            y = (x += delta);
            diametro -= 2 * delta;
        }
        page.setColor(Color.RED);
        page.fillOval(x, y, diametro, diametro);
    }

    public void actionPerformed(ActionEvent e) {
        sposta(MainBersaglio.SIZEX, MainBersaglio.SIZEY);
    }

}
