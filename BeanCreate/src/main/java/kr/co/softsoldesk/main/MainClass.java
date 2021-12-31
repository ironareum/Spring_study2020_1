package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		//경로지정 
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml"); //여기까지는 주소값은 받아오지않음(=객체생성 전) 
		
		//객체생성 (객체의 주소값을 받아오기 전에는 생성자가 호출이 안됨) 
		TestBean test =ctx.getBean("test1", TestBean.class); //id가 test1인 bean 객체의 주소값을 받아옴 
		System.out.printf("t1 : %s\n", test); //test1의 주소값(=해시코드값). 
		
		TestBean test1 =ctx.getBean("test1", TestBean.class); 
		System.out.printf("t1 : %s\n", test1); //해쉬코드값 동일 (=싱글톤)
		
		//얘는 객체생성전까지는 생성자 자동생성 없음 
		TestBean test2 =ctx.getBean("test2", TestBean.class); 
		System.out.printf("t2 : %s\n", test2); 
		
		//싱글톤 없음. scope=prototype 
		TestBean test3 =ctx.getBean("test3", TestBean.class); 
		System.out.printf("t3 : %s\n", test3); //test4와 해쉬값 다름 
		TestBean test4 =ctx.getBean("test3", TestBean.class); 
		System.out.printf("t3_1 : %s\n", test4); //test3와 해쉬값 다름
		
		//객체반환 
		ctx.close();
	}

}
