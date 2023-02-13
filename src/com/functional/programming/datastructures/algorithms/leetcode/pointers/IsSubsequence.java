package com.functional.programming.datastructures.algorithms.leetcode.pointers;

public class IsSubsequence {

    public static void main (String[] args) {
        String s = "ace";
        String t = "abcde";

        System.out.println(checkIsSubsequence(s, t));

    }

    public static boolean checkIsSubsequence (String s, String t) {

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
