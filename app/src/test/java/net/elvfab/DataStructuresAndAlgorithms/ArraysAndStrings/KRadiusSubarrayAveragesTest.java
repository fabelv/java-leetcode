package net.elvfab.DataStructuresAndAlgorithms.ArraysAndStrings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KRadiusSubarrayAveragesTest {

    @Test
    void getAveragesTest() {
        int[] nums = { 7, 4, 3, 9, 1, 8, 5, 2, 6 };
        int k = 3;

        int[] res = KRadiusSubarrayAverages.getAverages(nums, k);

        // assertion
        assertArrayEquals(new int[] { -1, -1, -1, 5, 4, 4, -1, -1, -1 }, res);
    }

    @Test
    void getAveragesTest1() {
        int[] nums = { 100000 };
        int k = 0;

        int[] res = KRadiusSubarrayAverages.getAverages(nums, k);

        // assertion
        assertArrayEquals(new int[] { 100000 }, res);
    }

    @Test
    void getAveragesTest2() {
        int[] nums = { 8 };
        int k = 100000;

        int[] res = KRadiusSubarrayAverages.getAverages(nums, k);

        // assertion
        assertArrayEquals(new int[] { -1 }, res);
    }

    @Test
    void getAveragesTest3() {
        int[] nums = { 40527, 53696, 10730, 66491, 62141, 83909, 78635, 18560 };
        int k = 2;

        int[] res = KRadiusSubarrayAverages.getAverages(nums, k);

        // assertion
        assertArrayEquals(new int[] { -1, -1, 46717, 55393, 60381, 61947, -1, -1 }, res);
    }

    @Test
    void getAveragesTest20() {
        int[] nums = { 7, 4, 3, 9, 1, 8, 5, 2, 6 };
        int k = 3;

        int[] res = KRadiusSubarrayAverages.getAverages2(nums, k);

        // assertion
        assertArrayEquals(new int[] { -1, -1, -1, 5, 4, 4, -1, -1, -1 }, res);
    }

    @Test
    void getAveragesTest21() {
        int[] nums = { 100000 };
        int k = 0;

        int[] res = KRadiusSubarrayAverages.getAverages2(nums, k);

        // assertion
        assertArrayEquals(new int[] { 100000 }, res);
    }

    @Test
    void getAveragesTest22() {
        int[] nums = { 8 };
        int k = 100000;

        int[] res = KRadiusSubarrayAverages.getAverages2(nums, k);

        // assertion
        assertArrayEquals(new int[] { -1 }, res);
    }

    @Test
    void getAveragesTest23() {
        int[] nums = { 40527, 53696, 10730, 66491, 62141, 83909, 78635, 18560 };
        int k = 2;

        int[] res = KRadiusSubarrayAverages.getAverages2(nums, k);

        // assertion
        assertArrayEquals(new int[] { -1, -1, 46717, 55393, 60381, 61947, -1, -1 }, res);
    }

}
