package src;

import javax.swing.*;

public class Main {

    public Main(){
        String title = "MeezerMap by Naoki";
        new MyFrame(title);
        JLabel label = new JLabel();
        label.setText(" ");
        
    }
    public static void main (String [] args){
        new Main();
        int[][] coords = DataReader.coordArrayMaker("coords.csv");
        String[] names = DataReader.fileArrayMaker("names.csv");
    }
}