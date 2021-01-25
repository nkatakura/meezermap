package src;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class Window extends JFrame {
    Window(String title) {

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.red);
        buttonPanel.setBounds(0, 0, 300, 900);

        this.setTitle(title);
        this.setSize(1200, 900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);
        ImageIcon image = new ImageIcon("icon.png");
        this.setIconImage(image.getImage());
        this.add(buttonPanel);

    }
}
