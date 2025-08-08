import java.util.Scanner;

public class TemperatureConv {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Temperature Converter");

        System.out.println("\nSelect what do you want to convert:-");

        System.out.println("\n1. Convert Fahrenheit to Celsius");
        System.out.println("2. Convert Celsius to Fahrenheit");
        System.out.println("3. Convert Kelvin to Celsius");
        System.out.println("4. Convert Celsius to Kelvin");
        System.out.println("5. Convert Kelvin to Fahrenheit");
        System.out.println("6. Convert Fahrenheit to Kelvin");

        System.out.print("\nEnter value here: ");
        int num = sc.nextInt();
        
        System.out.print("Enter the temperature: ");
        Double temp = sc.nextDouble();
        
        if (num == 1) {
            Double cel = ((temp - 32) * (9 / 5));
            System.out.println("Celsius: " +cel+ "C");
        }
        else if (num == 2) {
            Double fah = (temp * (9 / 5) + 32);
            System.out.println("Fahrenheit: " +fah+ "f");
        }
        else if (num == 3) {
            Double kc = (temp - 273.15);
            System.out.println("Kelvin to Celsius: " +kc+ "C");
        }
        else if (num == 4) {
            Double ck = (temp + 273.15);
            System.out.println("Celsius to Kelvin: " +ck+ "K");
        }
        else if (num == 5) {
            Double fk = (((temp - 273.15) * (9 / 5) + 32));
            System.out.println("Kelvin to Fahrenheit: " +fk+ "f");
        }
        else if (num == 6) {
            Double kf = (((temp - 32) * (9 / 5) + 273.15));
            System.out.println("Fahrenheit to Kelvin: " +kf+ "K");
        }
        else{
            System.out.println("Please fill the correct value");
        }
    }
}
