import java.util.Scanner;
class StudentMarks {
    int mark1;
    int mark2;
    int mark3;

    StudentMarks(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    void calculateMarks() {
        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}

public class Marks {
    public static void main(String[] args) {

        StudentMarks student = new StudentMarks(80, 75, 90);

        student.calculateMarks();
    }
}