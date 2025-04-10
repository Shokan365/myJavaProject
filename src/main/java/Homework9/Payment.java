package Homework9;


public class Payment {
    public void makePayment() {
        Cart cart = new Cart();
        cart.addItem("Book", 1500);
        cart.addItem("Pen", 500);
        cart.checkout();
    }

    public class Cart {
        private int total = 0;

        public void addItem(String item, int price) {
            System.out.println("Added " + item + ": " + price + "₸");
            total += price;
        }

        public void checkout() {
            System.out.println("Total to pay: " + total + "₸");
        }
    }
}

