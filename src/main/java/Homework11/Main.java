package Homework11;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = ArrayProcessor.processArray(arr);
            System.out.println("Сумма элементов: " + result);  
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());  // обработка исключения о размере массива
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных в массиве: " + e.getMessage());  // обработка исключения о данных в массиве
        }
    }
}
