package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Color;

public class Window extends JFrame implements ActionListener {
    JButton enterCoordsButton;
    JButton searchButton;
    JButton showAllButton;
    JButton clearButton;
    Window() {
        String title = "MeezerMap by Naoki";
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.LIGHT_GRAY);
        buttonPanel.setBounds(500, 0, 250, 500);
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.PAGE_AXIS));

        enterCoordsButton = new JButton();
        enterCoordsButton.setText("Enter Coordinates to show");
        buttonPanel.add(enterCoordsButton);

        searchButton = new JButton();
        searchButton.setText("Enter a name to search");
        buttonPanel.add(searchButton);

        showAllButton = new JButton();
        showAllButton.setText("Show all points");
        buttonPanel.add(showAllButton);

        clearButton = new JButton();
        clearButton.setText("Clear the map");
        buttonPanel.add(clearButton);

        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(750, 500);
        this.setVisible(true);
        this.add(buttonPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    
}
