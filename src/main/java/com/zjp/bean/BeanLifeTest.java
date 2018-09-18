package com.zjp.bean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean的生命周期测试
 * @author zjp
 *
 */
public class BeanLifeTest {

	public static void main(String[] args) {
		AbstractApplicationContext  act = new ClassPathXmlApplicationContext("bean-life.xml");
		BeanHello hello = (BeanHello) act.getBean("hello");
		String helllo = hello.helllo();
		System.out.println("helllo--"+helllo);
		act.close();
	}
}
