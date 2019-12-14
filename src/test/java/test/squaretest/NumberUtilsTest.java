package test.squaretest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import test.NumberUtils;

class NumberUtilsTest {

    @Test
    void testIsEvenNumberBetween1And100() {
        Assertions.assertTrue(NumberUtils.isEvenNumberBetween1And100(0));
    }

    @Test
    void testIsOddNumberBetween1And50() {
        assertTrue(NumberUtils.isOddNumberBetween1And50(0));
    }

    @Test
    void testIsEvenNumberBetween1And10WithBadCode() {
        assertTrue(NumberUtils.isEvenNumberBetween1And10WithBadCode(0));
    }
}
