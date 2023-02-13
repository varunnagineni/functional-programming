package com.functional.programming.datastructures.algorithms.linkedin.sorting;

import java.util.Arrays;

public class Insertion {

    public static void main (String[] args) {

        int[] nums = {10, 2, 8, 6, 7, 3};
        System.out.println(Arrays.toString(insertionSort(nums)));
    }
    public static int[] insertionSort(int[] nums) {

        int curr;
        for (int i = 0; i < nums.length; i++) {
            curr = nums[i];
            System.out.println("i value : " + i);
            int j = i-1;
            System.out.println("j value : " + j);
            System.out.println("Current value : " + curr);
            while (j >= 0 && nums[j] > curr) {
                System.out.println("nums[j] : " + nums[j]);
                nums[j+1] = nums[j];
                j = j - 1;
                System.out.println("j-1 : " + j);
            }
            j = j+1;
            nums[j] = curr;
            System.out.println("j+1 : " + j);
            System.out.println("===========================");
        }
        return nums;
    }
}
