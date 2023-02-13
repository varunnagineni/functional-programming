package com.functional.programming.datastructures.algorithms.leetcode.slidingwindow;

public class SlidingWindowMaxConsecutiveOnes {

    public static void main(String[] args) {

        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(longestOnes(nums, 2));
    }

    public static int longestOnes(int[] nums, int k) {

        int left = 0;
        int curr = 0;
        int ans = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                curr++;
            }

            while (curr > k) {
                if (nums[left] == 0) {
                    curr--;
                }
                left++;
            }

            ans = Math.max(ans, right - left + 1);

        }
        return ans;
    }
}
