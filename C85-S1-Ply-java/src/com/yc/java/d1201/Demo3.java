package com.yc.java.d1201;

public class Demo3 {
	public static void main(String[] args) {
		/**
		 * 1���ܱ� 4 ���� ���� ���ܱ� 100 ����
		 * 2���ܱ� 400 ����
		 */
		// �������
		int year = 2016;
		int month = 2; // �·�
		boolean isLeap = false;
		// & |
		if (year % 4 == 0 & year % 100 != 0 | year % 400 == 0) {
			System.out.println(year + "������");
			isLeap = true;
		} else {
			System.out.println(year + "��������");
		}

		int days = 0;
		// if �жϵ�д��
		// ���������ݺ��·ݣ�������µ�����
		if (month == 1 | month == 3 | month == 5 | month == 7 | month == 8 | month == 10 | month == 12) {
			days = 31;
		} else if (month == 4 | month == 6 | month == 9 | month == 11) {
			days = 30;
		} else if (isLeap) {
			days = 29;
		} else {
			days = 28;
		}

		// switch �жϵ�д��
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			if (isLeap) {
				days = 29;
			} else {
				days = 28;
			}
			break;
		default:
			days = 31;
		}

		System.out.println(year + "��" + month + "��" + "��" + days + "��");

	}

}
