package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CoordinateInput extends JFrame implements ActionListener {

    JButton enter;
    JTextField xInput, zInput;
    static int x, z;

    CoordinateInput() {
        xInput = new JTextField(6);
        zInput = new JTextField(6);
        enter.setText("Enter");
        this.setSize(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.setSize(750, 500);
        this.setVisible(true);
        this.add(xInput);
        this.add(zInput);
        this.add(enter);
        this.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == enter) {
            x = Integer.parseInt(xInput.getText());
            z = Integer.parseInt(zInput.getText());
            this.dispose();
        }
    }

}
