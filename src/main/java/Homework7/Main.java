package Homework7;

class SumChecker {
    static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
}

class NumberChecker {
    static void checkNumber(int num) {
        System.out.println(num >= 0 ? "Positive" : "Negative");
    }
}

class NegativeChecker {
    static boolean isNegative(int num) {
        return num < 0;
    }
}

class StringRepeater {
    static void repeatString(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }
}

class LeapYearChecker {
    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

class ArrayModifier {
    static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 0 ? 1 : 0;
        }
    }
}

class ArrayFiller {
    static int[] fillArray(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
}

class MultiplyIfLessThanSix {
    static void modifyArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }
}

class DiagonalMatrixFiller {
    static int[][] createMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
        }
        return matrix;
    }
}

class CustomArrayCreator {
    static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}

class ArrayShifter {
    static void shiftArray(int[] arr, int n) {
        int length = arr.length;
        n = n % length;
        if (n < 0) n += length;
        for (int i = 0; i < n; i++) {
            int temp = arr[length - 1];
            System.arraycopy(arr, 0, arr, 1, length - 1);
            arr[0] = temp;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(SumChecker.isSumInRange(5, 10));
        NumberChecker.checkNumber(-3);
        System.out.println(NegativeChecker.isNegative(-1));
        StringRepeater.repeatString("Hello", 3);
        System.out.println(LeapYearChecker.isLeapYear(2024));

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        ArrayModifier.invertArray(arr);

        int[] filledArray = ArrayFiller.fillArray(100);

        int[] modifiableArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        MultiplyIfLessThanSix.modifyArray(modifiableArray);

        int[][] matrix = DiagonalMatrixFiller.createMatrix(5);

        int[] initializedArray = CustomArrayCreator.createArray(5, 7);

        int[] shiftArray = {1, 2, 3};
        ArrayShifter.shiftArray(shiftArray, 1);
    }
}
