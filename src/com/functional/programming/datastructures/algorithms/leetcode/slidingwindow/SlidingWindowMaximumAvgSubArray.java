package com.functional.programming.datastructures.algorithms.leetcode.slidingwindow;

public class SlidingWindowMaximumAvgSubArray {

    public static void main(String[] args) {

        int[] nums = {1, 12, -5, -6, 50, 3};
        System.out.println(findMaxAverage(nums, 4));
    }

    public static double findMaxAverage(int[] nums, int k) {

        double curr = 0.0;

        for (int i = 0; i < k; i++)
            curr += nums[i];

        double ans = curr;
        System.out.println(ans);

        for (int i = k; i < nums.length; i++) {
            curr += nums[i] - nums[i-k];

            ans = Math.max(ans, curr);
            System.out.println(ans);
        }

        return ans/k;
    }
}
