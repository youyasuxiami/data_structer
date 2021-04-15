package com.xiami;

/**
 * Description：
 *
 * @version v1.0.0
 * @author：zj
 * @date：2021­04­15 9:52
 */
public class SparseArray {
    public static void main(String[] args) {
        //创建一个11*11的二维数组
        int[][] chessArr1 = new int[11][11];
        chessArr1[1][2]=1;
        chessArr1[2][3]=2;
        //输出原始的二维数组
        for (int[] integers : chessArr1) {
            for (Integer integer : integers) {
                System.out.printf("%d\t",integer);
            }
            System.out.println();
        }
        System.out.println("二维数组转为稀疏数组==================");
        //获得棋盘数据不为0的个数
        int num=0;
        for (int[] ints1 : chessArr1) {
            for (int i : ints1) {
                if(i!=0){
                    num++;
                }
            }
        }
        int[][] newSparseArray = new int[num+1][3];
        newSparseArray[0][0]=chessArr1.length;
        newSparseArray[0][1]=chessArr1[0].length;
        newSparseArray[0][2]=num;
        int count=0;
        for (int i = 0; i < chessArr1.length; i++) {
            for (int j = 0; j < chessArr1.length; j++) {
                if(chessArr1[i][j]!=0){
                    count++;
                    newSparseArray[count][0]=i;
                    newSparseArray[count][1]=j;
                    newSparseArray[count][2]=chessArr1[i][j];
                }
            }
        }
        for (int[] ints : newSparseArray) {
            for (int anInt : ints) {
                System.out.printf("%d\t",anInt);
            }
            System.out.println();
        }
        System.out.println("=====================");
        System.out.println("稀疏数组转为二维数组");
        //二维数组
        int[][] ints = new int[newSparseArray[0][0]][newSparseArray[0][1]];
        for (int i = 1; i < newSparseArray.length; i++) {
            ints[newSparseArray[i][0]][newSparseArray[i][1]]=newSparseArray[i][2];
        }
        for (int[] integers : ints) {
            for (int integer : integers) {
                System.out.printf("%d\t",integer);
            }
            System.out.println();
        }
    }
}
