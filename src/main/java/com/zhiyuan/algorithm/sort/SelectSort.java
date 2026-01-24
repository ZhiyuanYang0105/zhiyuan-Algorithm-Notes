package com.zhiyuan.algorithm.sort;

import com.zhiyuan.algorithm.util.ArrayUtils;

public class SelectSort {
    public static int[] selectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                ArrayUtils.swap(arr, i, minIndex);
            }
        }
        return arr;
    }
}
