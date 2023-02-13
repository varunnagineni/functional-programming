package com.functional.programming.datastructures.algorithms.linkedin.sorting;

public class Quick {

    public static void main(String[] args) {

    }

    public void sort (int[] data) {

    }

    public void quickSort (int[] data, int start, int end) {
        int pivot;
        if (start < end) {
            pivot = partition(data, start, end);
            quickSort(data, start, pivot-1);
            quickSort(data, pivot+1, end);
        }
    }

    public int partition(int[] data, int start, int end) {
        int pivot = data[end];
        int i = start;
        for (int j = i; j < end; j++) {

        }
        return 1;
    }
}
