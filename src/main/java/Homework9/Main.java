package Homework9;

public class Main {



        public static void main(String[] args) {
            Dog dog = new Dog("Rex");
            Cat cat = new Cat("Barsik");

            dog.run(400);
            cat.run(150);
            dog.swim(5);
            cat.swim(1);

            System.out.println("Total animals: " + Animal.getAnimalCount());
            System.out.println("Total dogs: " + Dog.getDogCount());
            System.out.println("Total cats: " + Cat.getCatCount());

            // Коты и еда
            Bowl bowl = new Bowl(20);
            CatWithFullness[] cats = {
                    new CatWithFullness("Tom"),
                    new CatWithFullness("Jerry"),
                    new CatWithFullness("Leo")
            };

            for (CatWithFullness c : cats) {
                c.eat(bowl, 10);
                c.printStatus();
            }

            bowl.addFood(15);

            // Payment
            Payment payment = new Payment();
            payment.makePayment();

            // Park
            Park park = new Park();
            park.showAttractions();
        }
    }


