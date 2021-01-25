package src;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    MyFrame(String title) {

        this.setTitle(title);
        this.setSize(400, 400); //fix size later
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("icon.png");
        this.setIconImage(image.getImage());
    }
}
