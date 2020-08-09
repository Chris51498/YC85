package com.yc.spring;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yc.spring.dao.UserDao;

public class HelloTest {
	
	@Test
	public void test() {
		// Hello h = new Hello();
		
		/**
		 * Spring ��ܽ��������
		 * Servlet
		 * 	 UserBiz ubiz = new UserBiz();
		 *   UserBiz ubiz = new SubUserBiz1();
		 *   UserBiz ubiz = new SubUserBiz2();
		 * 1. new ==> ��������  ==> �ڴ���ռ�ô洢����Ŀռ�
		 * 		ÿ��new���ᴴ��һ���µĶ��� ==> �ڴ����Ĵ�
		 * 		����ķ�ʽ: ʹ�ö����
		 * 		�����. get����  ��ȡ����
		 * 2.   ���������
		 * 		�����������������������Ϊָ����������ʵ��
		 * 
		 * 	���Ʒ�ת: 
		 * 		���󴴽��г���Ա����
		 * 		����Ĵ�������������
		 */
		
		// �� Spring ���(����)�л�ȡһ�� Hello ����
		// ����Spring��������
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("beans.xml");
	
		Hello h = (Hello) ctx.getBean("hello");
		Hello h1 = (Hello) ctx.getBean("hello");
		Hello h2= (Hello) ctx.getBean("hello");
		
		// h1 �� h2 ��ͬһ������
		System.out.println(h1 == h2);
		
		// ִ�� sayHello ����
		h.sayHello();
		
		ctx.close();
		
	}
	
	@Test
	public void test1() {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("beans.xml");
		//UserDao udao1 = new MySQLUserDao();
		UserDao udao1 = (UserDao) ctx.getBean("mdao");
		UserDao udao2 = (UserDao) ctx.getBean("odao");
		
		udao1.selectUserId("zhangsan");
		udao2.selectUserId("zhangsan");
		
		ctx.close();
	}

}
