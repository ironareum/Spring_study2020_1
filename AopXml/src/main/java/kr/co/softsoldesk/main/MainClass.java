package kr.co.softsoldesk.main;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		TestBean xml1 =ctx.getBean("xml1",TestBean.class);
		
		//Aop의 관점. (advice들 걸려있음. method1실행시 자동으로 실행.) 
//		xml1.method1();
		
		int a1= xml1.method1();
		System.out.printf("a1 : %d\n", a1);
		
		
		ctx.close();
	}

}
