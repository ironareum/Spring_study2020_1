package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans.TestBean3;
import kr.co.softsoldesk.beans.TestBean4;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/bean.xml");
		
		System.out.println("==========xml방식에서의 주소값 가져오기==========");
		TestBean1 xml1=ctx1.getBean("xml1", TestBean1.class);
		System.out.printf("xml1 : %s\n", xml1); 
		TestBean1 xml11=ctx1.getBean("xml1", TestBean1.class); //싱글톤이므로 주소값 같음 
		System.out.printf("xml11 : %s\n", xml11); 
		System.out.println();
		
		System.out.println("==========getBean에 의해서 주소값 반환(lazy-init)==========");
		TestBean2 xml2=ctx1.getBean("xml2", TestBean2.class);
		System.out.printf("xml2 : %s\n", xml2); 
		TestBean2 xml22=ctx1.getBean("xml2", TestBean2.class);
		System.out.printf("xml22 : %s\n", xml22); 
		System.out.println();
		
		System.out.println("==========scope=\"prototype\"==========");
		TestBean3 xml3=ctx1.getBean("xml3", TestBean3.class);
		System.out.printf("xml3 : %s\n", xml3); 
		TestBean3 xml33=ctx1.getBean("xml3", TestBean3.class);
		System.out.printf("xml33 : %s\n", xml33); 
		System.out.println();
		
		System.out.println("==========클래스 중복 호출시 에러없이 정상적인 주소 반환하기==========");
		TestBean4 xml4=ctx1.getBean(TestBean4.class);
		System.out.printf("xml4 : %s\n", xml4); 
		
		ctx1.close();
		
		System.out.println("===================================");

		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		System.out.println("==========BeanConfigClass에서의 주소값 가져오기==========");
		
		TestBean1 java1=ctx2.getBean("java1", TestBean1.class);
		System.out.printf("java1 : %s\n", java1);
		TestBean1 java11=ctx2.getBean("java1", TestBean1.class);
		System.out.printf("java11 : %s\n", java11);
		System.out.println();
		
		/*
		 * System.out.println("======== 메서드 이름으로 호출하기 ======="); TestBean1
		 * java500=ctx2.getBean("java500", TestBean1.class);
		 * System.out.printf("java500 : %s\n", java500);
		 */
		//위의 java500을 어노테이션 name=java600으로 바꿔줘서 위에거는 못찾고 아래것만 읽힘. 
		System.out.println("==========어노테이션 바꾼이름 호출하기==========");
		TestBean1 java600=ctx2.getBean("java600", TestBean1.class);
		System.out.printf("java600 : %s\n", java600);
		System.out.println();
		
		System.out.println("==========@lazy옵션 호출하기==========");
		TestBean1 java2=ctx2.getBean("java2", TestBean1.class);
		System.out.printf("java2 : %s\n", java2);
		System.out.println("== 싱글톤이므로 같은 주소값 반환 ==");
		TestBean1 java22=ctx2.getBean("java2", TestBean1.class);
		System.out.printf("java22 : %s\n", java22);
		System.out.println();

		System.out.println("==========Scope(\"prototype\")==========");
		TestBean3 java3=ctx2.getBean("java3", TestBean3.class);
		System.out.printf("java2 : %s\n", java2);
		System.out.println("== 서로 다른 주소값을 반환 & 객체생성 ==");
		TestBean3 java33=ctx2.getBean("java3", TestBean3.class);
		System.out.printf("java33 : %s\n", java33);
		System.out.println();

		System.out.println("==========객체 중복시 오류없음(@Primary)==========");
		TestBean4 java4=ctx2.getBean(TestBean4.class);
		System.out.printf("java4 : %s\n", java4);
		
		
		ctx2.close();
	}

}
