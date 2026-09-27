import java.util.Scanner;

public class First {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        double sum;

        System.out.print("Enter any number:");
        num1 = sc.nextInt();

        System.out.print("Enter another number:");
        num2 = sc.nextInt();

        sum = num1+ num2;
        
        System.out.println("Sum of two numbers is:" + sum);

        sc.close();



        



     }
}