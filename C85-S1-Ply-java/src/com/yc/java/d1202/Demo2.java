package com.yc.java.d1202;

public class Demo2 {

	public static void main(String[] args) {
		int sex = 0; // 0 Ů 1��
		char cSex;
		/*if(sex == 0){
			cSex = 'Ů';
		} else {
			cSex = '��';
		}*/
		cSex = sex == 0 ? 'Ů' : '��';
		System.out.println(cSex);

		// �� a b c �е����ֵ
		int a = 30, b = 20, c = 45;
		int max;
		max = a > b ? a : b;
		// �����ʣ�´���
		max = max > c ? max : c;
		
		/**
		 * ��Ԫ���ʽ�����໥Ƕ��
		 */
		// max = a > b ? a : (  b > c ? b : c );
		
		
		
		
		System.out.println("���ֵ�ǣ�" + max);

	}

}
