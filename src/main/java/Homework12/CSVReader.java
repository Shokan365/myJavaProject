package Homework12;




import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    public static AppData load(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String[] header = reader.readLine().split(";");

            List<int[]> dataList = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(";");
                int[] row = new int[tokens.length];
                for (int i = 0; i < tokens.length; i++) {
                    row[i] = Integer.parseInt(tokens[i]);
                }
                dataList.add(row);
            }

            int[][] data = dataList.toArray(new int[0][]);
            return new AppData(header, data);
        }
    }
}

