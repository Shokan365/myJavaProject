
package Homework9;
public class Park {
    public void showAttractions() {
        Attraction rollerCoaster = new Attraction("Roller Coaster", "10:00 - 18:00", 3000);
        Attraction ferrisWheel = new Attraction("Ferris Wheel", "09:00 - 20:00", 2000);
        rollerCoaster.printInfo();
        ferrisWheel.printInfo();
    }

    public class Attraction {
        private String name;
        private String hours;
        private int price;

        public Attraction(String name, String hours, int price) {
            this.name = name;
            this.hours = hours;
            this.price = price;
        }

        public void printInfo() {
            System.out.println(name + " | Hours: " + hours + " | Price: " + price + "₸");
        }
    }
}
