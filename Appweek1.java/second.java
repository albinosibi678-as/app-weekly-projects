import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        System.out.print("Enter any number:");
        num1 = sc.nextInt();

        if(num1 % 2 == 0){
            System.out.print("The number is even");
        }
        else{
            System.out.print("The number odd");
        }

        sc.close();



    }
    
}