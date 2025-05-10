package Homework9;



    public class Bowl {
        private int food;

        public Bowl(int food) {
            this.food = food;
        }

        public boolean decreaseFood(int amount) {
            if (food >= amount) {
                food -= amount;
                return true;
            }
            return false;
        }

        public void addFood(int amount) {
            food += amount;
            System.out.println("Added " + amount + " food. Total: " + food);
        }

        public int getFood() {
            return food;
        }
    }


