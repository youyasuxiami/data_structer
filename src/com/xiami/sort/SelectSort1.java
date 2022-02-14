package com.xiami.sort;

import java.util.Arrays;

/**
 * Description：选择排序，每一轮都写出来
 *
 * @version v1.0.0
 * @author：zj
 * @date：2022?02?14 22:43
 */
public class SelectSort1 {
    public static void main(String[] args) {
        int[] arr = {101, 34, 119, 1};
        selectSort(arr);
    }

    public static void selectSort(int[] arr) {
        //使用逐步推导的方式来，讲解选择排序
        //第1轮
        //原始的数组 ： 	101, 34, 119, 1
        //第一轮排序 :   	1, 34, 119, 101
        //算法 先简单--》 做复杂， 就是可以把一个复杂的算法，拆分成简单的问题-》逐步解决

        //第1轮，找到最小值和最小值的下标
        int minIndex = 0;
        int min = arr[0];//假定一个最小值，不是最小再重新确定
        for (int j = 0 + 1; j < arr.length; j++) {
            if (min > arr[j]) { //说明假定的最小值，并不是最小
                min = arr[j]; //重置min
                minIndex = j; //重置minIndex
            }
        }

        //将最小值，放在arr[0], 即交换
        if (minIndex != 0) {//不等于当前位才去交换
            arr[minIndex] = arr[0];
            arr[0] = min;
        }

        System.out.println("第1轮后~~");
        System.out.println(Arrays.toString(arr));// 1, 34, 119, 101


        //第2轮
        minIndex = 1;
        min = arr[1];
        for (int j = 1 + 1; j < arr.length; j++) {
            if (min > arr[j]) { // 说明假定的最小值，并不是最小
                min = arr[j]; // 重置min
                minIndex = j; // 重置minIndex
            }
        }

        // 将最小值，放在arr[0], 即交换
        if (minIndex != 1) {
            arr[minIndex] = arr[1];
            arr[1] = min;
        }

        System.out.println("第2轮后~~");
        System.out.println(Arrays.toString(arr));// 1, 34, 119, 101

        //第3轮
        minIndex = 2;
        min = arr[2];
        for (int j = 2 + 1; j < arr.length; j++) {
            if (min > arr[j]) { // 说明假定的最小值，并不是最小
                min = arr[j]; // 重置min
                minIndex = j; // 重置minIndex
            }
        }

        // 将最小值，放在arr[0], 即交换
        if (minIndex != 2) {
            arr[minIndex] = arr[2];
            arr[2] = min;
        }

        System.out.println("第3轮后~~");
        System.out.println(Arrays.toString(arr));// 1, 34, 101, 119 */


    }
}
