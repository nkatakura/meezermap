// FILE: MeezerMap.java
// DATE: 2020-11-15
// AUTHOR: Naoki Katakura
// DESCRIPTION: This program reads user-submitted coordinates (submitted through Google Forms, stored on Google sheets)
//              and maps them out onto a picture.  This is to help visualize where every person's base is set in relation
//              to eachother

import java.io.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.Color;

public class MeezerMap extends JFrame {
    static int xCoord, yCoord, zCoord;
    static int xEnd, zEnd, yEnd;
    public MeezerMap() {
        setSize(900,600);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public int findX (String rawCoords) {
        int xCoord;
        String tempCoord = "";
        boolean isNegative = false;
        for (int i = 0 + 1; i < rawCoords.length(); i++) {
            char temp = rawCoords.charAt(i);
            if (temp == '"'){
            } else if (temp == '-') {
                isNegative = true;
            } else if (Character.isDigit(temp)) {
                tempCoord = tempCoord + temp;
            } else if (temp == ','){
                xEnd = i;
                break;
            }
        }
        xCoord = Integer.parseInt(tempCoord);
        if (isNegative) {
            xCoord = xCoord * -1;
        }
        return (xCoord / 50) + 300;
    }
    public int findY (String rawCoords) {
        int yCoord;
        String tempCoord = "";
        boolean isNegative = false;
        for (int i = xEnd + 1; i < rawCoords.length(); i++) {
            char temp = rawCoords.charAt(i);
            if (temp == '"' || temp == ' ') {
            } else if (temp == '-') {
                isNegative = true;
            } else if (Character.isDigit(temp)) {
                tempCoord = tempCoord + temp;
            } else {
                yEnd = i;
                break;
            }
        }
        yCoord = Integer.parseInt(tempCoord);
        if (isNegative) {
            yCoord = yCoord * -1;
        }
        return (yCoord / 50) + 300;
    }
    public int findZ (String rawCoords) {
        int zCoord;
        String tempCoord = "";
        boolean isNegative = false;
        for (int i = yEnd + 1; i < rawCoords.length(); i++) {
            char temp = rawCoords.charAt(i);
            if (temp == '"' || temp == ' ') {
            } else if (temp == '-') {
                isNegative = true;
            } else if (Character.isDigit(temp)) {
                tempCoord = tempCoord + temp;
            } else {
                break;
            }
        }
        zCoord = Integer.parseInt(tempCoord);
        if (isNegative) {
            zCoord = zCoord * -1;
        }
        return (zCoord / 50) + 300;
    }
    public char displayMenu() {
        char c;
        String input = JOptionPane.showInputDialog("a. Draw map\nb. Quit");
        c = input.charAt(0);
        return c;
    }
    public void paint(Graphics g) {
        try {
            super.paint(g);
            FileInputStream coordFileRead = new FileInputStream("coords.csv");
            Scanner coordFileScan = new Scanner(coordFileRead);
            FileInputStream nameFileRead = new FileInputStream("names.csv");
            Scanner nameFileScan = new Scanner(nameFileRead);
            String rawCoords;
            char[] name;
            boolean again = true;
            int length; //, lineEndY = 580, lineEndX = 605;
            char choice = displayMenu();
            Color color;
            while (again) {
                if (choice == 'a' || choice == 'A') {
                    while (coordFileScan.hasNextLine()) {
                        rawCoords = coordFileScan.nextLine();
                        xCoord = findX(rawCoords);
                        yCoord = findY(rawCoords);
                        zCoord = findZ(rawCoords);
                        color = randomColorGenerator();
                        drawDots(g, color, xCoord, zCoord);
                        //g.drawLine(xCoord, zCoord, lineEndX, lineEndY);
                        name = arrayMaker(nameFileScan.nextLine());
                        length = name.length;
                        g.drawChars(name, 0, length, xCoord, zCoord);
                        //length = name.length;
                        //lineEndY -= 10;
                    }
                } else if (choice == 'b' || choice == 'B') { 
                    again = false;
                    System.exit(0);
                }
                choice = displayMenu();
            }
            coordFileScan.close();
            nameFileScan.close();
        } catch (Exception e) {
            System.out.print("Error");
        }
    }
    public void drawDots(Graphics g, Color c, int x, int z) {
        g.setColor(c);
        g.fillOval(x, z, 4, 4);
    }
    public char[] arrayMaker(String str) {
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        return ch;
    }
    public Color randomColorGenerator() {
        Random rand = new Random();
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        Color randomColor = new Color(r, g, b);
        return randomColor;
    }
    public static void main (String[] args) {
        MeezerMap mm = new MeezerMap();
        mm.setVisible(true);
    }
}