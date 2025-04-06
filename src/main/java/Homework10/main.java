package Homework10;

public class main {

        public static void main(String[] args) {
            // 1. Тест swap элементов
            String[] words = {"one", "two", "three"};
            ArrayUtils.swapElements(words, 0, 2);
            System.out.println("Swapped array: " + java.util.Arrays.toString(words)); // [three, two, one]

            // 2. Коробки с фруктами
            Box<Apple> appleBox1 = new Box<>();
            appleBox1.addFruit(new Apple());
            appleBox1.addFruit(new Apple());

            Box<Orange> orangeBox = new Box<>();
            orangeBox.addFruit(new Orange());
            orangeBox.addFruit(new Orange());

            Box<Apple> appleBox2 = new Box<>();
            appleBox2.addFruit(new Apple());

            System.out.println("AppleBox1 weight: " + appleBox1.getWeight()); // 2.0
            System.out.println("OrangeBox weight: " + orangeBox.getWeight()); // 3.0
            System.out.println("Are weights equal? " + appleBox1.compare(orangeBox)); // false

            System.out.println("AppleBox2 before transfer: ");
            appleBox2.printBox();

            appleBox1.transferFruitsTo(appleBox2);

            System.out.println("AppleBox1 after transfer: ");
            appleBox1.printBox();

            System.out.println("AppleBox2 after transfer: ");
            appleBox2.printBox();
        }
    }


