package com.yc.java.d1226.�ܾ�����Ϸ;

import java.util.Scanner;

public class սʿ extends ְҵ{
   public void choose(Person p) {
	   Scanner s=new Scanner(System.in);
		if(liliang<16 ||zhili<10  ||minjie<10  ||naili<10) {
			System.out.println(p.name+"���������������������תְΪսʿ");
		}
		else if(liliang>=16 && zhili>=10 && minjie>=10 && naili>=10) {
			System.out.println("��ȷ��һ�飺1 �ǣ�2��");
			int a=s.nextInt();
			if(a==1) {
				System.out.println("תְ�ɹ�");
				System.out.println("սʿ����ͨ������A�㣡");
			}else {
				System.out.println("תְ�ɹ�");
				System.out.println("սʿ����ͨ������A�㣡");
			}
		}
   }
   public void up() {
	   System.out.println("��һ��תְΪսʿ��");
   }
   
	  
   
}
