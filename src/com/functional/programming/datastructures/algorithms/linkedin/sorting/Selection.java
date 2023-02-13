package com.functional.programming.datastructures.algorithms.linkedin.sorting;

import java.util.Arrays;

public class Selection {

    public static void main (String[] args) {

        int[] nums = {10, 2, 8, 6, 7, 3};
        System.out.println(Arrays.toString(selectionSort(nums)));
    }

    public static int[] selectionSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int index = i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] < nums[index]) {
                    index = j;
                }
            }
            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
}
