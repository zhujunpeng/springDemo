package com.zjp.aop.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 创建自定义的InvocationHandler，用于接口提供的方法进行增强
 * @author zjp
 *
 */
public class MyInvocationHandler implements InvocationHandler {
	
	private Object target;
	
	public MyInvocationHandler(Object target) {
		this.target = target;
	}

	/**
	 * 执行目标对象的方法
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("------------before------------");
		Object result = method.invoke(target, args);
		System.out.println("------------after------------");
		return result;
	}
	
	public Object getProxy(){
		return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),target.getClass().getInterfaces() , this);
	}

}
