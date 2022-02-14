package com.xiami.sort;

import java.util.Arrays;

/**
 * Description：冒泡排序，
 *  代码优化
 *
 * @version v1.0.0
 * @author：zj
 * @date：2022­02­14 21:22
 */
public class BubbleSort3 {
    public static void main(String[] args) {
        //int[] arr = {3, 9, -1, 10, -2};//看不出break的效果，换下面这个
        int[] arr = {3, 9, -1, 10, 20};

        //一趟排序，就是将最大的数排在最后
        int temp = 0;//临时变量
        boolean flag=false;//标志变量：表示是否进行过交换
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 如果前面的数比后面的数大，则交换
                if (arr[j] > arr[j + 1]) {
                    //标志
                    flag=true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if(!flag){//在一趟排序中，一趟交换都没有,那么这个数组的顺序就是我们要的
                break;
            }else{
                flag=false;//重置flag，进行下次判断
            }
            System.out.println("第"+(i+1)+"趟排序后");
            System.out.println(Arrays.toString(arr));
        }
    }
}
