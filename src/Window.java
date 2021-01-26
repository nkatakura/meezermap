package src;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Color;

public class Window extends JFrame implements ActionListener {
    JButton enterCoordsButton = new JButton();
    JButton searchButton = new JButton();
    JButton showAllButton = new JButton();
    JButton clearButton = new JButton();
    Window() {
        String title = "MeezerMap by Naoki";
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.LIGHT_GRAY);
        buttonPanel.setBounds(500, 0, 250, 500);
        JFrame frame = new JFrame();
        frame.setTitle(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 500);
        frame.setVisible(true);
        frame.add(buttonPanel);
        JButton enterCoordsButton = new JButton();
        JButton searchButton = new JButton();
        JButton showAllButton = new JButton();
        JButton clearButton = new JButton();
        frame.add(enterCoordsButton);
        frame.add(searchButton);
        frame.add(showAllButton);
        frame.add(clearButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == enterCoordsButton) {}
        if (e.getSource() == ) {}
        if (e.getSource() == ) {}
        if (e.getSource() == ) {}
    }
    
}
