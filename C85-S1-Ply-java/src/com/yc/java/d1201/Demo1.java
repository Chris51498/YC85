package com.yc.java.d1201;

public class Demo1 {
	
	// main  alt + /
	public static void main(String[] args) {
		
		/**
		 * δ��  40000
		 * 
		 * 21450  15%
		 * ��40000 - 21450�� * 28%
		 * 
		 * 90000
		 * 21450 15%
		 * 51900 - 21450 28%
		 * 90000 - 51900 31%
		 * 
		 */
		
		boolean ishun = false;  // �ѻ�
		double money = 40000;  // ˰��
		double tax = 0;
		
		// �����ַ���
		String hun = null;
		
		if ( ishun ){ // �ж��Ƿ��ѻ�
			hun = "�ѻ�";
			if ( money < 35800 ){
				tax = money * 0.15;
			} else if ( money < 86500 ){
				tax = 35800 * 0.15 + ( money - 35800) * 0.28;
			} else {
				tax = 35800 * 0.15 + ( 86500 - 35800) * 0.28
						+ ( money - 86500) * 0.31;
			}
		} else {	  // �������δ��
			// �����δ��˰�����
			hun = "δ��";
			if ( money < 21450 ){
				tax = money * 0.15;
			} else if ( money < 51900 ){
				tax = 21450 * 0.15 + ( money - 21450) * 0.28;
			} else {
				tax = 21450 * 0.15 + ( 51900 - 21450) * 0.28
						+ ( money - 51900) * 0.31;
			}
		}
		
		System.out.println(hun + "��ʿ�����룺" +
					money + "������˰���ǣ�" +tax);
		
	}

}
