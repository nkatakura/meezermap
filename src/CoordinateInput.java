package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CoordinateInput extends JFrame implements ActionListener {

    JButton enter;

    CoordinateInput() {
        enter.setText("Enter");
        this.setSize(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(750, 500);
        this.setVisible(true);
        this.add(enter);
        this.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == enter) {
            
        }
    }

}
