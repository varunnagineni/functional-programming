package com.functional.programming.datastructures.algorithms.leetcode.pointers;

public class FindTheTarget {

    public static void main (String[] args) {

        int[] nums = {1, 2, 4, 6, 8, 9, 14, 15};

        System.out.println(findTheTarget(nums, 13));
    }

    public static boolean findTheTarget (int[] nums, int target) {

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {

            int val = nums[i] + nums[j];

            if (val == target) {
                return true;
            }

            if (val > target) {
                j --;
            } else {
                i ++;
            }
        }
        return false;
    }
}
