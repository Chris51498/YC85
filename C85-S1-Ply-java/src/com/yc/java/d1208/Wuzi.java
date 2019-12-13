package com.yc.java.d1208;

import java.util.Scanner;

/**
 * ������
 * @author Administrator
 *
 */
public class Wuzi {

	// ���峣��
	public static final char BLACK = '@';	// ����
	public static final char WHITE = 'O';	// ����
	public static final int SIZE = 15;		// ���̴�С

	public static void main(String[] args) {

		// ��������
		char[][] qipan = new char[SIZE][SIZE];
		// ��ʼ�����̣��ո���ʾ + ��
		for (int i = 0; i < qipan.length; i++) {
			for (int j = 0; j < qipan[i].length; j++) {
				qipan[i][j] = '+';
			}
		}

		Scanner s = new Scanner(System.in);
		// ��������
		char color = BLACK;
		// ��ʼ��Ϸ
		while (true) {
			// ��ӡ����
			printQipan(qipan);

			// �û�������������
			int i = 0;
			while (i < 1 || i > 15) {
				System.out.print("���������ӵĺ����꣺");
				i = s.nextInt();
			}
			int j = 0;
			while (j < 1 || j > 15) {
				System.out.print("���������ӵ������꣺");
				j = s.nextInt();
			}

			System.out.println();

			// �����һ���û�������� 1~15�� �����±��� 0~14
			j--;
			i--;
			if (qipan[j][i] != '+') {
				System.out.println("���������������ӣ�");
			} else {
				// ����
				qipan[j][i] = color;

				// �����ж� -
				if (checkHeng(qipan, color, i, j)
						// �����ж� |
						|| checkZong(qipan, color, i, j)
						// б���ж� \
						|| checkXie1(qipan, color, i, j)
						// б���ж� /
						|| checkXie2(qipan, color, i, j)) {
					break;
				}

				// ����������ɫ
				color = color == BLACK ? WHITE : BLACK;
			}
		}

		// �վ�ǰ����ٴ�ӡһ������
		printQipan(qipan);
	}

	/**
	 * ��ӡ����
	 * @param qipan
	 */
	public static void printQipan(char[][] qipan) {
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

	/**
	 * �жϺ��������Ƿ����
	 * @param qipan  ����
	 * @param color	 ������ɫ
	 * @param i		������
	 * @param j		������
	 */
	public static boolean checkHeng(char[][] qipan, char color, int i, int j) {

		// ����������� x y
		int x = i, y = j;
		// �жϺ�����
		int num = 1;
		while (x > 0 && qipan[y][--x] == color) {
			num++;
		}
		// �ָ� x y ��ֵ
		x = i;
		y = j;
		// �жϺ����ң�
		while (x < 14 && qipan[y][++x] == color) {
			num++;
		}

		if (num >= 5) {
			System.out.println(color + "Ӯ�ˣ�");
			return true;
		} else {
			return false;
		}
	}

	/**
	 * �ж����������Ƿ����
	 * @param qipan
	 * @param color
	 * @param i
	 * @param j
	 * @return
	 */
	public static boolean checkZong(char[][] qipan, char color, int i, int j) {
		/**
		 * �ж�����
		 */
		int x = i;
		int y = j;
		// �ж������ϣ�
		int num = 1;
		while (y > 0 && qipan[--y][x] == color) {
			num++;
		}
		// �ָ� x y ��ֵ
		x = i;
		y = j;
		// �ж������£�
		while (y < 14 && qipan[++y][x] == color) {
			num++;
		}

		if (num >= 5) {
			System.out.println(color + "Ӯ�ˣ�");
			return true;
		} else {
			return false;
		}
	}

	/**
	 * �ж�б�� \ �������Ƿ����
	 * @param qipan
	 * @param color
	 * @param i
	 * @param j
	 * @return
	 */
	public static boolean checkXie1(char[][] qipan, char color, int i, int j) {
		/**
		 * �ж�б��
		 */
		int x = i;
		int y = j;
		// �ж�б�����ϣ�
		int num = 1;
		while (y > 0 && x > 0 && qipan[--y][--x] == color) {
			num++;
		}
		// �ָ� x y ��ֵ
		x = i;
		y = j;
		// �ж�б�����£�
		while (y < 14 && x < 14 && qipan[++y][++x] == color) {
			num++;
		}

		if (num >= 5) {
			System.out.println(color + "Ӯ�ˣ�");
			return true;
		} else {
			return false;
		}
	}

	/**
	 * �ж�б�� / �������Ƿ����
	 * @param qipan
	 * @param color
	 * @param i
	 * @param j
	 * @return
	 */
	public static boolean checkXie2(char[][] qipan, char color, int i, int j) {
		/**
		 * �ж�б��
		 */
		int x = i;
		int y = j;
		// �ж�б�����ϣ�
		int num = 1;
		while (y > 0 && x < 14 && qipan[--y][++x] == color) {
			num++;
		}
		// �ָ� x y ��ֵ
		x = i;
		y = j;
		// �ж�б�����£�
		while (y < 14 && x > 0 && qipan[++y][--x] == color) {
			num++;
		}

		if (num >= 5) {
			System.out.println(color + "Ӯ�ˣ�");
			return true;
		} else {
			return false;
		}
	}

}
