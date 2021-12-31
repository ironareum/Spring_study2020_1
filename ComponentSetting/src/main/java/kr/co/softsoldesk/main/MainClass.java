package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans.TestBean3;
import kr.co.softsoldesk.beans.TestBean4;
import kr.co.softsoldesk.beans.TestBean5;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		//타입으로 가져오기 
		TestBean1 t1 =ctx.getBean(TestBean1.class);
		System.out.printf("* t1 : %s\n", t1); //싱글톤 
		TestBean1 t2 =ctx.getBean(TestBean1.class);
		System.out.printf("* t1 : %s\n", t2); //싱글톤
		System.out.println("----------------");
		
		//이름으로 가져오기 -동일한 이름 
		TestBean2 t3 =ctx.getBean("t3",TestBean2.class);
		System.out.printf("* t3 : %s\n", t3); //싱글톤
		TestBean2 t4 =ctx.getBean("t3",TestBean2.class);
		System.out.printf("* t4 : %s\n", t4); //싱글톤
		System.out.println("----------------");
		
		//이름으로 가져오기 -다른 이름 //BeanConfigClass에 등록되어 이름으로 가져오기 
		TestBean2 t5 =ctx.getBean("t5",TestBean2.class);
		System.out.printf("* t5 : %s\n", t5); //주소값 다름 (다른 메소드 불러와서)
		TestBean2 t6 =ctx.getBean("t6",TestBean2.class);
		System.out.printf("* t6 : %s\n", t6); //주소값 다름 (다른 메소드 불러와서)
		System.out.println("----------------");
		
		//Lazy사용해서 생성자 가져오기 
		TestBean3 t7 =ctx.getBean(TestBean3.class);
		System.out.printf("* t7 : %s\n", t7);  
		TestBean3 t8 =ctx.getBean(TestBean3.class);
		System.out.printf("* t8 : %s\n", t8);  
		System.out.println("----------------");
		
		//Scope("prototype")으로 가져오기 
		TestBean4 t9 =ctx.getBean(TestBean4.class);
		System.out.printf("* t9 : %s\n", t9); //각각 다른객체 &겟빈 할때 생성자 생성 
		TestBean4 t10 =ctx.getBean(TestBean4.class); 
		System.out.printf("* t10 : %s\n", t10); //각각 다른객체 &겟빈 할때 생성자 생성
		System.out.println("----------------");
		
		// PostConstruct/PreDestroy 어노테이션
		TestBean5 t11 =ctx.getBean(TestBean5.class);
		System.out.printf("* t11 : %s\n", t11); 
		
		
		ctx.close();

	}

}
