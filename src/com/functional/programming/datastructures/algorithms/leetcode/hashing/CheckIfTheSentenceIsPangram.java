package com.functional.programming.datastructures.algorithms.leetcode.hashing;

import java.util.HashSet;
import java.util.Set;

public class CheckIfTheSentenceIsPangram {

    public static void main(String[] args) {
        String sent = "thequickbrownfoxjumpsoverthelazydog";

        System.out.println(checkIfPangram(sent));
    }

    public static boolean checkIfPangram(String sent) {

        /*Set<Character> finalSet = new HashSet<>();
        finalSet.add(sent.charAt(0));

        for (int i = 1; i < sent.length(); i++) {
            finalSet.add(sent.charAt(i));
        }

        return finalSet.size() == 26;*/

        for (int i = 0; i < 26; i++) {
            char current = (char) ('a' + i);

            if (sent.indexOf(current) == -1)
                return false;
        }

        return true;
    }
}
