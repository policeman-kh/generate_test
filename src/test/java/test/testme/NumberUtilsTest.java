package test.testme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import test.NumberUtils;

class NumberUtilsTest {

    @Test
    void testIsEvenNumberBetween1And100() {
        boolean result = NumberUtils.isEvenNumberBetween1And100(0);
        Assertions.assertEquals(true, result);
    }

    @Test
    void testIsOddNumberBetween1And50() {
        boolean result = NumberUtils.isOddNumberBetween1And50(0);
        Assertions.assertEquals(true, result);
    }

    @Test
    void testIsEvenNumberBetween1And10WithBadCode() {
        boolean result = NumberUtils.isEvenNumberBetween1And10WithBadCode(0);
        Assertions.assertEquals(true, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme