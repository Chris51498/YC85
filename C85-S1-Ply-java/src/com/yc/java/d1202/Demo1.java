package com.yc.java.d1202;

public class Demo1 {

	public static void main(String[] args) {
		int i = 6, j = 8, k = 10, m = 7;
		
		   //true      true
		if (i < j || m < k--)
			// �� | ��ʹ ��������ߵı��ʽ�������
			// ˫ || �������߳�����true�� ��ô�ұߵľͲ����ټ�����
			k++;
		else
			k--;
		System.out.println(k);
		
		i = 6;
		j = 8;
		k = 10;
		m = 7;
		
		// false   true   false
		if (i > j && m < k--)
			// �� & ��ʹ ��������ߵı��ʽ�������
			// ˫ && �������߲�������false�� ��ô�ұߵľͲ����ټ�����
			k++;
		else
			k--;
		System.out.println(k);
		
	}
}
