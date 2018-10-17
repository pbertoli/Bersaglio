package bersaglio;
    
import javax.swing.JFrame;

public class MainBersaglio {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Il mio bersaglio");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Bersaglio panel = new Bersaglio();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
