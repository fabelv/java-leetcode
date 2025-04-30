package net.elvfab.DataStructuresAndAlgorithms.Hashing;

import java.util.HashSet;

import com.google.common.primitives.Ints;

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int max = Integer.MIN_VALUE;

        for (int integer : nums) {
            max = Math.max(integer, max);

            set.add(integer);
        }
        
        for (int i = 0; i < max; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return max + 1;
    }

    public static int missingNumber2(int[] nums){
        int sum = 0;
        int shouldSum = (nums.length + 1) * 2;

        for (int i : nums) {
            sum += i;
        }

        int missing = shouldSum - sum;

        return missing;
    }
}
