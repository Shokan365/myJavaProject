package HomeWork8;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Alibek","AQA","alibek@gmail.com","+77087646755",150000,25);
        employee[1] = new Employee("Shokan","AQA","shokan@gmail.com","+77087646755",500000,19);
        employee[2] = new Employee("Sasha","AQA","sasha@gmail.com","+77087646755",250000,20);
        employee[3] = new Employee("Alikhan","AQA","alikhan@gmail.com","+77087646755",1500070,21);
        employee[4] = new Employee("Adema","AQA","adema@gmail.com","+77087646755",150060,22);


        for (Employee empl : employee){
            empl.GiveInfo();
        }



    }


}
