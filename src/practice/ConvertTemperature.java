package practice;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Menu
                1.Fahrenheit to Celsius.
                2.Celsius to Fahrenheit.
                0.Exit.
                """);
        System.out.println("Choose menu");
        int number = scanner.nextInt();

        switch (number) {
            case 0 -> System.exit(0);
            case 1 -> {
                System.out.println("Enter temperature C");
                float C = scanner.nextFloat();
                 double F =  (C * 1.8) + 32;
                System.out.println("Temperature = " + F + "F");
            }
            case 2 -> {
                System.out.println("Enter temperature F");
                float F = scanner.nextFloat();
                double C = (F - 32) / 1.8;
                System.out.println("Temperature = " + C + "C");
            }
            default -> System.out.println("Please re-enter number");
        }
    }
}
