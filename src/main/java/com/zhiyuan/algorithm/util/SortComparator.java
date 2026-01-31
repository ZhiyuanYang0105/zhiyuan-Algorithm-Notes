package com.zhiyuan.algorithm.util;

import java.util.Arrays;

public class SortComparator {

    /**
     * 生成随机数组
     *
     * @param maxLen   数组最大长度
     * @param maxValue 数值绝对值最大范围
     */
    public static int[] generateRandomArray(int maxLen, int maxValue) {
        int len = (int) (Math.random() * (maxLen + 1));
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            // 生成 [-maxValue, maxValue] 范围的数
            arr[i] = (int) (Math.random() * (maxValue + 1))
                    - (int) (Math.random() * (maxValue + 1));
        }
        return arr;
    }

    /**
     * 拷贝数组
     */
    public static int[] copyArray(int[] arr) {
        if (arr == null) return null;
        return Arrays.copyOf(arr, arr.length);
    }

    /**
     * 对数器中的“绝对正确”方法
     */
    public static void comparator(int[] arr) {
        Arrays.sort(arr);
    }

    /**
     * 判断两个数组是否相等
     */
    public static boolean isEqual(int[] arr1, int[] arr2) {
        if (arr1 == null && arr2 == null) return true;
        if (arr1 == null || arr2 == null) return false;
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    /**
     * 打印数组（用于出错时 debug）
     */
    public static void printArray(int[] arr) {
        if (arr == null) {
            System.out.println("null");
            return;
        }
        System.out.println(Arrays.toString(arr));
    }
}
