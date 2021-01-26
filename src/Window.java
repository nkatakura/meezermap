package src;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class Window extends JFrame implements ActionListener {
    int choice;
    JButton enterCoordsButton;
    JButton searchButton;
    JButton showAllButton;
    JButton clearButton;
    MapDrawArea drawArea;
    int x, z;
    Window() {
        drawArea = new MapDrawArea();
        String title = "MeezerMap by Naoki";
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.LIGHT_GRAY);
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.PAGE_AXIS));

        enterCoordsButton = new JButton();
        enterCoordsButton.setText("Enter Coordinates to show");
        enterCoordsButton.addActionListener(this);
        buttonPanel.add(enterCoordsButton);

        searchButton = new JButton();
        searchButton.setText("Enter a name to search");
        searchButton.addActionListener(this);
        buttonPanel.add(searchButton);

        showAllButton = new JButton();
        showAllButton.setText("Show all points");
        showAllButton.addActionListener(this);
        buttonPanel.add(showAllButton);

        clearButton = new JButton();
        clearButton.setText("Clear the map");
        clearButton.addActionListener(this);
        buttonPanel.add(clearButton);

        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.add(drawArea);
        this.add(buttonPanel);
        this.setResizable(false);
        this.pack();
    }

    public void coordinateInput() {
        JButton enter;
        JTextField xInput, zInput;
        int x, z;
        JFrame coordInput = new JFrame();
        JLabel xLabel = new JLabel();
        JLabel zLabel = new JLabel();
        xLabel.setText("x coordinate:");
        zLabel.setText("z coordinate:");
        xInput = new JTextField(6);
        zInput = new JTextField(6);
        enter = new JButton();
        enter.setText("Enter");
        enter.addActionListener(this);
        coordInput.setSize(200, 100);
        coordInput.setLayout(new FlowLayout());
        coordInput.setVisible(true);
        coordInput.add(xLabel);
        coordInput.add(xInput);
        coordInput.add(zLabel);
        coordInput.add(zInput);
        coordInput.add(enter);
        coordInput.setResizable(false);
        coordInput.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == enterCoordsButton) {
            coordinateInput();
            choice = 1;
        }
        if (e.getSource() == searchButton) {
            System.out.println("This button hasn't been implemented yet!");
        }
        if (e.getSource() == showAllButton) {
            System.out.println("This button hasn't been implemented yet!");
        }
        if (e.getSource() == clearButton) {
            System.out.println("This button hasn't been implemented yet!");
        }
    }
    
}
