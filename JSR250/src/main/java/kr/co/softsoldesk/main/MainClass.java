package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans.TestBean3;
import kr.co.softsoldesk.beans.TestBean4;
import kr.co.softsoldesk.beans.TestBean5;
import kr.co.softsoldesk.beans.TestBean6;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		//일반적인 init과 destroy 호출 
		TestBean1 obj1=ctx.getBean("obj1", TestBean1.class);
		System.out.println("----------");
		
		//@PostConstruct 와 @PreDestroy 호출 
		TestBean2 obj2=ctx.getBean("obj2", TestBean2.class);
		System.out.println("----------");
		
		//@Bean (autowire = Autowire.BY_NAME)
		TestBean3 obj3=ctx.getBean("obj3", TestBean3.class);
		System.out.printf("obj3.data1 : %s\n",obj3.getData1());
		System.out.printf("obj3.data2 : %s\n",obj3.getData2());
		System.out.println("----------");
		
		//@Qualifier
		TestBean4 obj4=ctx.getBean("obj4", TestBean4.class);
		System.out.printf("obj4.data1 : %s\n",obj4.getData1());
		System.out.printf("obj4.data2 : %s\n",obj4.getData2());
		System.out.println("----------");
		
		//@Resource
		TestBean5 obj5=ctx.getBean("obj5", TestBean5.class);
		System.out.printf("obj5.data1 : %s\n",obj5.getData1());
		System.out.printf("obj5.data2 : %s\n",obj5.getData2());
		System.out.println("----------");
		
		//@Resource 변수명 다르게 
		TestBean6 obj6=ctx.getBean("obj6", TestBean6.class);
		System.out.printf("obj6.data1 : %s\n",obj6.getData100());
		System.out.printf("obj6.data2 : %s\n",obj6.getData200());

		ctx.close();

	}

}
