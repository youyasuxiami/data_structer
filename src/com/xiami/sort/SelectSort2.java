package com.xiami.sort;

import java.util.Arrays;

/**
 * Description：选择排序，每一轮都写出来
 * 观察到规律,使用两层for循环
 *
 * @version v1.0.0
 * @author：zj
 * @date：2022?02?14 22:43
 */
public class SelectSort2 {
    public static void main(String[] args) {
        //int[] arr = {101, 34, 119, 1};下面加多元素
        int[] arr = {101, 34, 119, 1, -1, 90, 123};
        System.out.println("排序前");
        System.out.println(Arrays.toString(arr));
        selectSort(arr);
        System.out.println("排序后");
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr) {
        //在推导的过程，我们发现了规律，因此，可以使用for来解决
        //选择排序时间复杂度是 O(n^2)
        for (int i = 0; i < arr.length - 1; i++) {//n-1次轮
            int minIndex = i;
            int min = arr[i];//假定一个最小值，不是最小再重新确定
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) { //说明假定的最小值，并不是最小
                    min = arr[j]; //重置min
                    minIndex = j; //重置minIndex
                }
            }
            //将最小值，放在arr[0], 即交换
            if (minIndex != i) {//不等于当前位才去交换
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
            //System.out.println("第"+(i+1)+"轮后~~");
            //System.out.println(Arrays.toString(arr));// 1, 34, 119, 101
        }
    }
}
