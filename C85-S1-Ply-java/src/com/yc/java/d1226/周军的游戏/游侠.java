package com.yc.java.d1226.�ܾ�����Ϸ;

import java.util.Scanner;

public class ���� extends ְҵ{
	public void choose(Person p) {
		 Scanner s=new Scanner(System.in);
			if(liliang<10 ||zhili<10  ||minjie<16  ||naili<10) {
				System.out.println(p.name+"����������ݲ���������תְΪ����");
			}
			else if(liliang>=10 && zhili>=10 && minjie>=16 && naili>=10) {
				System.out.println("��ȷ��һ�飺1 �ǣ�2��");
				int a=s.nextInt();
				if(a==1) {
					System.out.println("תְ�ɹ�");
					System.out.println("��������ͨ������A�㣡");
				}else {
					System.out.println("תְ�ɹ�");
					System.out.println("��������ͨ������A�㣡");
				}
			}
   }
	public void up() {
		   System.out.println("��һ��תְΪ������");
	   }
}
