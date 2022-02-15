package com.xiami.sort;

/**
 * Description：插入排序，数组长度n，总共跑了n-1轮，每轮都写出来
 * 用for简化
 * 测试速度:80w数据
 *
 * @version v1.0.0
 * @author：zj
 * @date：2022­02­15 7:33
 */
public class InsertSort3 {
    public static void main(String[] args) {
        // 创建要给80000个的随机的数组
        int[] arr = new int[80000];
        for (int i = 0; i < 80000; i++) {
            arr[i] = (int) (Math.random() * 8000000); // 生成一个[0, 8000000) 数
        }

        long timeMillis1 = System.currentTimeMillis();
        //调用插入排序算法
        insertSort(arr);
        long timeMillis2 = System.currentTimeMillis();
        System.out.println("花费的时间：" + (timeMillis2-timeMillis1));
    }

    //插入排序
    public static void insertSort(int[] arr) {
        //使用逐步推导的方式来讲解，便利理解
        //第1轮 {101, 34, 119, 1};  => {34, 101, 119, 1}
        //说明
        //1. insertIndex >= 0 保证在给insertVal 找插入位置，不越界
        //2. insertVal < arr[insertIndex] 待插入的数，还没有找到插入位置
        //3. 就需要将 arr[insertIndex] 后移

        int insertVal = 0;
        int insertIndex = 0;
        //定义待插入的数，给第二个数找位置
        for (int i = 1; i < arr.length; i++) {
             insertVal = arr[i];
            //定义待插入的数的索引
             insertIndex = i - 1; //即arr[1]的前面这个数的下标
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];// arr[insertIndex]
                insertIndex--;//一开始要插入的数，换了位置还要和前面的元素进行比较，并换位
            }
            //当退出while循环时，说明插入的位置找到, insertIndex + 1
            //举例：理解不了，我们一会 debug
            if(insertIndex + 1 != i) {//如果要插入的元素位置不正确，才要去赋值
                arr[insertIndex + 1] = insertVal;
            }
            //System.out.println("第"+i+"轮插入");
            //System.out.println(Arrays.toString(arr));
        }
    }
}
