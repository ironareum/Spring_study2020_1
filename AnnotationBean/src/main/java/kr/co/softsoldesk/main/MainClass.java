package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("=========XML========");
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/bean.xml");
		TestBean1 xml1 =ctx1.getBean("xml1", TestBean1.class);
		System.out.printf("xml1.data1 : %d\n",xml1.getData1());
		System.out.printf("xml1.data2 : %s\n",xml1.getData2());
		System.out.printf("xml1.data3 : %s\n",xml1.getData3());
		System.out.printf("xml1.data4 : %s\n",xml1.getData4());
		System.out.printf("xml1.data5 : %s\n",xml1.getData5());
		System.out.printf("xml1.data6 : %s\n",xml1.getData6());
		
		System.out.println("--------");
		TestBean2 xml2 =ctx1.getBean("xml2", TestBean2.class);
		System.out.printf("xml2.data1 : %d\n",xml2.getData1());
		System.out.printf("xml2.data2 : %s\n",xml2.getData2());
		System.out.printf("xml2.data3 : %s\n",xml2.getData3());
		System.out.printf("xml2.data4 : %s\n",xml2.getData4());

		
		ctx1.close();
		System.out.println("=========JAVA========");
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		TestBean1 java1 = ctx2.getBean("java1",TestBean1.class);
		System.out.printf("java1.data1 : %d\n",java1.getData1());
		System.out.printf("java1.data2 : %s\n",java1.getData2());
		System.out.printf("java1.data3 : %s\n",java1.getData3());
		System.out.printf("java1.data4 : %s\n",java1.getData4());
		System.out.printf("java1.data5 : %s\n",java1.getData5());
		System.out.printf("java1.data6 : %s\n",java1.getData6());
		
		System.out.println("--------");
		TestBean2 java2 = ctx2.getBean("java2",TestBean2.class);
		System.out.printf("java2.data1 : %d\n",java2.getData1());
		System.out.printf("java2.data2 : %s\n",java2.getData2());
		System.out.printf("java2.data3 : %s\n",java2.getData3());
		System.out.printf("java2.data4 : %s\n",java2.getData4());

		
		ctx2.close();
		
		
		
	}

}
