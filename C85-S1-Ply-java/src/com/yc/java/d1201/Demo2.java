package com.yc.java.d1201;

public class Demo2 {
	
	public static void main(String[] args) {
		
		// ��Ȧ 1200��
		for( int i=1; i<=10; i++ ){
			// + ��Ϊ�ַ������ӷ�
			System.out.println("��" + i + "Ȧ");
		}
		
		double money = 10000;  // 10000Ԫ
		double rate = 0.03;     // ������
		
		// ���ʶ�����֮�� ����ﵽ      20000��
		int year = 0;   // ����
		
		double orgMoney = money;  // ���汾��
		/*while ( money < 20000 ){
			money += money * rate;
			year ++;
		}*/
		// do while ѭ��Ҫע�� ��һ��ѭ����û���жϵ�
		do {
			money += money * rate;
			year ++;
		} while ( money < 20000 );
		
		
		System.out.println("����" + orgMoney + "����ǰ��" + money
				+ "��һ������" + year + "��");
		
		// ����10000.0����ǰ��20327.941064604023��һ������24��

	}

}
