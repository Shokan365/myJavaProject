package Homework12;

import com.sun.jdi.Value;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] header = {"Value1","Value2","Value3"};
        int[][] data ={
                {100,200,123},
                {300,400,500}
        };

        AppData appData = new AppData(header,data);
        String filePath = "data.csv";
        CSVWriter.save(filePath,appData);

        System.out.println("Файл сохранён!");

        AppData loaded = CSVReader.load(filePath);
        System.out.println("Файл загружен:");
        for (String h : loaded.getHeader()) System.out.print(h + " ");
        System.out.println();
        for (int[] row : loaded.getData()) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }

    }


