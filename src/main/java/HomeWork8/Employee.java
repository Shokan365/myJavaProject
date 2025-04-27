package HomeWork8;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;





    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void GiveInfo() {
        System.out.println("Full Name: " + fullName);
        System.out.println("position: " + position);
        System.out.println("email: " + email);
        System.out.println("phone: " + phone);
    System.out.println("salary: "+salary);
        System.out.println("age: "+age);
}




}
