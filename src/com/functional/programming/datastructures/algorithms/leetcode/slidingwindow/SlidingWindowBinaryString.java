package com.functional.programming.datastructures.algorithms.leetcode.slidingwindow;

public class SlidingWindowBinaryString {

    public static void main (String[] args) {

        String str = "1101100111";
        System.out.println(longestSubStringWithSingleZero(str.toCharArray()));
    }

    public static int longestSubStringWithSingleZero (char[] str) {

        int left = 0;
        int curr = 0;
        int ans = 0;

        for (int right = 0; right < str.length; right++) {
            if (str[right] == '0') {
                curr++;
            }

            while (curr > 1) {
                if (str[left] == '0') {
                    curr--;
                }
                left++;
            }

            ans = Math.max(ans, right - left + 1);

        }
        return ans;
    }
}
