package com.yc.java.d1208;

import java.util.Random;

public class Demo1 {

	public static void main(String[] args) {

		// ��ά����Ķ���

		int[] arr1 = new int[10]; // Ԫ�ظ��� 10
		int[][] arr2 = new int[10][20]; // Ԫ�ظ��� 10 * 10

		// ��ȡ����ĳ���
		int l1 = arr1.length; // ==> 10
		int l2 = arr2.length; // ==> 10

		// ��ȡԪ��
		int v1 = arr1[0]; //  ==> ���ص�����  int
		/**
		 * Type mismatch: cannot convert from int[] to int
		 * ����     ��ƥ��               �޷�           ת��              ��         int���� ��  int
		 */

		int[] v2 = arr2[0]; //  ==> ���ص�����  int[]
		l2 = v2.length; //  ==> 20

		System.out.println(l2);

		// ����ά������������ֵ
		Random r = new Random();
		for (int i = 0; i < arr2.length; i++) {
			int[] arr3 = arr2[i]; // ��һά����Ԫ��  ==�� int[]
			for (int j = 0; j < arr3.length; j++) {
				// 40 ~ 100
				int num = 40 + r.nextInt(61); // 0 ~ 60
				/**
				 * ��ά���鸳ֵ
				 */
				arr2[i][j] = num;
				// ��ȡԪ�ص�ֵ
				System.out.print(arr2[i][j] + ",");
			}
			// ����
			System.out.println();
		}

		// ���Ҷ�ά�����е����ֵ
		int max = -1;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				if(arr2[i][j] > max){
					max = arr2[i][j];
				}
			}
		}
		System.out.println("max = " + max);
	}

}
