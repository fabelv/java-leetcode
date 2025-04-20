package net.elvfab.DataStructuresAndAlgorithms.ArraysAndStrings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MinimumValueToGetPositiveStepByStepSumTest {

    @Test
    void minStartValueTest() {
        int[] nums = { -3, 2, -3, 4, 2 };

        int res = MinimumValueToGetPositiveStepByStepSum.minStartValue(nums);

        // assertion
        assertEquals(5, res);
    }

    @Test
    void minStartValueTest1() {
        int[] nums = { 1, 2 };

        int res = MinimumValueToGetPositiveStepByStepSum.minStartValue(nums);

        // assertion
        assertEquals(1, res);
    }

    @Test
    void minStartValueTest2() {
        int[] nums = { 1, -2, -3 };

        int res = MinimumValueToGetPositiveStepByStepSum.minStartValue(nums);

        // assertion
        assertEquals(5, res);
    }

    @Test
    void minStartValueTest00() {
        int[] nums = { -3, 2, -3, 4, 2 };

        int res = MinimumValueToGetPositiveStepByStepSum.minStartValue1(nums);

        // assertion
        assertEquals(5, res);
    }

    @Test
    void minStartValueTest01() {
        int[] nums = { 1, 2 };

        int res = MinimumValueToGetPositiveStepByStepSum.minStartValue1(nums);

        // assertion
        assertEquals(1, res);
    }

    @Test
    void minStartValueTest02() {
        int[] nums = { 1, -2, -3 };

        int res = MinimumValueToGetPositiveStepByStepSum.minStartValue1(nums);

        // assertion
        assertEquals(5, res);
    }

}
