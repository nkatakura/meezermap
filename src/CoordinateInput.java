package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.*;

public class CoordinateInput extends JFrame implements ActionListener {

    JButton enter;
    JTextField xInput, zInput;
    static int x, z;

    CoordinateInput() {
        xInput = new JTextField(6);
        zInput = new JTextField(6);
        enter = new JButton();
        enter.setText("Enter");
        enter.addActionListener(this);
        this.setSize(200, 100);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.add(xInput);
        this.add(zInput);
        this.add(enter);
        this.setResizable(false);
        this.pack();
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
