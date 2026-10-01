class Student {
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
}

public class studentdetails {
    public static void main(String[] args) {

        // Create first student object
        Student student1 = new Student("John", 18);

        // Create second student object
        Student student2 = new Student("Alice", 19);

        // Display details
        student1.displayDetails();
        student2.displayDetails();
    }
}