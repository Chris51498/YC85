package com.yc.java.d1208;

import java.util.Scanner;

/**
 * ������
 * @author Administrator
 *
 */
public class Wuzi {

	// ���峣��
	public static final char BLACK = '@';
	public static final char WHITE = 'O';
	public static final int SIZE = 15;

	/**
	 * ���� @
	 * ���� O 
	 * 
	 */
	public static void main(String[] args) {

		// ��������
		char[][] qipan = new char[SIZE][SIZE];

		for (int i = 0; i < qipan.length; i++) {
			for (int j = 0; j < qipan[i].length; j++) {
				qipan[i][j] = '+';
			}
		}

		Scanner s = new Scanner(System.in);
		char color = BLACK;
		// ��ʼ��Ϸ
		while (true) {
			// ��ӡ����
			printXPos();
			for (int i = 0; i < qipan.length; i++) {
				printYPos(i + 1);
				for (int j = 0; j < qipan[i].length; j++) {
					System.out.print(qipan[i][j] + " ");
				}
				printYPos(i + 1);
				System.out.println();
			}
			printXPos();
			// �û�������������
			System.out.print("���������ӵĺ����꣺");
			int i = s.nextInt();
			System.out.print("���������ӵ������꣺");
			int j = s.nextInt();

			qipan[j][i] = color;
			// ����������ɫ
			color = color == BLACK ? WHITE : BLACK;
		}
		/**
		 * ��ҵ��
		 * 	1���ж��û������루1~15��������û����벻��ȷ������ʾ�û��ٴ�����   ***
		 * 	2�������޻ڣ��¹����λ�ò����ٴ����ӣ�������ʾ�û�			  ***
		 * 	3��ʤ���ж�  *****
		 * 		1�����жϺ���������Ƿ����
		 * 		2�����ж�����������Ƿ����
		 * 		3�����������ж�б�������
		 *  
		 */
	}

	/**
	 * ��ӡ������
	 */
	public static void printXPos() {
		System.out.print("  ");
		for (int i = 0; i < SIZE; i++) {
			int num = i + 1;
			System.out.print(num < 10 ? num + " " : num);
		}
		System.out.println();
	}

	/**
	 * ��ӡ������
	 */
	public static void printYPos(int y) {
		System.out.print(y < 10 ? y + " " : y);
	}

}
