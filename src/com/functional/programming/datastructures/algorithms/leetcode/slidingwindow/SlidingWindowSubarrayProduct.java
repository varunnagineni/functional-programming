package com.functional.programming.datastructures.algorithms.leetcode.slidingwindow;

public class SlidingWindowSubarrayProduct {

    public static void main (String[] args) {

        int[] nums = {10, 5, 2, 6};
        int k = 100;
        System.out.println(getSubarrayProduct(nums, k));
    }

    public static int getSubarrayProduct(int[] nums, int k) {

        if (k <= 1)
            return 0;

        int left = 0;
        int curr = 1;
        int ans = 0;

        for (int right = 0; right < nums.length; right++) {
            curr *= nums[right];

            while (left <= right && curr >= k) {

                curr /= nums[left];
                left++;
            }

            ans += right - left + 1;
        }

        return ans;
    }
}
