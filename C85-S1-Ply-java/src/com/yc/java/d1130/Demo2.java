package com.yc.java.d1130;

public class Demo2 {

	// main alt + / ������ʾ���Զ����ɴ���
	public static void main(String[] args) {
		// ��������ת��
		byte b = 100;
		int i = b; // �� b ����ֵ��ֵ�� i �Զ�����ת��
		b = (byte) i; // �� i ����ֵ��ֵ�� b ǿ������ת��

		char c = 'A';
		c = '\377';
		c = '\uffff';
		c = 'A';

		System.out.println(c); // ��ӡ A
		int ic = c; // �� char ת�� int
		System.out.println(ic); // ��ӡ�������� A �ı��
		System.out.println(c + 10);

		int a = 100;

		a = 0x100; // ʮ���������ֱ�ʾ 0x��ͷ
		System.out.println(a);
		a = 0100; // �˽������ֱ�ʾ 0��ͷ
		System.out.println(a);

		char cc = 123; // 123 ��һ�� byte ����

		float f = (float) 12.345E2;
		System.out.println(f);
		
		int  a1=123;                   
		char  b1='\u007B'; 
		
		System.out.println(a1);
		System.out.println((int)b1);  // ǿ��ת�� char  ==�� int

	}

}
