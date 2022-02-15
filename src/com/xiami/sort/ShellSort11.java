package com.xiami.sort;

import java.util.Arrays;

/**
 * Description：希尔排序，一步步推导
 * 方式二：移位式
 *
 * @version v1.0.0
 * @author：zj
 * @date：2022­02­15 8:40
 */
public class ShellSort11 {
    public static void main(String[] args) {
        int[] arr = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        System.out.println("排序前");
        System.out.println(Arrays.toString(arr));
        shellSort2(arr); //移位法
        System.out.println("排序后");
        System.out.println(Arrays.toString(arr));
    }

    //对交换式的希尔排序进行优化->移位法（整合了插入排序）
    public static void shellSort2(int[] arr) {
        // 增量gap, 并逐步的缩小增量
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            // 从第gap个元素，逐个对其所在的组进行直接插入排序
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                int temp = arr[j];
                if (arr[j] < arr[j - gap]) {
                    while (j - gap >= 0 && temp < arr[j - gap]) {//表示还没找到位置
                        //移动
                        arr[j] = arr[j - gap];
                        j -= gap;//一开始要插入的数，换了位置还要和前面的元素进行比较，并换位
                    }
                    //当退出while后，（就找到位置了）就给temp找到插入的位置
                    arr[j] = temp;
                }
            }
        }
    }
}
