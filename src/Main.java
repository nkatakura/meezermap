package src;

public class Main {
    public static void main (String [] args){
        new Window();
        int[][] coords = DataReader.coordArrayMaker("coords.csv");
        String[] names = DataReader.fileArrayMaker("names.csv");
    }
}