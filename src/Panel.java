package src;

import javax.swing.JPanel;
import java.awt.*;

public class Panel extends JPanel {
    int type = 0; //denotes type of map to be drawn based on input.  1 = 2 coordinate inputs, 2 = a one-dimensional array holding x, y, and z coords, 3 = a 2-dimensional array holding
    // an array of xyz arrays, and 4 = a combination of 3 and a String array holding names of coordinates.
    int x, z;
    int[] xyzArray;
    int[][] coordArray;
    String[] nameArray;
    Panel(int x, int z) {
        this.setPreferredSize(new Dimension(500, 500));
        type = 1;
        this.x = x;
        this.z = z;
    }

    Panel(int[] xyzArray) {
        this.setPreferredSize(new Dimension(500, 500));
        this.xyzArray = xyzArray;
        type = 2;
    }

    Panel(int[][] coordArray) {
        this.setPreferredSize(new Dimension(500, 500));
        this.coordArray = coordArray;
        type = 3;
    }

    Panel(int[][] coordArray, String[] nameArray) {
        this.setPreferredSize(new Dimension(500, 500));
        this.coordArray = coordArray;
        this.nameArray = nameArray;
        type = 4;
    }

    public static int coordinateConverter(int a) {
        float temp = (float) a;
        temp = (temp/60) + 250;
        a = (int) temp;
        return a;
    }

    public void paint (Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.BLACK);
        if (type == 1) { // two int arguments
            x = coordinateConverter(x);
            z = coordinateConverter(z);
            g2D.drawRect(x, z, 1, 1);
        }
        else if (type == 2) { // xyz array argument
            x = coordinateConverter(xyzArray[0]);
            z = coordinateConverter(xyzArray[2]);
            g2D.drawRect(x, z, 1, 1);
        }
        else if (type == 3) { // coord array argument
            for (int i = 0; i < coordArray.length; i++) {
                x = coordinateConverter(coordArray[i][0]);
                z = coordinateConverter(coordArray[i][2]);
                g2D.drawRect(x, z, 1, 1);
            }
        }
        else if (type == 4) { // coord array and name array argument
            for (int i = 0; i < coordArray.length; i++) {
                x = coordinateConverter(coordArray[i][0]);
                z = coordinateConverter(coordArray[i][2]);
                g2D.drawRect(x, z, 1, 1);
                g2D.drawString(nameArray[i], x, z);
            }
        }
    }
}
