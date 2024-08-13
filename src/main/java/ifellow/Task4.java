package ifellow;

public class Task4 {
    public static double angleCalculation(int hours, int minutes) {
        if (hours < 0 || hours > 12 || minutes < 0 || minutes > 60) {
            throw new IllegalArgumentException("Hours and minutes must be between 0 and 12 and 0 and 60");
        } else {
            return Math.abs((hours * 30) + (0.5 * minutes) - (minutes * 6));
        }
    }

    public static void main(String[] args) {
        System.out.println(angleCalculation(6, 15));
    }
}
