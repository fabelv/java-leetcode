package net.elvfab.DataStructuresAndAlgorithms.ArraysAndStrings;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class RunningSumOf1dArrayTest {

    @Test
    void runningSumTest() {
        int[] nums = { 1, 2, 3, 4 };

        int[] res = RunningSumOf1dArray.runningSum(nums);

        // assertion
        assertArrayEquals(new int[] { 1, 3, 6, 10 }, res);
    }

    @Test
    void runningSumTest2() {
        int[] nums = { 1, 1, 1, 1, 1 };

        int[] res = RunningSumOf1dArray.runningSum(nums);

        // assertion
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, res);
    }

    @Test
    void runningSumTest3() {
        int[] nums = { 3, 1, 2, 10, 1 };

        int[] res = RunningSumOf1dArray.runningSum(nums);

        // assertion
        assertArrayEquals(new int[] { 3, 4, 6, 16, 17 }, res);
    }

    @Test
    void runningSumTest11() {
        int[] nums = { 1, 2, 3, 4 };

        int[] res = RunningSumOf1dArray.runningSum2(nums);

        // assertion
        assertArrayEquals(new int[] { 1, 3, 6, 10 }, res);
    }

    @Test
    void runningSumTest21() {
        int[] nums = { 1, 1, 1, 1, 1 };

        int[] res = RunningSumOf1dArray.runningSum2(nums);

        // assertion
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, res);
    }

    @Test
    void runningSumTest31() {
        int[] nums = { 3, 1, 2, 10, 1 };

        int[] res = RunningSumOf1dArray.runningSum2(nums);

        // assertion
        assertArrayEquals(new int[] { 3, 4, 6, 16, 17 }, res);
    }

}
