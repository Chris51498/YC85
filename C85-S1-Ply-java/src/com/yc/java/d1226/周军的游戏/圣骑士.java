package com.yc.java.d1226.�ܾ�����Ϸ;

import java.util.Scanner;

public class ʥ��ʿ extends սʿ{
	public void choose() {
		Scanner s=new Scanner(System.in);
		 if(liliang>=25 && zhili>=18 && minjie>=18 && naili>=18) {
			System.out.println("��ȷ��һ�飺1 �ǣ�2��");
			int a=s.nextInt();
			if(a==1) {
				System.out.println("תְ�ɹ�");
				System.out.println("ʥ��ʿ��ר�����ܣ����٣�");
			}else {
				System.out.println("תְ�ɹ�");
				System.out.println("ʥ��ʿ��ר�����ܣ���֪��");
			}
		}
		}
}
