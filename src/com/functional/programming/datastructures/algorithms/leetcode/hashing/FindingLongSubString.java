package com.functional.programming.datastructures.algorithms.leetcode.hashing;

import java.util.HashMap;
import java.util.Map;

public class FindingLongSubString {

    public static void main(String[] args) {

        String str = "eceba";
        System.out.println(findLongestSubString(str, 2));
    }

    public static int findLongestSubString(String str, int k) {

        Map<Character, Integer> countMap = new HashMap<>();

        int left = 0;
        int ans = 0;

        for (int right = 0; right < str.length(); right++) {
            char c = str.charAt(right);
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
            if (countMap.size() > k) {
                char toRemove = str.charAt(left);
                countMap.put(toRemove, countMap.getOrDefault(c, 0) - 1);
                if (countMap.get(toRemove) == 0) {
                    countMap.remove(toRemove);
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
