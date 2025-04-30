package net.elvfab.DataStructuresAndAlgorithms.Hashing;

import java.util.HashSet;

public class CheckIfTheSentenceIsPangram {

    public static boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<Character>();
        int counter = 0;

        for (Character c : sentence.toCharArray()) {
            if (set.add(c))
                counter++;
            if (counter == 26) {
                return true;
            }
        }

        return false;
    }
}
