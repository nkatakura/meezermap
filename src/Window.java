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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == enterCoordsButton) {
            new CoordinateInput();
            System.out.print(CoordinateInput.z + CoordinateInput.x);
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
