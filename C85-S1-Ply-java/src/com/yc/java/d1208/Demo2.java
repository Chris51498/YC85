package com.yc.java.d1208;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {

		// ��ά���飬����ֻ�����һά�ĳ���

		// int[] arr1 = new int[5];  //==>  {0,0,0,0,0}

		// ��ά����δָ���ڶ�ά�ĳ��ȣ���ô��һά�����Ԫ��ֵ ��  null
		int[][] arr = new int[5][]; //==> arr[0] ���ͣ� ���� int[]

		// ��ǿ for ѭ��
		/*int[] i  = arr[0];
		 i  = arr[1];
		 i  = arr[2];
		 i  = arr[3];
		 i  = arr[4];*/

		for (int[] i : arr) {
			System.out.print(i + ",");
		}
		System.out.println("\n\n");

		arr[0] = new int[] { 1, 2, 3, 4, 5 };
		arr[1] = new int[] { 6, 7, 8 };
		arr[2] = new int[] { 9, 10, 11, 12 };
		arr[3] = new int[] { 13, 14, 15, 16, 17, 18, 19, 10 };

		/**
		 * �û����� ��ά������±�ֵ�������ά�����Ԫ��ֵ
		 */
		Scanner s = new Scanner(System.in);
		while (true) {
			//arr[4] = ??? ==> null
			// ʹ����ǿforѭ�� ������ά����
			for (int[] i : arr) {
				// i �Ƿ��ص� һά����      NullPointerException ��ָ���쳣
				if (i == null) {
					// ��� i == null ��ô�ͻص�ѭ���Ŀ�ʼ��
					continue;
				}
				for (int j : i) {
					System.out.print(j + ",");
				}
				System.out.println();
			}

			System.out.print("�������ά����ĵ�һά�±꣺");
			int i = s.nextInt();
			System.out.print("�������ά����ĵڶ�ά�±꣺");
			int j = s.nextInt();

			System.out.println("�����Ԫ��ֵ��" + arr[i][j]);

		}

	}

}
