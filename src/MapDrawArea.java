package src;

import javax.swing.JPanel;
import java.awt.*;

public class MapDrawArea extends JPanel {

    MapDrawArea() {
        this.setPreferredSize(new Dimension(500, 500));
    }

    public void paint(Graphics g) {

        
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawRect(0, 0, 200, 200);
    }
}
