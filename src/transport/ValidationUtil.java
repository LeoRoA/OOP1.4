package transport;

public class ValidationUtil {
    public static String valOrDefString(String value, String defValue) {
        if (value == null || value.isEmpty() || value.isBlank()) {
            return defValue;
        } else {
            return value;
        }

    }

    public static double valOrDefDouble(double value, double defValue) {
        if (value < 0) {
            return Math.abs(value);
        } else if (value == 0) {
            return defValue;
        } else return value;
    }

    public static int valOrDefInt(int value, int defValue) {
        if (value < 0) {
            return Math.abs(value);
        } else if (value == 0) {
            return defValue;
        } else return value;
    }
}
