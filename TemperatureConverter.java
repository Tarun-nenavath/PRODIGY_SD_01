import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Temperature Converter!");
        System.out.print("Enter temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the unit of measurement (Celsius, Fahrenheit, or Kelvin): ");
        String originalUnit = scanner.next();

        convertAndDisplay(temperature, originalUnit);

        scanner.close();
    }

    private static void convertAndDisplay(double temperature, String originalUnit) {
        switch (originalUnit.toLowerCase()) {
            case "celsius":
                System.out.println("Converted to Fahrenheit: " + celsiusToFahrenheit(temperature));
                System.out.println("Converted to Kelvin: " + celsiusToKelvin(temperature));
                break;
            case "fahrenheit":
                System.out.println("Converted to Celsius: " + fahrenheitToCelsius(temperature));
                System.out.println("Converted to Kelvin: " + fahrenheitToKelvin(temperature));
                break;
            case "kelvin":
                System.out.println("Converted to Celsius: " + kelvinToCelsius(temperature));
                System.out.println("Converted to Fahrenheit: " + kelvinToFahrenheit(temperature));
                break;
            default:
                System.out.println("Invalid unit of measurement. Please enter Celsius, Fahrenheit, or Kelvin.");
        }
    }

    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }

    private static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    private static double kelvinToFahrenheit(double kelvin) {
        return (kelvin * 9 / 5) - 459.67;
    }
}
