package com.zjp.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 主要是用来测试bean的生命周期
 * @author zjp
 *
 */
public class BeanHello implements BeanNameAware,BeanFactoryAware,BeanPostProcessor,InitializingBean,DisposableBean{

	/**
	 * 如果Bean类实现了org.springframework.beans.factory.BeanNameAware接口，则执行其setBeanName()方法。
	 */
	@Override
	public void setBeanName(String name) {
		System.out.println("执行setBeanName-----");
	}

	/**
	 * 如果Bean类实现了org.springframework.beans.factory.BeanFactoryAware接口，则执行其setBeanFactory()方法。
	 */
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("执行setBeanFactory-----");
	}

	/**
	 *  容器中如果有实现org.springframework.beans.factory.BeanPostProcessors接口的实例，则任何Bean在初始化之前都会执行这个实例的processBeforeInitialization()方法。
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("执行postProcessBeforeInitialization-----");
		return null;
	}

	/**
	 * 容器中如果有实现org.springframework.beans.factory.BeanPostProcessors接口的实例，则任何Bean在初始化之前都会执行这个实例的processAfterInitialization()方法。
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("执行postProcessAfterInitialization-----");
		return null;
	}

	/**
	 * 如果Bean类实现了org.springframework.beans.factory.InitializingBean接口，则执行其afterPropertiesSet()方法。
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("z执行afterPropertiesSet-------");
	}

	/**
	 * initMethod 在xml配置的初始化方法
	 */
	public void init(){
		System.out.println("执行initMethod-------");
	}
	
	/**
	 *  在容器关闭时，如果Bean类实现了org.springframework.beans.factory.DisposableBean接口，则执行它的destroy()方法。
	 */
	@Override
	public void destroy() throws Exception {
		System.out.println("执行destroy-------");
	}

	/**
	 * destroy-method 在xml文件中配置的方法
	 */
	public void xmlDestroy(){
		System.out.println("执行destroy-method-------");
	}
	
	public String helllo(){
		return "hello world！";
	}
}
