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

    public static boolean isEvenNumberBetween1And10WithBadCode(int i){
        switch (i) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                return false;
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
                return true;
            default:
                throw new IllegalArgumentException("input should be between 1 and 10.");
        }
    }
}
