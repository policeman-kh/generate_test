package test;

public class NumberUtils {
    public static boolean isEvenNumberBetween1And100(int i) {
        if (i < 1 || i > 100) {
            throw new IllegalArgumentException("input should be between 1 and 100.");
        }
        return i % 2 == 0;
    }

    public static boolean isOddNumberBetween1And50(int i) {
        if (i < 1 || i > 50) {
            throw new IllegalArgumentException("input should be between 1 and 50.");
        }
        return i % 2 != 0;
    }
}
