package com.yc.java.d1202;

public class Demo3 {

	public static void main(String[] args) {

		// �ж� d �Ƿ�Ϊ����

		// ���ҵ� N ���� ��

		int count = 0; // ���ҵ��������ĸ���
		int number = 0; // ��¼�ҵ�������
		int d = 2; // while ѭ���еĵ�ǰ���ж��Ƿ�Ϊ����������
		int sum = 0;
		
		// 2 3 5 7 11 13 17 19 23 29 31
		while (count < 50) {
			boolean isZhi = true; // ���ڼ�¼�������ı���
			/**
			 *  d ֵ ���� 2 ����ʹ��   <= �ж�     d=4    4 / 2 == 2  2 <= 2
			 */
			for (int i = 2; i <= d / 2; i++) {
				if (d % i == 0) {
					isZhi = false;
					break;
				}
			}
			// �����ǰ d ֵ������
			if (isZhi == true) {
				count++; // ��¼�����ĸ���
				number = d; // ��¼��ǰ������
				sum += number;
			}
			d++;
		}
		// System.out.println(d + ( isZhi ? "��" : "����" ) + "����");
		System.out.println("��" + count + "�������ǣ�" + number);
		System.out.println("ǰ" + count + "���������ǣ�" + sum);
	}

}
