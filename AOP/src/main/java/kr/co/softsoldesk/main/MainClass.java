package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("-------------XML-------------");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		TestBean1 xml1=ctx.getBean(TestBean1.class);
		
		//xml1.method1();
		//afterThrowingMethod()발생시 - try catch문으로 막아주기. 
		try {
			xml1.method1();
			
		} catch (Exception e) {
			System.out.println("오류발생");
		}
		
		ctx.close();
		
		
		System.out.println("-------------JAVA-------------");
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 java1 = ctx2.getBean(TestBean1.class);
		
		//java1.method1(); 
		//afterThrowingMethod()발생시 - try catch문으로 막아주기. 
		try {
			java1.method1();
			
		} catch (Exception e) {
			System.out.println("**오류 발생 처리**");
		}
		
		ctx2.close();
	}
}
