package com.xiami.sort;

import java.util.Arrays;

/**
 * Description：插入排序，数组长度n，总共跑了n-1轮，每轮都写出来
 *
 * @version v1.0.0
 * @author：zj
 * @date：2022­02­15 7:33
 */
public class InsertSort1 {
	public static void main(String[] args) {
		int[] arr = {101, 34, 119, 1};
		insertSort(arr); //调用插入排序算法
	}
    //插入排序
    public static void insertSort(int[] arr) {
		//使用逐步推导的方式来讲解，便利理解
		//第1轮 {101, 34, 119, 1};  => {34, 101, 119, 1}
		//说明
		//1. insertIndex >= 0 保证在给insertVal 找插入位置，不越界
		//2. insertVal < arr[insertIndex] 待插入的数，还没有找到插入位置
		//3. 就需要将 arr[insertIndex] 后移

		//定义待插入的数，给第二个数找位置
		int insertVal = arr[1];
		//定义待插入的数的索引
		int insertIndex = 1 - 1; //即arr[1]的前面这个数的下标
		while(insertIndex >= 0 && insertVal < arr[insertIndex] ) {
			arr[insertIndex + 1] = arr[insertIndex];// arr[insertIndex]
			insertIndex--;
		}
		//当退出while循环时，说明插入的位置找到, insertIndex + 1
		//举例：理解不了，我们一会 debug
		arr[insertIndex + 1] = insertVal;

		System.out.println("第1轮插入");
		System.out.println(Arrays.toString(arr));

		//第2轮
		insertVal = arr[2];
		insertIndex = 2 - 1;

		while(insertIndex >= 0 && insertVal < arr[insertIndex] ) {
			arr[insertIndex + 1] = arr[insertIndex];// arr[insertIndex]
			insertIndex--;
		}

		arr[insertIndex + 1] = insertVal;
		System.out.println("第2轮插入");
		System.out.println(Arrays.toString(arr));


		//第3轮
		insertVal = arr[3];
		insertIndex = 3 - 1;

		while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
			arr[insertIndex + 1] = arr[insertIndex];// arr[insertIndex]
			insertIndex--;
		}

		arr[insertIndex + 1] = insertVal;
		System.out.println("第3轮插入");
		System.out.println(Arrays.toString(arr));
    }
}
