package com.yc.spring;

public class Hello {

	public Hello() {
		/*�޲����Ĺ��췽��*/ 
		System.out.println("======== Hello �޲����Ĺ��췽�� =========");
	}

	public Hello(int a) {
		/*�в����Ĺ��췽��*/ 
		System.out.println("======== Hello �в����Ĺ��췽�� =========");
	}

	public void sayHello() {
		System.out.println("�������");
	}
	
	/**
	 * �������ڷ������ܴ�����
	 */
	public void init() {
		System.out.println("======== hello ������ ==========");
	}
	
	public void destroy () {
		System.out.println("======== hello ������ ==========");
	}

}
