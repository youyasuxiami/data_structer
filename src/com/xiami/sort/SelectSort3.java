package com.xiami.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * Description：选择排序，每一轮都写出来
 * 观察到规律,使用两层for循环
 * 测试8w数据的选择排序的速度
 *
 * @version v1.0.0
 * @author：zj
 * @date：2022?02?14 22:43
 */
public class SelectSort3 {
    public static void main(String[] args) {
        int[] arr = new int[80000];

        for (int i = 0; i < 80000; i++) {
            arr[i] = (int) (Math.random() * 8000000); // 生成一个[0, 8000000) 数
        }

        Date data1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str = simpleDateFormat.format(data1);
        System.out.println("排序前的时间是=" + date1Str);

        //选择排序
        selectSort(arr);

        Date data2 = new Date();
        String date2Str = simpleDateFormat.format(data2);
        System.out.println("排序前的时间是=" + date2Str);
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
