import java.util.Scanner;
public class fifth {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        int factorial = 1;

        for (int i=1; i<=n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial = " + factorial);

        sc.close();
    }
}