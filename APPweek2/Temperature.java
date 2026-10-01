import java.util.Scanner;
class TemperatureDetails {
    double celsius;

    TemperatureDetails(double celsius) {
        this.celsius = celsius;
    }

    void convertAndDisplay() {
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperature in Celsius: " + celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}

public class Temperature {
    public static void main(String[] args) {

        TemperatureDetails temp = new TemperatureDetails(25);

        temp.convertAndDisplay();
    }
}