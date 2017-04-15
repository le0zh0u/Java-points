package com.monicax.service;

/**
 * Desc:
 * 选择排序原理如下：
 * 首先在未排序序列中找到最小元素，存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小元素，放到第二位，以此类推
 * Created by zhouchunjie on 2017/4/15.
 */
public class SelectSort {
    public static void selectSort(int[] source) {
        for (int i = 0; i < source.length; i++) {
            for (int j = i + 1; j < source.length; j++) {
                if (source[i] > source[j]) {
                    swap(source, i, j);
                }
            }
        }
    }

    private static void swap(int[] source, int x, int y) {
        int temp = source[x];
        source[x] = source[y];
        source[y] = temp;
    }

    public static void main(String[] args) {
        int[] a = {4, 2, 1, 6, 3, 6, 0, -5, 1, 1};
        selectSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d   ", a[i]);
        }
    }
}
