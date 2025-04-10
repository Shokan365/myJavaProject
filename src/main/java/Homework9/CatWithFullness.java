package Homework9;


    public class CatWithFullness extends Cat {
        private boolean isFull = false;

        public CatWithFullness(String name) {
            super(name);
        }

        public void eat(Bowl bowl, int foodAmount) {
            if (bowl.decreaseFood(foodAmount)) {
                isFull = true;
            } else {
                System.out.println(name + " could not eat. Not enough food.");
            }
        }

        public void printStatus() {
            System.out.println(name + " is " + (isFull ? "full" : "hungry"));
        }
    }


