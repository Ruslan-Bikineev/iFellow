package ifellow;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number in Celsius: ");
        double celsius = scanner.nextDouble();
        System.out.println("If you want calculate Fahrenheit press 1");
        System.out.println("If you want calculate Kelvin press 2");
        int mode = scanner.nextInt();
        try {
            System.out.println(new BaseConverter().convert(mode, celsius));
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            scanner.close();
        }
    }
}
