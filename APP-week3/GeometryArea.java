import java.util.Scanner;

public class GeometryArea {
    static double calculateArea(double side) {
        return side * side;
    }

    static double calculateArea(double length, double width) {
        return length * width;
    }

    static double calculateArea(double radius, String shape) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side of Square: ");
        double side = sc.nextDouble();
        System.out.println("Area of Square: " + calculateArea(side));

        System.out.println("Enter length and width of Rectangle: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        System.out.println("Area of Rectangle: " + calculateArea(length, width));

        System.out.println("Enter radius of Circle: ");
        double radius = sc.nextDouble();
        System.out.println("Area of Circle: " + calculateArea(radius, "circle"));

        sc.close();
    }
}
