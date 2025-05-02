package net.elvfab.DataStructuresAndAlgorithms.Hashing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FindPlayersWithZeroOrOneLossesTest {

    @Test
    void testFindWinners() {
        int[][] matches = new int[][] {
            { 1, 3 }, { 2, 3 }, { 3, 6 }, { 5, 6 }, { 5, 7 },
            { 4, 5 }, { 4, 8 }, { 4, 9 }, { 10, 4 }, { 10, 9 }
        };

        List<List<Integer>> actual = FindPlayersWithZeroOrOneLosses.findWindders(matches);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2, 10)); 
        expected.add(Arrays.asList(4, 5, 7, 8)); 

        assertEquals(expected, actual);
    }

}
