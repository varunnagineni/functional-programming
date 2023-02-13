package com.functional.programming.datastructures.algorithms.leetcode.prefix;

public class NUmberOfWaysToSplitArray {

    public static void main(String[] args) {

        int[] nums = {10, 4, -8, 7};

        System.out.println(waysToSplitArray(nums));
    }

    public static int waysToSplitArray(int[] nums) {

        long[] prefix = new long[nums.length];
        prefix[0] = nums[0];
        //long total = 0;
        //long leftSection = 0;

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i] + prefix[i-1];
        }

        /*for (int num : nums)
            total += num;*/

        int ans = 0;

        for (int i = 0; i < nums.length -1; i++) {
            long leftSection = prefix[i];
            long rightSection = prefix[nums.length -1] - prefix[i];

            if(leftSection >= rightSection)
                ans++;

            /*leftSection += nums[i];
            long rightSection = total - leftSection;
            if (leftSection >= rightSection)
                ans++;*/
        }

        return ans;

    }
}
