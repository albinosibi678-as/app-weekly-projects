import student.Student;
import course.Course;

public class MainCollege {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Albino", "CSE");
        s1.displayStudentDetails();

        System.out.println();

        Course c1 = new Course("CSE301", "Object Oriented Programming", 4);
        c1.displayCourseDetails();
    }
}
