package com.yc.java.d1204;

// Eclipse �Զ��������
import java.util.Scanner;

/**
 * �����һ�����£���������µ��������ڣ���������ʽ���
 * 
 * 1���������ʹ�� java api��Ӧ�ó���ӿڣ�
 * 		Scanner �࣬������Ļ¼�� 
 * 2�����庯�� �� �������������Ǽ򻯱��
 * 
 */
public class Calendar {

	public static void main(String[] args) {

		// 1�� ����Ļ¼������ʾ������
		Scanner scanner = new Scanner(System.in); // ��������

		while (true) {
			// ��ݼ� syso��alt + /��
			System.out.println("��������ݣ�");
			int year = scanner.nextInt(); // �����ͣ�������ȴ��û�������

			// ���� 0 ���˳�
			if (year == 0) {
				System.out.println("�ټ���");
				break;
			}
			
			System.out.println("�������·ݣ�");
			int month = scanner.nextInt();
			
			// ���� 0 ���˳�
			if (month == 0) {
				System.out.println("�ټ���");
				break;
			}
			
			// 2�� ������������£���ʾ�����ÿһ�죬������1�����ڼ�
			int days = getDays(year, month);

			// 3�� ����1�������ڼ� 1900.1.1 ����һ
			// ͳ������ 2019.3.1 ==> 1900.1.1 ~ 2019.2.28
			int allDays = 0;
			// ���ȥ������������ݵ�����
			for (int i = 1900; i < year; i++) {
				// i ��ʾ���ǵ�ǰ�����
				boolean isleap = isLeap(i);
				allDays += isleap ? 366 : 365;
			}
			System.out.println(allDays);
			// �������¹�ȥ������
			for (int i = 1; i < month; i++) {
				// i ��ʾ���ǵ�ǰ���·�
				// Duplicate local variable days �ظ��Ķ������ days
				allDays += getDays(year, i); // �������ķ���ֱֵ�Ӽӵ� allDays
			}
			System.out.println(allDays);
			// �������һ�������ڼ�
			int lastDayWeek = allDays % 7;

			System.out.println(year + "��" + month + "��");
			// ���������
			System.out.println("��\tһ\t��\t��\t��\t��\t��");

			// ���1��ǰ�Ŀո�������ǰ
			for (int i = 0; i < (lastDayWeek + 1) % 7; i++) {
				System.out.print("\t");
			}

			// 4������1��������������������������
			for (int i = 1; i <= days; i++) {
				// ������������ע������������ǰ���㷨
				int week = (lastDayWeek + i + 1) % 7;
				// �������գ������ڼ���С����
				if (week == 1 || week == 0) {
					System.out.print("(" + i + ")\t");
				} else {
					System.out.print(i + "\t");
				}
				// ��� �� 7 �� 0 ��ô�ͻ���
				if (week == 0) {
					System.out.println();
				}
			}
			System.out.println();

		}
		/**
		 * ��ҵ�� 
		 * 1������û����� 0 �� �� 0�£����˳����� 	* 
		 * 2����ʵ��ʹ������ʾ�������ĵ�һ�� 		***
		 * 3���뽫���������յ����ڣ����߼������� 	**
		 */

	}

	// �����Ķ����﷨ ������ ��̬�ؼ��� ����ֵ ������( �����б� ) { ������ }
	// �ж�����ĺ���
	public static boolean isLeap(int year) {
		boolean isLeap = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
		return isLeap;
	}

	/**
	 * �붨�����ָ�����µ������ĺ���
	 * 
	 * @param year
	 *            ���
	 * @param month
	 *            �·�
	 * @return ��������
	 */
	public static int getDays(int year, int month) {
		// �ж�����
		// && ������� ���ȼ� Ҫ���� || �������
		boolean isLeap = isLeap(year);
		// ���屣�������ı��� days
		int days;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 2:
			days = isLeap ? 29 : 28;
			break;
		default:
			days = 30;
		}
		return days;
	}

}
