import java.util.Scanner;

public class SchoolAttendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] attendance = new int[7];
        int presentDays = 0;

        for (int i = 0; i < 7; i++) {
            System.out.println("Enter attendance for day " + (i + 1) + " (1-Present, 0-Absent): ");
            attendance[i] = sc.nextInt();
            if (attendance[i] == 1) {
                presentDays++;
            }
        }

        double percentage = (presentDays / 7.0) * 100;
        System.out.println("Total Present Days: " + presentDays);
        System.out.println("Attendance Percentage: " + percentage);

        if (percentage >= 75) {
            System.out.println("Eligible for Exam");
        } else {
            System.out.println("Not Eligible");
        }

        sc.close();
    }
}
