package net.elvfab.DataStructuresAndAlgorithms.Hashing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MissingNumberTest {

    @Test
    void missingNumberTest() {
        int[] nums = new int[] { 3, 0, 1 };

        int res = MissingNumber.missingNumber(nums);

        // assertion
        assertEquals(2, res);
    }
}
