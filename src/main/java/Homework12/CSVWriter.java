package Homework12;

import java.io.FileWriter;
import java.io.IOException;

public class CSVWriter {
    public static void save(String filePath, AppData data) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(String.join(";", data.getHeader()) + "\n");

            for (int[] row : data.getData()) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < row.length; i++) {
                    sb.append(row[i]);
                    if (i < row.length - 1) sb.append(";");
                }
                writer.write(sb.toString() + "\n");
            }
        }
    }
}