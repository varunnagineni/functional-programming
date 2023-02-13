package com.functional.programming.datastructures.algorithms.leetcode.hashing;

import java.util.HashSet;
import java.util.Set;

public class CountingElements {

    public static void main(String[] args) {
        int[] nums = {1,1,3,3,5,5,7,7};
        System.out.println(countElements(nums));
    }

    public static int countElements(int[] nums) {

        Set<Integer> integerSet = new HashSet<>();
        int count = 0;

        for (int j : nums) integerSet.add(j);

        for (int num : nums) {
            if (integerSet.contains(num + 1))
                count++;
        }

        return count;
    }
}
