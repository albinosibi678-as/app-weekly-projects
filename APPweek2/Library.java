import java.util.Scanner;

public class Library {

    static class Book {
        String title;
        String author;
        double price;

        void getData() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Title: ");
            title = sc.nextLine();

            System.out.print("Enter Author: ");
            author = sc.nextLine();

            System.out.print("Enter Price: ");
            price = sc.nextDouble();
        }

        void display() {
            System.out.println("\nBook Details");
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);
        }
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.getData();
        b.display();
    }
}