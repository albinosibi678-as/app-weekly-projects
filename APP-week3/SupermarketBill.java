import java.util.Scanner;

public class SupermarketBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] prices = new double[5];
        double totalBill = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter price of product " + (i + 1) + ": ");
            prices[i] = sc.nextDouble();
            totalBill += prices[i];
        }

        System.out.println("Total Bill : " + totalBill);

        if (totalBill > 5000) {
            System.out.println("Discount Applicable");
        } else {
            System.out.println("No Discount");
        }

        sc.close();
    }
}
