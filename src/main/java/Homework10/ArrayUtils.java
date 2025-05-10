package Homework10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class ArrayUtils {
    public static <T> void swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}


abstract class Fruit {
    public abstract float getWeight();
}

class Apple extends Fruit {
    @Override
    public float getWeight() {
        return 1.0f;
    }

    @Override
    public String toString() {
        return "Apple";
    }
}

class Orange extends Fruit {
    @Override
    public float getWeight() {
        return 1.5f;
    }

    @Override
    public String toString() {
        return "Orange";
    }
}

// 3. Класс коробки с обобщённым типом
class Box<T extends Fruit> {
    private final List<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public void addFruits(List<T> fruitsToAdd) {
        fruits.addAll(fruitsToAdd);
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> otherBox) {
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.0001f;
    }

    public void transferFruitsTo(Box<T> targetBox) {
        if (targetBox == this) return;
        targetBox.addFruits(fruits);
        fruits.clear();
    }

    public void printBox() {
        System.out.println(fruits);
    }
}


