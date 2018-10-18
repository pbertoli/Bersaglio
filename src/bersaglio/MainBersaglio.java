package bersaglio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class MainBersaglio {

    public static final int SIZEX = 700, SIZEY = 500;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Il mio bersaglio");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(SIZEX, SIZEY));
        Bersaglio panel = new Bersaglio();
        
        JPanel contentPane = new JPanel();
        contentPane.setBackground(Color.PINK);
        contentPane.add(panel);
        frame.getContentPane().add(contentPane);
        frame.pack();// aggiusta il layout e le dimensioni pref.
        frame.setVisible(true);
    }
}
