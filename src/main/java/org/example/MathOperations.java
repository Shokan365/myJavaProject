package org.example;


    public class MathOperations {
        public static void checkSumSign() {
            int a = 5;
            int b = -10;
            int sum = a + b;

            if (sum >= 0) {
                System.out.println("The sum is positive");
            } else {
                System.out.println("The sum is negative");
            }
        }

        public static void compareNumbers() {
            int a = 10;
            int b = 20;

            if (a >= b) {
                System.out.println("a >= b");
            } else {
                System.out.println("a < b");
            }
        }
    }

