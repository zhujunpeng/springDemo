package com.zjp.aop.jdk;

import org.junit.Test;

public class ProxyTest {
	
	@Test
	public void testProxy(){
		UserService service = new UserServiceImpl();
		MyInvocationHandler invocationHandler = new MyInvocationHandler(service);
		UserService proxy = (UserService) invocationHandler.getProxy();
		proxy.add();
	}

}
