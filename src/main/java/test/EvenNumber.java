package test;

import lombok.experimental.UtilityClass;

@UtilityClass
public class EvenNumber {
    public static boolean isEvenNumberBetween1And100(int i) {
        if (i < 1 || i > 100) {
            throw new IllegalArgumentException("input should be between 1 and 100.");
        }
        return i % 2 == 0;
    }
}
