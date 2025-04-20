package net.elvfab.DataStructuresAndAlgorithms.ArraysAndStrings;

public class RunningSumOf1dArray {

    // O(n^2)
    public static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];

        for (int i = 0; i < runningSum.length; i++) {

            int currentSum = 0;

            for (int j = 0; j <= i; j++) {
                currentSum += nums[j];
            }

            runningSum[i] = currentSum;
        }

        return runningSum;
    }

    public static int[] runningSum2(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        return nums;
    }
}
