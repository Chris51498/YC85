package com.yc.java.d1130;

public class Demo1 {
	
	public static void main(String[] args){
		// 0.4 ��  double ����
		float f1 = 0.4f;
		double d1 = 0.4;
		
		// ��� f1 �� d1 �Ƿ���ȣ����Ϊ false������ȣ�
		System.out.println(f1 == d1 );
		
		// ���� a b ֵ
		int a = 100;
		int b = 200;
		
		// ��ӡ a b ֵ
		System.out.println(a + "   " + b);
		
		int c = a;   // ��aֵ��ֵ��c
		a = b;
		b =c;
		System.out.println(a + "   " + b);
		
		// ��ʹ�õ������� ���� a b
		// a + b ��ֵ��  a
		a = a + b;  // a 200  b 100
		// a ��ȥ b == ��    a 300   b 100
		b = a - b;
		a = a - b;    // a  300   b 200  
		System.out.println(a + "   " + b);
		
		// ʹ�� �������� ^ ʵ�ֽ���
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println(a + "   " + b);
	}

}
