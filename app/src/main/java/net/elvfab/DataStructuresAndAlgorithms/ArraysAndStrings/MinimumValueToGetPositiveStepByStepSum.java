package net.elvfab.DataStructuresAndAlgorithms.ArraysAndStrings;

public class MinimumValueToGetPositiveStepByStepSum {

    public static int minStartValue(int[] nums) {
        int startValue = 1;
        int sum = 0;

        while (sum <= 0) {

            sum = startValue;
            for (int i = 0; i < nums.length; i++) {
                sum = sum + nums[i];
                if (sum < 1) {
                    startValue++;
                    break;
                }
            }

        }

        return startValue;
    }

    public static int minStartValue1(int[] nums) {

        // find min sum in nums
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            min = Math.min(min, sum);
        }

        return min >= 0 ? 1 : (1 - min);
    }

}
