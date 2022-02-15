package com.xiami.sort.bubbleSort;

import java.util.Arrays;

/**
 * Description：冒泡排序，
 *  代码优化+将前面的冒泡排序算法，封装成一个方法
 *
 * @version v1.0.0
 * @author：zj
 * @date：2022­02­14 21:22
 */
public class BubbleSort4 {
    public static void main(String[] args) {
        //int[] arr = {3, 9, -1, 10, -2};//看不出break的效果，换下面这个
        int[] arr = {3, 9, -1, 10, 20};

        System.out.println("排序前的数组");
        System.out.println(Arrays.toString(arr));
        //测试冒泡排序算法
        bubbleSort(arr);
        System.out.println("排序后的数组");
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 将前面额冒泡排序算法，封装成一个方法
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        // 冒泡排序 的时间复杂度 O(n^2), 自己写出
        int temp = 0; // 临时变量
        boolean flag = false; // 标识变量，表示是否进行过交换
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 如果前面的数比后面的数大，则交换
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            if (!flag) { // 在一趟排序中，一次交换都没有发生过
                break;
            } else {
                flag = false; // 重置flag!!!, 进行下次判断
            }
        }
    }

}
