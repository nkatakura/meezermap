package src;

import javax.swing.JFrame;

public class MapDraw extends JFrame {
    //constructors that take each of the following: int[], int[][], and (int[][], string[])
    public MapDraw(int x, int z) {
        JFrame map = new JFrame();
        map.setSize(500, 500);
        map.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        map.setVisible(true);
        map.setResizable(false);
    }
}