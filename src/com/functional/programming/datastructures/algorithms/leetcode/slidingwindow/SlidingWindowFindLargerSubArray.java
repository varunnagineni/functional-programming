package com.functional.programming.datastructures.algorithms.leetcode.slidingwindow;

/**
 * a) Pass the input and target K values to findlength method
 * b) Assign left, curr and ans to 0
 * c) Set right to 0, and iterate
 *      1) add nums[right] value to curr variable
 *      2) Check if curr is greater than k
 *          a) if curr is greater than k, then remove num[left] value from curr
 *          b) do left++
 *      3) set the max length to ans by comparing ans and (right - left + 1)
 */
public class SlidingWindowFindLargerSubArray {

    public static void main (String[] args) {

        int[] nums = {3, 1, 2, 7, 4, 2, 1, 1, 5, 1, 1, 1, 1, 2, 2};
        int k = 8;
        System.out.println(findLength(nums, k));

    }

    public static int findLength (int[] nums, int k) {

        int left = 0;
        int curr = 0;
        int ans = 0;

        for (int right = 0; right < nums.length; right++) {
            curr += nums[right];
            while (curr > k) {
                curr -= nums[left];
                left++;
            }
            ans = Math.max(ans, right - left + 1);
            System.out.println(ans);
        }
        return ans;
    }
}
