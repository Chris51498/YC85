package com.yc.java.d1202;

public class Demo4 {

	/**
	 * continue �������ص�ѭ������ʼ��
	 * while ( ���� ) ��
	 * 	��� A
	 *  ��� B
	 *  continue
	 *  ��� C
	 *  ��� D
	 * ��
	 */
	public static void main(String[] args) {
		// ���ҵ� N ���� ��

		int count = 0; // ���ҵ��������ĸ���
		int number = 0; // ��¼�ҵ�������
		int d = 2; // while ѭ���еĵ�ǰ���ж��Ƿ�Ϊ����������
		int sum = 0;
		
		// ��ѭ��
		a: while (true) {
			boolean isZhi = true; // ���ڼ�¼�������ı���

			for (int i = 2; i <= d / 2; i++) {
				if (d % i == 0) {
					isZhi = false;
					//break;
					// ʹ�� continue ������һ��ѭ��
					d++;  // �������� +1
					continue a; // ��ʾ�ص�  while ѭ������ʼ��
				}
			}
			// �����ǰ d ֵ������
			if (isZhi == true) {
				count++; // ��¼�����ĸ���
				number = d; // ��¼��ǰ������
				sum += number;
				// ��ѭ�����ڲ��ֶ����˳�ѭ��
				if(count == 50){
					break;
				}
			}
			d++;  // �������� +1
		}
		System.out.println("��" + count + "�������ǣ�" + number);
		System.out.println("ǰ" + count + "���������ǣ�" + sum);
	}

}
