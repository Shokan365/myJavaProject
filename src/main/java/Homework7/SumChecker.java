package Homework7;

// 1. Check if sum of two numbers is between 10 and 20 (inclusive)
public class SumChecker {
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
}



// 3. Return true if number is negative
public class NegativeNumberChecker {
    public static boolean isNegative(int number) {
        return number < 0;
    }
}

// 4. Print string multiple times
public class StringPrinter {
    public static void printString(String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }
}

// 5. Check if year is a leap year
public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

// 6. Swap 0 and 1 in an array
public class BinaryArrayFlipper {
    public static void flipBinaryArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
    }
}

// 7. Fill array with numbers from 1 to 100
public class ArrayFiller {
    public static int[] fillArray() {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }
        return array;
    }
}

// 8. Multiply elements less than 6 by 2
public class SmallNumbersMultiplier {
    public static void multiplySmallNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }
}

// 9. Fill diagonal elements of square matrix with 1
public class DiagonalMatrixFiller {
    public static void fillDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
        }
    }
}

// 10. Create an array of given length and initial value
public class CustomArrayCreator {
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}

// 11. Shift array elements by n positions
public class ArrayShifter {
    public static void shiftArray(int[] array, int n) {
        int length = array.length;
        n = n % length;
        if (n < 0) {
            n += length;
        }
        for (int i = 0; i < n; i++) {
            int temp = array[length - 1];
            for (int j = length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = temp;
        }
    }
}

