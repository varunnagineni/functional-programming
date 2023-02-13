package com.functional.programming.datastructures.algorithms.linkedin.sorting;

import java.util.Arrays;

public class Bubble {

    public static void main (String[] args) {

        int[] nums = {10, 2, 8, 6, 7, 3};
        System.out.println(Arrays.toString(bubbleSort(nums)));
    }

    public static int[] bubbleSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                System.out.println(j);
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}
