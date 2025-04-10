package  Homework11;
public class ArrayProcessor {


    public static int processArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {


        if (arr.length != 4) {
            throw new MyArraySizeException("Массив должен быть 4x4. Ошибка: количество строк не равно 4.");
        }

        int sum = 0;

        for (int i = 0; i < 4; i++) {

            if (arr[i].length != 4) {
                throw new MyArraySizeException("Массив должен быть 4x4. Ошибка: количество элементов в строке не равно 4.");
            }

            for (int j = 0; j < 4; j++) {

                try {

                    sum += Integer.parseInt(arr[i][j]);  // При успешном преобразовании добавляем к сумме.
                } catch (NumberFormatException e) {

                    throw new MyArrayDataException("Ошибка преобразования данных на позиции [" + i + "][" + j + "]: '" + arr[i][j] + "' не является числом.");
                }
            }
        }
        return sum;
    }
}