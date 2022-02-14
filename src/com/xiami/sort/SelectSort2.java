package com.xiami.sort;

import java.util.Arrays;

/**
 * Description��ѡ������ÿһ�ֶ�д����
 * �۲쵽����,ʹ������forѭ��
 *
 * @version v1.0.0
 * @author��zj
 * @date��2022?02?14 22:43
 */
public class SelectSort2 {
    public static void main(String[] args) {
        //int[] arr = {101, 34, 119, 1};����Ӷ�Ԫ��
        int[] arr = {101, 34, 119, 1, -1, 90, 123};
        System.out.println("����ǰ");
        System.out.println(Arrays.toString(arr));
        selectSort(arr);
        System.out.println("�����");
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr) {
        //���Ƶ��Ĺ��̣����Ƿ����˹��ɣ���ˣ�����ʹ��for�����
        //ѡ������ʱ�临�Ӷ��� O(n^2)
        for (int i = 0; i < arr.length - 1; i++) {//n-1����
            int minIndex = i;
            int min = arr[i];//�ٶ�һ����Сֵ��������С������ȷ��
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) { //˵���ٶ�����Сֵ����������С
                    min = arr[j]; //����min
                    minIndex = j; //����minIndex
                }
            }
            //����Сֵ������arr[0], ������
            if (minIndex != i) {//�����ڵ�ǰλ��ȥ����
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
            //System.out.println("��"+(i+1)+"�ֺ�~~");
            //System.out.println(Arrays.toString(arr));// 1, 34, 119, 101
        }
    }
}
