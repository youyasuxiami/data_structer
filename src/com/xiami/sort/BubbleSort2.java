package com.xiami.sort;

import java.util.Arrays;

/**
 * Description：冒泡排序，每趟排序代码都写一次
 *  这里去掉前面的重复代码
 *
 * @version v1.0.0
 * @author：zj
 * @date：2022­02­14 21:22
 */
public class BubbleSort2 {
    public static void main(String[] args) {
        int[] arr = {3, 9, -1, 10, -2};

        //一趟排序，就是将最大的数排在最后
        int temp = 0;//临时变量
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 如果前面的数比后面的数大，则交换
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("第"+i+1+"趟排序后");
            System.out.println(Arrays.toString(arr));
        }
    }
}
