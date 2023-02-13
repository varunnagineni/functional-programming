package com.functional.programming.datastructures.algorithms.leetcode.pointers;

import java.util.ArrayList;
import java.util.List;

public class CombineTwoSortedArrays {

    public static void main (String[] args) {

        int[] arr1 = {1, 2, 4, 7, 20};
        int[] arr2 = {3, 5, 6};
        combineArrays(arr1, arr2);
    }

    public static void combineArrays (int[] arr1, int[] arr2) {

        List<Integer> answer = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                answer.add(arr1[i]);
                i++;
            } else {
                answer.add(arr2[j]);
                j++;
            }
        }

        while (i < arr1.length) {
            answer.add(arr1[i]);
            i++;
        }

        while (j < arr2.length) {
            answer.add(arr2[j]);
            j++;
        }

        System.out.println(answer);
    }
}
