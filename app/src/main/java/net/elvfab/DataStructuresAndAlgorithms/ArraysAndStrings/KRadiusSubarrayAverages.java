package net.elvfab.DataStructuresAndAlgorithms.ArraysAndStrings;

import java.util.Arrays;

public class KRadiusSubarrayAverages {

    public static int[] getAverages(int[] nums, int k) {

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (k != 0 && (i < k || i >= (nums.length - k))) {
                result[i] = -1;
            } else {
                long sum = 0;
                for (int j = i - k; j <= i + k; j++) {
                    sum += nums[j];
                }
                result[i] = (int) (sum / ((2 * k) + 1));
            }
        }

        return result;
    }

    public static int[] getAverages2(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n];
        if (k == 0)
            return nums;
        if (2 * k + 1 > n) {
            Arrays.fill(result, -1);
            return result;
        }

        Arrays.fill(result, -1);

        long windowSum = 0;
        int windowSize = 2 * k + 1;

        for (int i = 0; i < n; i++) {
            windowSum += nums[i];

            if (i >= windowSize - 1) {
                result[i - k] = (int) (windowSum / windowSize);
                windowSum -= nums[i - windowSize + 1];
            }
        }

        return result;
    }
}
