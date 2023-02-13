package com.functional.programming.datastructures.algorithms.leetcode.prefix;

public class MinimumValueToGetPositive {

    public static void main(String[] args) {

        int[] nums = {1,-2,-3};
        System.out.println(minStartValue(nums));
    }

    public static int minStartValue(int[] nums) {

        int min = 0;
        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];

            if (total < 0){
                min = Math.min(min, total);
            }

        }
        return Math.abs(min) + 1;
    }
}
