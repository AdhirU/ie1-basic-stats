import java.util.*;

/**
 * A simple class to compute minimum and maximum of a list of numbers.
 */
public class MinMaxCalculation {

  public static void main(String ... args) {

  }

    /**
     * Compute the min of an array of numbers.
     */
    public static double minimum(double ... numbers) {
        double min = 0;
        for (double num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    /**
     * Compute the max of an array of numbers.
     */
    public static double maximum(double ... numbers) {
        double max = 0;
        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
