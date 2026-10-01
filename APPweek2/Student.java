import java.util.Scanner;
public class Student {

    String name;
    int rollNumber;

    Student(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;

    }

    void display(){
        System.out.println("Student Details");
        System.out.println("Name:" + name);
        System.out.println("Roll Number:" + rollNumber);

    }
    
    public static void main(String[]args){
        Student s1 = new Student("Fadil", 101);

        s1.display();
    }
    
}
