package com.functional.programming.datastructures.algorithms.leetcode.pointers;

import java.util.Arrays;

public class SquaresOfSortedArray {

    public static void main (String[] args) {

        int[] nums = {-10, -7, -4, 1, 4, 9};

        System.out.println(Arrays.toString(square(nums, 0, nums.length - 1)));
    }

    public static int[] square(int[] nums, int left, int right) {

        int[] result = new int[nums.length];

        for (int i = right; i >= 0; i--)  {
            int square;
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                square = (int) Math.pow(nums[left], 2);
                left++;
            } else {
                square = (int) Math.pow(nums[right], 2);
                right--;
            }
            result[i] = square;
        }

        return result;
    }
}
