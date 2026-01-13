package com.juaracoding.testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

    @Test
    public void test01() {
        int expected = 5;
        int actual = 3 + 3;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test02() {
        int actual = 2 - 3;

        Assert.assertTrue(actual < 0);
    }

}
