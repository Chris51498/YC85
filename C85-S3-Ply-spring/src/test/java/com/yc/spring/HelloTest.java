package com.yc.spring;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yc.spring.bean.Person;
import com.yc.spring.dao.UserDao;

public class HelloTest {

	private ClassPathXmlApplicationContext ctx;

	@Before
	public void before() {
		ctx = new ClassPathXmlApplicationContext("beans.xml");
	}

	@After
	public void after() {
		ctx.close();
	}

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
		 * 	���Ʒ�ת ( Inversion of Control ): 
		 * 		���󴴽��г���Ա����
		 * 		����Ĵ�������������
		 */

		// �� Spring ���(����)�л�ȡһ�� Hello ����
		// ����Spring��������
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

		Hello h = (Hello) ctx.getBean("hello");
		Hello h1 = (Hello) ctx.getBean("hello");
		Hello h2 = (Hello) ctx.getBean("hello");

		// h1 �� h2 ��ͬһ������
		System.out.println(h1 == h2);

		// ִ�� sayHello ����
		h.sayHello();

		ctx.close();

	}

	@Test
	public void test1() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		// UserDao udao1 = new MySQLUserDao();
		UserDao udao1 = (UserDao) ctx.getBean("mdao");
		UserDao udao2 = (UserDao) ctx.getBean("odao");

		udao1.selectUserId("zhangsan");
		udao2.selectUserId("zhangsan");

		ctx.close();
	}

	@Test
	public void test2() {
		Person p1 = (Person) ctx.getBean("p1");
		Assert.assertEquals("����", p1.getName());
		Assert.assertEquals(35, p1.getAge());
		Assert.assertEquals(5,p1.getKilleds().size());
		Assert.assertEquals("������",p1.getKilleds().get(2));
	}
	
	@Test
	public void test3() {
		// java.lang.NoSuchMethodException: com.yc.spring.bean.Person.<init>()
		// δ�ҵ��޲����Ĺ��캯��
		
		/**
		 * NoUniqueBeanDefinitionException: 
		 * No qualifying bean of type 'com.yc.spring.bean.Person' available: 
		 * 	��Ψһ��bean����
		 * expected single matching bean but found 2: p1,com.yc.spring.bean.Person#0
		 * 	Ӧ����1�����ǳ���2��
		 */
		
		Person p1 = ctx.getBean(Person.class);
		Assert.assertEquals("����", p1.getName());
		Assert.assertEquals(33, p1.getAge());
		Assert.assertEquals(null,p1.getKilleds());
	}
	
	@Test
	public void test4() {
		Person p1 = (Person) ctx.getBean("p2");
		Assert.assertEquals("����", p1.getName());
		Assert.assertEquals(38, p1.getAge());
		Assert.assertEquals("����", p1.getFriend().getName());
	}

	@Test
	public void test5() {
		Person p1 = (Person) ctx.getBean("p5");
		Assert.assertEquals("��Ӣ", p1.getName());
		Assert.assertEquals(40, p1.getAge());
	}
	
	@Test
	public void test6() {
		Person p1 = (Person) ctx.getBean("p6");
		Assert.assertEquals("������", p1.getName());
		Assert.assertEquals(20, p1.getAge());
	}
}
