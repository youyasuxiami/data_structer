package com.xiami.sort.bubbleSort;

import java.util.Arrays;

/**
 * Description：冒泡排序，每趟排序代码都写一次
 *
 * @version v1.0.0
 * @author：zj
 * @date：2022­02­14 21:22
 */
public class BubbleSort1 {
    public static void main(String[] args) {
        int arr[] = {3, 9, -1, 10, -2};

        //第一趟排序，就是将最大的数排在最后
        int temp = 0;//临时变量
        for (int j = 0; j < arr.length - 1 - 0; j++) {
            // 如果前面的数比后面的数大，则交换
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        System.out.println("第一趟排序后");
        System.out.println(Arrays.toString(arr));

        //第二趟，也就是排在最后（冒泡）的那个数不参与排序，就是将第二大的数排在倒数第二位
        for (int j = 0; j < arr.length - 1 - 1; j++) {
            // 如果前面的数比后面的数大，则交换
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        System.out.println("第二趟排序后");
        System.out.println(Arrays.toString(arr));

        //第三趟，就是将第三大的数排在倒数第三位
        for (int j = 0; j < arr.length - 1 - 2; j++) {
            // 如果前面的数比后面的数大，则交换
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        System.out.println("第三趟排序后");
        System.out.println(Arrays.toString(arr));

        //第四趟，就是将第四大的数排在倒数第四位
        for (int j = 0; j < arr.length - 1 - 3; j++) {
            // 如果前面的数比后面的数大，则交换
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        System.out.println("第四趟排序后");
        System.out.println(Arrays.toString(arr));
    }
}
