package src;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataReader {

    private static int xEnd, yEnd;

    // The following 3 methods take the rawCoord lines converts them into individual coordinates (X, Y, Z)
    public static int findX (String rawCoords) {
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
        return xCoord;
    }
    public static int findY (String rawCoords) {
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
        return yCoord;
    }
    public static int findZ (String rawCoords) {
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
        return zCoord;
    }
    
    public static String[] fileArrayMaker(String fileName) { // returns an array that has each line of a file stored as an item in the array
        String[] array = new String[0];
        try {
            FileInputStream fileRead = new FileInputStream(fileName);
            Scanner fileScan = new Scanner(fileRead);
            while (fileScan.hasNextLine()) {
                String temp = fileScan.nextLine(); // reads next line in file
                int n = array.length; 
                String tempArray[] = new String[n + 1]; // creates a new array that is 1 longer than the original array
                for (int i = 0; i < n; i++) {
                    tempArray[i] = array [i];
                }
                tempArray[n] = temp;
                array = tempArray;
            }
            fileScan.close();
        } catch (FileNotFoundException e) {
            // Put error code here
            System.out.print("Error, file not found.");
        }
        return array;
    }

    public static int[][] coordArrayMaker(String fileName) { // returns an array of arrays that store x, y, and z coordinates for the given filename
        String[] rawCoordArray = new String[0];
        rawCoordArray = fileArrayMaker(fileName);
        int[] xyzCoordArray = new int[3];
        int[][] masterCoordArray = new int[rawCoordArray.length][3];
        for (int i = 0; i < rawCoordArray.length; i++) {
            xyzCoordArray[0] = findX(rawCoordArray[i]);
            xyzCoordArray[1] = findY(rawCoordArray[i]);
            xyzCoordArray[2] = findZ(rawCoordArray[i]);
            masterCoordArray[i][0] = xyzCoordArray[0];
            masterCoordArray[i][1] = xyzCoordArray[1];
            masterCoordArray[i][2] = xyzCoordArray[2];
        }
        return masterCoordArray;
    }
}
