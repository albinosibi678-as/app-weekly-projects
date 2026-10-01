class Car {
    String model;
    double price;

    Car() {
        this.model = "Not Specified";
        this.price = 0;
    }

    Car(String model) {
        this.model = model;
        this.price = 0;
    }

    Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
        System.out.println();
    }
}

public class CarShowroom {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Swift");
        Car car3 = new Car("Creta", 1200000);

        car1.displayDetails();
        car2.displayDetails();
        car3.displayDetails();
    }
}
