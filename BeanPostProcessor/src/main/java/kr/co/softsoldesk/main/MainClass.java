package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx =new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/bean.xml");
		TestBean1 t1= ctx.getBean("t1", TestBean1.class);
		System.out.printf("t1 : %s\n", t1);
		
		//BeanPostProcessor : 생성자와 이니셜메소드 사이에서 제어권을 뺏음(그 사이에 postProcessor에서 설정한 메소드 들어감) & 메인에 있는 모든 객체에 적용. 

		System.out.println("---------------------------------");

		TestBean2 t2= ctx.getBean("t2", TestBean2.class);
		System.out.printf("t2 : %s\n", t2);
		
		System.out.println("---------------------------------");
		ctx.close();
	}

}
