package bersaglio;
    
import javax.swing.JFrame;
import java.awt.*;

public class MainBersaglio {
    public static final int SIZEX = 700, SIZEY=500;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Il mio bersaglio");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(SIZEX,SIZEY));
        Bersaglio panel = new Bersaglio();

        frame.getContentPane().add(panel);
        frame.pack();// aggiusta il layout e le dimensioni pref.
        frame.setVisible(true);
    }
}
