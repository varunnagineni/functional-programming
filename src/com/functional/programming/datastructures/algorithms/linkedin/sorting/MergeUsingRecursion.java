package com.functional.programming.datastructures.algorithms.linkedin.sorting;

import java.util.Arrays;

/**
 * O(n log(base 2)n)
 * Java collections use merge sort as default sorting algorithm
 */
public class MergeUsingRecursion {

    public static void main(String[] args) {
        MergeUsingRecursion mergeUsingRecursion = new MergeUsingRecursion();
        int[] data = {4, 1, 6, 9, 5};
        mergeUsingRecursion.sort(data);
        System.out.println(Arrays.toString(data));
    }

    public void sort(int[] data) {
        mergeSort(data, 0, data.length-1);
    }

    public void mergeSort(int[] data, int start, int end) {

        if (start < end) {
            //int mid = (int) Math.floor((start + end)/2);
            int mid = (int) Math.floor((start + end) >> 1);
            mergeSort(data, start, mid);
            mergeSort(data, mid+1, start);
            merge(data, start, mid, end);
        }
    }

    public void merge(int[] data, int start, int mid, int end) {

        int sizeOfLeft = mid - start + 1;
        int[] left = new int[sizeOfLeft];

        int sizeOfRight = end - mid;
        int[] right = new int[sizeOfRight];

        for (int i = 0; i < sizeOfLeft; i++) {
            left[i] = data[start + i];
        }

        for (int j = 0; j < sizeOfRight; j++) {
            right[j] = data[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        for (int k = start; k <= end; k++) {

            if ((j >= sizeOfRight) || (i < sizeOfLeft && left[i] <= right[j])) {
                data[k] = left[i];
                i++;
            } else {
                data[k] = right[j];
                j++;
            }
        }
    }

}
