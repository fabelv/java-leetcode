package net.elvfab.DataStructuresAndAlgorithms.Hashing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CheckIfTheSentenceIsPangramTest {

    @Test
    void testCechIfPangram1() {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        boolean result = CheckIfTheSentenceIsPangram.checkIfPangram(sentence);

        // assertion
        assertEquals(true, result);
    }

    @Test
    void testCechIfPangram2() {
        String sentence = "leetcode";

        boolean result = CheckIfTheSentenceIsPangram.checkIfPangram(sentence);

        // assertion
        assertEquals(false, result);
    }

}
