package kr.co.softsoldesk.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans.TestBean3;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		//@Autowire, Qualifier, Resource로 속성가져오기 
		TestBean1 t1=ctx.getBean(TestBean1.class);
		System.out.printf("* t1.data1 : %s\n", t1.getData1());		
		
		System.out.printf("* t1.data2 : %s\n", t1.getData2());
		
		System.out.printf("* t1.data3 : %s\n", t1.getData3());
		
		//동일타입,동일객체 개별이름의 빈으로 생성해서 가져오기. 
		System.out.printf("* t1.data4 : %s\n", t1.getData4());
		System.out.printf("* t1.data5 : %s\n", t1.getData5());
		System.out.println("-------------");
		
		
		TestBean2 t2=ctx.getBean(TestBean2.class);
		System.out.printf("* t2.data1 : %d\n", t2.getData1());		
		System.out.printf("* t2.data2 : %s\n", t2.getData2());		
		System.out.printf("* t2.data3 : %s\n", t2.getData3());		
		System.out.printf("* t2.data4 : %s\n", t2.getData4());		
		System.out.println("-------------");
		
		//매개변수값 별도 주입시 빈생성 + 생성자에 값 주입 
		TestBean3 java3=ctx.getBean("java3",TestBean3.class);
		System.out.printf("* java3.data1 : %d\n", java3.getData1());		
		System.out.printf("* java3.data2 : %s\n", java3.getData2());		
		System.out.printf("* java3.data3 : %s\n", java3.getData3());		
		System.out.printf("* java3.data4 : %s\n", java3.getData4());		

		
		ctx.close();

	}

}
