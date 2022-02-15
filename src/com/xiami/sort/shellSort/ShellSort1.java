package com.xiami.sort.shellSort;

import java.util.Arrays;

/**
 * Description：希尔排序，一步步推导
 * 方式一：交换式
 *
 * @version v1.0.0
 * @author：zj
 * @date：2022­02­15 8:40
 */
public class ShellSort1 {
    public static void main(String[] args) {
        int[] arr = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        shellSort(arr); //交换式
    }

    // 使用逐步推导的方式来编写希尔排序
    // 希尔排序时， 对有序序列在插入时采用交换法,
    // 思路(算法) ===> 代码
    public static void shellSort(int[] arr) {
        int temp = 0;
        // 希尔排序的第1轮排序
        // 因为第1轮排序，是将10个数据分成了 5组
        for (int i = 5; i < arr.length; i++) {
            // 遍历各组中所有的元素(共5组，每组有2个元素), 步长5
            for (int j = i - 5; j >= 0; j -= 5) {
                // 如果当前元素大于加上步长后的那个元素，说明交换
                if (arr[j] > arr[j + 5]) {
                    temp = arr[j];
                    arr[j] = arr[j + 5];
                    arr[j + 5] = temp;
                }
            }
        }

        System.out.println("希尔排序1轮后=" + Arrays.toString(arr));//


        // 希尔排序的第2轮排序
        // 因为第2轮排序，是将10个数据分成了 5/2 = 2组
        for (int i = 2; i < arr.length; i++) {
            // 遍历各组中所有的元素(共5组，每组有2个元素), 步长5
            for (int j = i - 2; j >= 0; j -= 2) {
                // 如果当前元素大于加上步长后的那个元素，说明交换
                if (arr[j] > arr[j + 2]) {
                    temp = arr[j];
                    arr[j] = arr[j + 2];
                    arr[j + 2] = temp;
                }
            }
        }

        System.out.println("希尔排序2轮后=" + Arrays.toString(arr));//

        // 希尔排序的第3轮排序
        // 因为第3轮排序，是将10个数据分成了 2/2 = 1组
        for (int i = 1; i < arr.length; i++) {
            // 遍历各组中所有的元素(共5组，每组有2个元素), 步长5
            for (int j = i - 1; j >= 0; j -= 1) {
                // 如果当前元素大于加上步长后的那个元素，说明交换
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("希尔排序3轮后=" + Arrays.toString(arr));//
    }
}
