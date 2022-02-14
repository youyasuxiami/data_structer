package com.xiami.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * Description��ѡ������ÿһ�ֶ�д����
 * �۲쵽����,ʹ������forѭ��
 * ����8w���ݵ�ѡ��������ٶ�
 *
 * @version v1.0.0
 * @author��zj
 * @date��2022?02?14 22:43
 */
public class SelectSort3 {
    public static void main(String[] args) {
        int[] arr = new int[80000];

        for (int i = 0; i < 80000; i++) {
            arr[i] = (int) (Math.random() * 8000000); // ����һ��[0, 8000000) ��
        }

        Date data1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str = simpleDateFormat.format(data1);
        System.out.println("����ǰ��ʱ����=" + date1Str);

        //ѡ������
        selectSort(arr);

        Date data2 = new Date();
        String date2Str = simpleDateFormat.format(data2);
        System.out.println("����ǰ��ʱ����=" + date2Str);
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
