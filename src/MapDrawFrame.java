package src;

import javax.swing.*;
import java.awt.*;

public class MapDrawFrame extends JFrame {
    //constructors that take each of the following: int[], int[][], and (int[][], string[])
    int type; //denotes type of map to be drawn based on input.  1 = 2 coordinate inputs, 2 = a one-dimensional array holding x, y, and z coords, 3 = a 2-dimensional array holding
    // an array of xyz arrays, and 4 = a combination of 3 and a String array holding names of coordinates.
    Panel drawPanel;
    public MapDrawFrame(int x, int z) {
        drawPanel = new Panel(x, z);
        JFrame map = new JFrame();
        map.setVisible(true);
        map.setResizable(false);
        map.add(drawPanel);
        map.pack();
    }

    public MapDrawFrame(int[] xyzArray) {
        drawPanel = new Panel(xyzArray);
        JFrame map = new JFrame();
        map.setVisible(true);
        map.setResizable(false);
        map.add(drawPanel);
        map.pack();
    }

    public MapDrawFrame(int [][] coordArray) {
        drawPanel = new Panel(coordArray);
        JFrame map = new JFrame();
        map.setVisible(true);
        map.setResizable(false);
        map.add(drawPanel);
        map.pack();
    }

    public MapDrawFrame(int [][] coordArray, String[] nameArray) {
        drawPanel = new Panel(coordArray, nameArray);
        JFrame map = new JFrame();
        map.setVisible(true);
        map.setResizable(false);
        map.add(drawPanel);
        map.pack();
    }
}