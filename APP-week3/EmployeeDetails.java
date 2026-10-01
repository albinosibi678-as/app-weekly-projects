import java.util.Scanner;

class Employee {
    int employeeId;
    String employeeName;
    double salary;

    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Salary : " + salary);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID: ");
        int id = sc.nextInt();
        System.out.println("Enter Employee Name: ");
        String name = sc.next();
        System.out.println("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, salary);
        emp.displayDetails();

        sc.close();
    }
}
