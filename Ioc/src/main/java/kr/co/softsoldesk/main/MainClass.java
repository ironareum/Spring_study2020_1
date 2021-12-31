package kr.co.softsoldesk.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import kr.co.softsoldesk.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		test1(); //로딩시 생성자호출(객체생성) 안됨  
		test2();
		test3(); //로딩시 생성자 호출. 
		test4();
	}
	
	
	//BeanFactory방식 : 패키지 내부(3.xxx ~4.초반 버전에서 사용. 지금은 사용안함)
	public static void test1() {
		//경로로 지정되는 객체 
		ClassPathResource res = new ClassPathResource("kr/co/softsoldesk/config/bean.xml");
		
		//객체 생성해야 로드됨. (=생성자를 호출) 
		XmlBeanFactory factory=new XmlBeanFactory(res); //객체생성. BeanFactory는 지양....
		
		//getBean 이용 
		TestBean t1 =factory.getBean("t1", TestBean.class);
		System.out.printf("t1 : %s\n", t1);
		
		//이미 생성된 객체는 컨테이너에서 보관하고 있으므로 재사용이 가능
		TestBean t2 =factory.getBean("t1", TestBean.class);
		System.out.printf("t2 : %s\n", t2);
		
		System.out.println("==============================");
	}
	
	//bean.xml 파일을 외부에서 참조(패키지 외부)
	public static void test2() {
		FileSystemResource res = new FileSystemResource("bean.xml");
		XmlBeanFactory factory=new XmlBeanFactory(res);
		
		//getBean 이용 
		TestBean t1 =factory.getBean("t1", TestBean.class);
		System.out.printf("t1 : %s\n", t1);
		
		//이미 생성된 객체는 컨테이너에서 보관하고 있으므로 재사용이 가능
		TestBean t2 =factory.getBean("t1", TestBean.class);
		System.out.printf("t2 : %s\n", t2);
		System.out.println("==============================");
	}
	
	//Application Context(패키지 내부)
	public static void test3() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/bean.xml");
//		TestBean t3 =ctx.getBean("t1", TestBean.class);
		
		//getBean 이용 
		TestBean t1 =ctx.getBean("t1", TestBean.class);
		System.out.printf("t1 : %s\n", t1);
		
		//이미 생성된 객체는 컨테이너에서 보관하고 있으므로 재사용이 가능
		TestBean t2 =ctx.getBean("t1", TestBean.class);
		System.out.printf("t2 : %s\n", t2);
		System.out.println("==============================");
		
		ctx.close();
	}
	
	//Application Context(패키지 외부)
	public static void test4() {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("bean.xml");
		
		//getBean 이용 
		TestBean t1 =ctx.getBean("t1", TestBean.class);
		System.out.printf("t1 : %s\n", t1);
		
		//이미 생성된 객체는 컨테이너에서 보관하고 있으므로 재사용이 가능
		TestBean t2 =ctx.getBean("t1", TestBean.class);
		System.out.printf("t2 : %s\n", t2);
		System.out.println("==============================");
		
		ctx.close();
	}
	

}
