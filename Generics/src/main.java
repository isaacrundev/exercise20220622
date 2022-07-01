public class main {

    public static void main(String[] args) {
        System.out.printf("Max of %d, %d and %d is %d\n\n", 3, 4, 5,
                Maximum.maximum(3, 4, 5));
        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7,
                Maximum.maximum(6.6, 8.8, 7.7));
    }

}

class Maximum {
    public static <T extends Number> T maximum(T x, T y, T z) {

        T max = x;

        if (y.doubleValue() > max.doubleValue())

        {
            max = y;
        }

        if (z.doubleValue() > max.doubleValue()) {
            max = z;
        }
        return max;
    }
}
