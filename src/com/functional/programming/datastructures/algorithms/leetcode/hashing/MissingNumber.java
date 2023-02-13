package com.functional.programming.datastructures.algorithms.leetcode.hashing;

public class MissingNumber {

    public static void main(String[] args) {

        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {

        int expectedResult = nums.length * (nums.length + 1) / 2;
        int actualResult = 0;
        for (int i = 0; i < nums.length; i++) {
            actualResult += nums[i];
        }

        return expectedResult - actualResult;
    }
}
