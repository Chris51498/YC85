package com.yc.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.yc.spring")
/** 
 * AOP ����Spring �ṩ�ĸ���
 * Spring �� AOP������ AspectJ ���
 */
@EnableAspectJAutoProxy   // ��Ӧ  <aop:aspectj-autoproxy/>
public class AOPConfig {

}
