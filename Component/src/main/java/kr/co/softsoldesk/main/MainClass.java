package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans2.TestBean3;
import kr.co.softsoldesk.beans2.TestBean4;
import kr.co.softsoldesk.beans3.TestBean5;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		
		//bean.xml
		System.out.println("=================XML=================");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/bean.xml");
		
		//type으로 지정한거 가져오기(싱글톤) 
		TestBean1 xml1=ctx.getBean(TestBean1.class);
		System.out.printf("* xml1 : %s\n", xml1);
		System.out.println("---------------------");
		
		//name으로 지정한거 가져오기(id 활용) //각기 다른주소로 표현 
		TestBean2 xml2=ctx.getBean("xml2",TestBean2.class);
		System.out.printf("* xml2 : %s\n", xml2); 
		TestBean2 xml3=ctx.getBean("xml3",TestBean2.class);
		System.out.printf("* xml3 : %s\n", xml3);
		System.out.println("---------------------");
		
		//Component로 분석하여 가져오기 - 타입으로 가져오기(싱글톤) 
		TestBean3 xml4 = ctx.getBean(TestBean3.class);
		System.out.printf("* xml4 : %s\n", xml4);//싱글톤
		System.out.println("---------------------");
		
		//Component로 분석하여 가져오기 - 이름으로 가져오기 (싱글톤) 
		TestBean4 xml5 = ctx.getBean("bean4",TestBean4.class);
		System.out.printf("* xml5 : %s\n", xml5);
		TestBean4 xml6 = ctx.getBean("bean4",TestBean4.class);
		System.out.printf("* xml6 : %s\n", xml6);
		System.out.println("---------------------");
		
		//Component로 분석하여 가져오기 - 프로토타입. 여러개의 이름으로 가져오기 (빈에서 이름 개별지정 해줘야함) 
		TestBean4 xml100 = ctx.getBean("xml100",TestBean4.class);
		System.out.printf("* xml100 : %s\n", xml100);
		TestBean4 xml200 = ctx.getBean("xml200",TestBean4.class);
		System.out.printf("* xml200 : %s\n", xml200);
		System.out.println("---------------------");
		
		//Component로 분석하여 가져오기 - 여러개의 패키지 분석
		TestBean5 xml500 = ctx.getBean(TestBean5.class);
		System.out.printf("* xml500 : %s\n", xml500);
		
		ctx.close();
		
		//ConfigClass
		System.out.println("=================JAVA=================");
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		//type으로 지정한거 가져오기 
		TestBean1 java1=ctx2.getBean(TestBean1.class);
		System.out.printf("* java1 : %s\n", java1);
		System.out.println("---------------------");

		//name으로 지정한거 가져오기(id 활용) 
		TestBean2 java2=ctx2.getBean("java2",TestBean2.class);
		System.out.printf("* java2 : %s\n", java2);
		TestBean2 java3=ctx2.getBean("java3",TestBean2.class);
		System.out.printf("* java3 : %s\n", java3);
		System.out.println("---------------------");
		
		//Component로 분석하여 가져오기 - 타입으로 가져오기(싱글톤) 
		TestBean3 java4=ctx2.getBean(TestBean3.class);		
		System.out.printf("* java4 : %s\n", java4); 
		System.out.println("---------------------");
		
		//Component로 분석하여 가져오기 - 이름으로 가져오기
		TestBean4 java5=ctx2.getBean("bean4",TestBean4.class);		
		System.out.printf("* java5 : %s\n", java5); 
		System.out.println("---------------------");
		
		//Component로 분석하여 가져오기 - 프로토타입. 여러개의 이름으로 가져오기
		TestBean4 java100=ctx2.getBean("java100",TestBean4.class);		
		System.out.printf("* java100 : %s\n", java100); 
		TestBean4 java200=ctx2.getBean("java200",TestBean4.class);		
		System.out.printf("* java200 : %s\n", java200); 
		System.out.println("---------------------");
		
		//Component로 분석하여 가져오기 - 여러개의 패키지 분석 
		TestBean5 java500=ctx2.getBean(TestBean5.class);		
		System.out.printf("* java500 : %s\n", java500); 
		
		
		ctx2.close();
		
		
	}

}
