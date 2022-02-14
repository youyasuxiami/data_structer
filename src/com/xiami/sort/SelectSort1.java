package com.xiami.sort;

import java.util.Arrays;

/**
 * Description��ѡ������ÿһ�ֶ�д����
 *
 * @version v1.0.0
 * @author��zj
 * @date��2022?02?14 22:43
 */
public class SelectSort1 {
    public static void main(String[] args) {
        int[] arr = {101, 34, 119, 1};
        selectSort(arr);
    }

    public static void selectSort(int[] arr) {
        //ʹ�����Ƶ��ķ�ʽ��������ѡ������
        //��1��
        //ԭʼ������ �� 	101, 34, 119, 1
        //��һ������ :   	1, 34, 119, 101
        //�㷨 �ȼ�--�� �����ӣ� ���ǿ��԰�һ�����ӵ��㷨����ֳɼ򵥵�����-���𲽽��

        //��1�֣��ҵ���Сֵ����Сֵ���±�
        int minIndex = 0;
        int min = arr[0];//�ٶ�һ����Сֵ��������С������ȷ��
        for (int j = 0 + 1; j < arr.length; j++) {
            if (min > arr[j]) { //˵���ٶ�����Сֵ����������С
                min = arr[j]; //����min
                minIndex = j; //����minIndex
            }
        }

        //����Сֵ������arr[0], ������
        if (minIndex != 0) {//�����ڵ�ǰλ��ȥ����
            arr[minIndex] = arr[0];
            arr[0] = min;
        }

        System.out.println("��1�ֺ�~~");
        System.out.println(Arrays.toString(arr));// 1, 34, 119, 101


        //��2��
        minIndex = 1;
        min = arr[1];
        for (int j = 1 + 1; j < arr.length; j++) {
            if (min > arr[j]) { // ˵���ٶ�����Сֵ����������С
                min = arr[j]; // ����min
                minIndex = j; // ����minIndex
            }
        }

        // ����Сֵ������arr[0], ������
        if (minIndex != 1) {
            arr[minIndex] = arr[1];
            arr[1] = min;
        }

        System.out.println("��2�ֺ�~~");
        System.out.println(Arrays.toString(arr));// 1, 34, 119, 101

        //��3��
        minIndex = 2;
        min = arr[2];
        for (int j = 2 + 1; j < arr.length; j++) {
            if (min > arr[j]) { // ˵���ٶ�����Сֵ����������С
                min = arr[j]; // ����min
                minIndex = j; // ����minIndex
            }
        }

        // ����Сֵ������arr[0], ������
        if (minIndex != 2) {
            arr[minIndex] = arr[2];
            arr[2] = min;
        }

        System.out.println("��3�ֺ�~~");
        System.out.println(Arrays.toString(arr));// 1, 34, 101, 119 */


    }
}
