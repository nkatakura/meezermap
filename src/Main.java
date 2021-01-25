package src;

public class Main {
    public static void main (String [] args){
        String title = "MeezerMap by Naoki";
        new Window(title);
        int[][] coords = DataReader.coordArrayMaker("coords.csv");
        String[] names = DataReader.fileArrayMaker("names.csv");
    }
}