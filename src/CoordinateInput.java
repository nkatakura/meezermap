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
        JLabel xLabel = new JLabel();
        JLabel zLabel = new JLabel();
        xLabel.setText("x coordinate:");
        zLabel.setText("z coordinate:");
        xInput = new JTextField(6);
        zInput = new JTextField(6);
        enter = new JButton();
        enter.setText("Enter");
        enter.addActionListener(this);
        this.setSize(200, 100);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.add(xLabel);
        this.add(xInput);
        this.add(zLabel);
        this.add(zInput);
        this.add(enter);
        this.setResizable(false);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == enter) {
            try { 
            x = Integer.parseInt(xInput.getText());
            z = Integer.parseInt(zInput.getText());
            this.dispose();
            } catch (Exception x) {
                new ErrorWindow();
            }
        }
    }

}
