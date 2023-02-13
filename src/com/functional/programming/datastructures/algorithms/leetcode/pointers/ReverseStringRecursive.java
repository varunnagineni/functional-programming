package com.functional.programming.datastructures.algorithms.leetcode.pointers;

public class ReverseStringRecursive {

    public static void main (String[] args) {

        String s = "hello";
        reverseString(s.toCharArray(), 0, s.length()-1);
    }

    public static void reverseString(char[] s, int left, int right) {
        if (left == right)
            return;
        char temp = s[left];
        s[left++] = s[right];
        s[right--] = temp;
        reverseString(s, left, right);
        System.out.println(s);
    }

}
