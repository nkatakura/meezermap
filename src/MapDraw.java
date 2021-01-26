package src;

import javax.swing.JFrame;
import java.awt.Graphics;

public class MapDraw extends JFrame {
    //constructors that take each of the following: int[], int[][], and (int[][], string[])
    int type; //denotes type of map to be drawn based on input.  1 = 2 coordinate inputs, 2 = a one-dimensional array holding x, y, and z coords, 3 = a 2-dimensional array holding
    // an array of xyz arrays, and 4 = a combination of 3 and a String array holding names of coordinates.
    int x, z;
    int[] xyzArray;
    int[][] coordArray;
    String[] nameArray;
    public MapDraw(int a, int b) {
        type = 1;
        x = a;
        z = b;
        JFrame map = new JFrame();
        map.setSize(500, 500);
        map.setVisible(true);
        map.setResizable(false);
    }

    public MapDraw(int[] xyzArrayIn) {
        type = 2;
        xyzArray = xyzArrayIn;
        JFrame map = new JFrame();
        map.setSize(500, 500);
        map.setVisible(true);
        map.setResizable(false);
    }

    public MapDraw(int [][] coordArrayIn) {
        type = 3;
        coordArray = coordArrayIn;
        JFrame map = new JFrame();
        map.setSize(500, 500);
        map.setVisible(true);
        map.setResizable(false);
    }

    public MapDraw(int [][] coordArrayIn, String[] nameArrayIn) {
        type = 4;
        nameArray = nameArrayIn;
        JFrame map = new JFrame();
        map.setSize(500, 500);
        map.setVisible(true);
        map.setResizable(false);
    }

    public void paint(Graphics g) {
        if (type == 1) {
            g.drawRect(x, z, 20, 20);
        }
    }
}