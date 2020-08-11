package com.yc.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

	// aspectj ���е���ʽ
	// execution ����Ҫ���ط���ǩ��������
	// execution( public void ����.����.������(����))
	@Pointcut(("execution( * com.yc.spring.dao.*Dao.select*(..))"))
	public void aspect1() {
		/*�е㷽��*/ }

	@Before("aspect1()")
	// JoinPoint ���ӵ���� ==> ���� ==> �������Method
	// �ӿ�ע�� JoinPoint ����
	public void before(JoinPoint jp) {
		jp.getArgs(); // ��������
		jp.getSignature(); // ����ǩ����
		System.out.println("========== ǰ����ǿ ===========");
	}

	@After("aspect1()")
	public void after(JoinPoint jp) {
		System.out.println("========== ������ǿ ===========");
	}

	@AfterReturning("aspect1()")
	public void afterReturning(JoinPoint jp) {
		System.out.println("========== ������ǿ ===========");
	}

	@AfterThrowing("aspect1()")
	public void afterThrowing(JoinPoint jp) {
		System.out.println("========== �쳣��ǿ ===========");
	}

	/**
	 * ������ǿ, ҵ�񷽷���Ҫ�����Լ���ִ��
	 */
	@Around("execution( * com.yc.spring.dao.Oracle*.select*(..))")
	public Object around(ProceedingJoinPoint pjp) {
		Object ret = null;
		try {
			// ����ҵ�����ķ���
			long begin = System.currentTimeMillis();
			ret = pjp.proceed();
			long end = System.currentTimeMillis();
			System.out.println("һ��������" + ((end - begin) / 1000) + "��");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return ret;
	}

}
