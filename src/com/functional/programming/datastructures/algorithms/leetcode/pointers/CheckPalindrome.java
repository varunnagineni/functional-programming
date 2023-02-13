package com.functional.programming.datastructures.algorithms.leetcode.pointers;

public class CheckPalindrome {

    public static void main (String[] args) {

        String s = "racecar";

        System.out.println(checkIfPalindrome(s));
    }

    public static boolean checkIfPalindrome (String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }
}
