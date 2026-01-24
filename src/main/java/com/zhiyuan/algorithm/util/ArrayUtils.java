package com.zhiyuan.algorithm.util;

public class ArrayUtils {
    public static void swap(int[] arr, int i, int j) {
        if (arr == null || i < 0 || j < 0 || i >= arr.length || j >= arr.length) {
            throw new IllegalArgumentException("Invalid indices or array");
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
