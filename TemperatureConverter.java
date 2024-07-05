
    import java.util.Scanner;

    public class TemperatureConverter {


        public static double celsiusToFahrenheit(double celsius) {
            return (celsius * 9/5) + 32;
        }


        public static double celsiusToKelvin(double celsius) {
            return celsius + 273.15;
        }


        public static double fahrenheitToCelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5/9;
        }


        public static double fahrenheitToKelvin(double fahrenheit) {
            return (fahrenheit + 459.67) * 5/9;
        }


        public static double kelvinToCelsius(double kelvin) {
            return kelvin - 273.15;
        }


        public static double kelvinToFahrenheit(double kelvin) {
            return (kelvin * 9/5) - 459.67;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Temperature Converter");
            System.out.println("Enter the temperature value:");
            double inputTemperature = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Enter the unit of the temperature (C for Celsius, F for Fahrenheit, K for Kelvin):");
            String unit = scanner.nextLine().toUpperCase();

            double tempInCelsius = 0.0, tempInFahrenheit = 0.0, tempInKelvin = 0.0;

            switch (unit) {
                case "C":
                    tempInCelsius = inputTemperature;
                    tempInFahrenheit = celsiusToFahrenheit(inputTemperature);
                    tempInKelvin = celsiusToKelvin(inputTemperature);
                    break;
                case "F":
                    tempInCelsius = fahrenheitToCelsius(inputTemperature);
                    tempInFahrenheit = inputTemperature;
                    tempInKelvin = fahrenheitToKelvin(inputTemperature);
                    break;
                case "K":
                    tempInCelsius = kelvinToCelsius(inputTemperature);
                    tempInFahrenheit = kelvinToFahrenheit(inputTemperature);
                    tempInKelvin = inputTemperature;
                    break;
                default:
                    System.out.println("Invalid unit!");
                    scanner.close();
                    return;
            }

            System.out.println("Temperature in Celsius: " + tempInCelsius + "°C");
            System.out.println("Temperature in Fahrenheit: " + tempInFahrenheit + "°F");
            System.out.println("Temperature in Kelvin: " + tempInKelvin + "K");

            scanner.close();
        }
    }


