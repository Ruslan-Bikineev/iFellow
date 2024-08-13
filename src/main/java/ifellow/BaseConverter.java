package ifellow;

public class BaseConverter {
    public double convert(int mode, double value) {
        double result;
        if (mode == 1) {
            result = (value * 9 / 5) + 32;
        } else if (mode == 2) {
            result = value + 273.15;
        } else {
            throw new IllegalArgumentException("Mode must be 1 or 2");
        }
        return result;
    }
}
