package ifellow;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        double[] buffer = new double[10];
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = Math.random();
        }
        System.out.print("Max value in buffer: ");
        Arrays.stream(buffer).max().ifPresent(System.out::println);
        System.out.print("Min value in buffer: ");
        Arrays.stream(buffer).min().ifPresent(System.out::println);
        System.out.print("Average value in buffer: ");
        Arrays.stream(buffer).average().ifPresent(System.out::println);
        Arrays.stream(buffer).forEach(System.out::println);
    }
}
