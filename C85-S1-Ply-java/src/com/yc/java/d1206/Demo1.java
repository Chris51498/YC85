package com.yc.java.d1206;

import java.util.Random;

public class Demo1 {

	public static void main(String[] args) {

		// ��������  new ���ڴ��������������ͱ���������ʵ����
		// new ��ʾ���� �� �ڴ��д���һ��洢����
		// Java ���鶨�壬��������ڴ�����ʱ��ָ������ĳ��ȣ�Ԫ�صĸ�����
		int[] arr = new int[10]; // int ���� Ԫ�ص�Ĭ��ֵ �� 0 boolean false
		int[] arr1 = new int[] { 10, 20, 30 };
		int[] arr2 = { 10, 20, 30, 50, 60 };

		// ��������� �� ���ʷ�ʽ(��д����)
		int size = arr.length; // length��Ψһ���ԣ� �����ŵ�ǰ����ĳ��ȣ�Ԫ�ظ�����
		System.out.println(arr.length);
		System.out.println(arr1.length);
		System.out.println(arr2.length);

		// ������Ԫ�ظ�ֵ  [�±�ֵ  ����  ���  ���]
		arr[0] = 10;
		arr[1] = 20;
		arr[9] = 100;

		System.out.println("=======��������=======");
		// ��������  for
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// �뷴���ӡ������   10��Ԫ�ص�����   0 ~ 9
		System.out.println("=======�����������=======");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		
		
		System.out.println("=======����Ԫ�������ֵ=======");
		// �������ֵ �������������   Random �����
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100);  // ���� 0 ~ 99 ������ֵ
		}
		
		System.out.println("=======��������=======");
		
		int max = -1;
		int min = 100;
		int sum = 0;  //ͳ������Ԫ��֮�ͣ�sum�ĳ�ֵΪ0
		// �������ֵ
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			if( arr[i] > max ){
				max = arr[i];
			}
			if( arr[i] < min ){
				min = arr[i];
			}
			sum += arr[i];  // ���
		}
		System.out.println("���ֵ�ǣ�" + max);
		System.out.println("��Сֵ�ǣ�" + min);
		System.out.println("�ܺ��ǣ�" + sum);
		// �������Сֵ
		
		/**
		 *  ctrl + s ����
		 *  ctrl + z ����
		 *  ctrl + y �ָ�
		 */

	}

}
