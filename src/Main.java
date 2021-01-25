package src;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    public static void main (String [] args){
        String title = "MeezerMap by Naoki";
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.LIGHT_GRAY);
        buttonPanel.setBounds(900, 0, 300, 1200);
        JFrame frame = new JFrame();
        frame.setTitle(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(1200, 900);
        frame.setVisible(true);
        frame.add(buttonPanel);
        //new Window(title);
        int[][] coords = DataReader.coordArrayMaker("coords.csv");
        String[] names = DataReader.fileArrayMaker("names.csv");
    }
}