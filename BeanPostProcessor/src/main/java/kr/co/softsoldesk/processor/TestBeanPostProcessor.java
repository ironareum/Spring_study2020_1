package kr.co.softsoldesk.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TestBeanPostProcessor implements BeanPostProcessor{
	//BeanPostProcessor: main에서 생성된 객체들을 다 읽어서 프로세서 처리함. 
	
	/*
	 * @Override 
	 * //호출 전 
	 * //Object bean: 생성자, String beanName: 제어권을 각각 만들수 있게 함 public
	 * Object postProcessBeforeInitialization(Object bean, String beanName) throws
	 * BeansException { System.out.println("before"); return bean; }
	 */
	
	@Override
	//String beanName: xml의 id
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("before");
		
		switch (beanName) {
		case "t1":
			System.out.println("프로세서 : t1 객체 캐치! ");
			break;
		case "t2":
			System.out.println("프로세서 : t2 객체 캐치! ");
			break;

		default:
			break;
		}
	
		return bean;
	}
	
	
	
	@Override
	//호출 후 
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("after");
		return bean;
	}
}
