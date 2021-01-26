package src;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class Window extends JFrame implements ActionListener {
    public static String[] names;
    public static int[][] coords;
    int choice;
    JTextField xInput, zInput;
    JButton enterCoordsButton;
    JButton searchButton;
    JButton showAllButton;
    JButton clearButton;
    int x, z;
    Window() {
        JLabel xLabel = new JLabel();
        JLabel zLabel = new JLabel();
        xLabel.setText("x coordinate:");
        zLabel.setText("z coordinate:");
        xInput = new JTextField(6);
        zInput = new JTextField(6);
        String title = "MeezerMap by Naoki";
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.LIGHT_GRAY);
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.PAGE_AXIS));

        enterCoordsButton = new JButton();
        enterCoordsButton.setText("Draw coordinate");
        enterCoordsButton.addActionListener(this);
        buttonPanel.add(xLabel);
        buttonPanel.add(xInput);
        buttonPanel.add(zLabel);
        buttonPanel.add(zInput);
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
        this.add(buttonPanel);
        this.setResizable(false);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == enterCoordsButton) {
            try {
                x = Integer.parseInt(xInput.getText());
                z = Integer.parseInt(zInput.getText());
            } catch (Exception g) {
                new ErrorWindow();
            }
            new MapDrawFrame(x, z);
        }
        if (e.getSource() == searchButton) {
            System.out.println("This button hasn't been implemented yet!");
        }
        if (e.getSource() == showAllButton) {
            new MapDrawFrame(coords, names);
        }
        if (e.getSource() == clearButton) {
            System.out.println("This button hasn't been implemented yet!");
        }
    }

    public static void main (String [] args){
        coords = DataReader.coordArrayMaker("coords.csv");
        names = DataReader.fileArrayMaker("names.csv");
        Window main = new Window();
    }
    
}
