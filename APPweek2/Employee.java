class EmployeeDetails {
    String name;
    int age;
    double salary;

    EmployeeDetails(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

public class Employee {
    public static void main(String[] args) {

        EmployeeDetails employee1 =
            new EmployeeDetails("John", 25, 35000);

        EmployeeDetails employee2 =
            new EmployeeDetails("Alice", 28, 45000);

        employee1.displayDetails();
        employee2.displayDetails();
    }
}