package com.yc.spring;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {
	
	@Test
	public void test() {
		// Hello h = new Hello();
		
		// �� Spring ���(����)�л�ȡһ�� Hello ����
		// ����Spring��������
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("beans.xml");
	
		Hello h = (Hello) ctx.getBean("hello");
		
		// ִ�� sayHello ����
		h.sayHello();
		
		ctx.close();
		
	}

}
