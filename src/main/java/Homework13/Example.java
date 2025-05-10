package Homework13;

import java.io.FileWriter;
import java.io.IOException;

public class Example {
    public static void main(String[] args) throws IOException {
        int [][] data = {
                {100,200,300},
                {400,500,600},
                {700,800,900}
        };
         String Filepath= "data.csv";
        try(FileWriter fileWriter = new FileWriter(Filepath)) {
            for (int[]row : data) {
                for (int i = 0 ;i<row.length;i++){
                    fileWriter.write(Integer.toString(row[i]));
                    if (i< row.length-1){
                        fileWriter.write(";");
                    }
                }
                fileWriter.write("\n");

            }
            System.out.println("Файл успешно записон!");
        }catch (IOException e){
            System.out.println("Ошибка при записи файла: "+e.getMessage());
        }

    }
}
