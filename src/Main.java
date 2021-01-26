// Author: Naoki Katakura
// Description: Mapping program for MeezerCraft minecraft server

package src;

public class Main {
    public static void main (String [] args){
        int[][] coords = DataReader.coordArrayMaker("coords.csv");
        String[] names = DataReader.fileArrayMaker("names.csv");
        Window main = new Window();
    }
}