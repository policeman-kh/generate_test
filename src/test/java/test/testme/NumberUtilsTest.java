package test.testme;

import org.junit.Assert;
import org.junit.Test;

import test.NumberUtils;

public class NumberUtilsTest {

    @Test
    public void testIsEvenNumberBetween1And100() throws Exception {
        boolean result = NumberUtils.isEvenNumberBetween1And100(0);
        Assert.assertEquals(true, result);
    }

    @Test
    public void testIsOddNumberBetween1And50() throws Exception {
        boolean result = NumberUtils.isOddNumberBetween1And50(0);
        Assert.assertEquals(true, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme