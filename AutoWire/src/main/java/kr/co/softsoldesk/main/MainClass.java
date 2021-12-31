package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans.TestBean3;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx =new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/bean.xml");
		TestBean1 obj1=ctx.getBean("obj1", TestBean1.class);
		System.out.printf("obj1.data1 : %s\n", obj1.getData1());
		System.out.printf("obj1.data2 : %s\n", obj1.getData2());

		System.out.println("========= byName을 이용한 객체 주입 ");
		TestBean1 obj2=ctx.getBean("obj2", TestBean1.class);
		System.out.printf("obj2.data1 : %s\n", obj2.getData1());
		System.out.printf("obj2.data2 : %s\n", obj2.getData2());

		System.out.println("========= byType을 이용한 객체 주입");
		TestBean2 obj3=ctx.getBean("obj3", TestBean2.class);
		System.out.printf("obj3.data1 : %s\n", obj3.getData1());
		System.out.printf("obj3.data2 : %s\n", obj3.getData2());

		System.out.println("========= 생성자를 이용한 객체 주입");
		TestBean3 obj4=ctx.getBean("obj4", TestBean3.class);
		System.out.printf("obj4.data1 : %s\n", obj4.getData1());
		System.out.printf("obj4.data2 : %s\n", obj4.getData2());
		System.out.printf("obj4.data2 : %s\n", obj4.getData3());
		System.out.printf("obj4.data2 : %s\n", obj4.getData4());
		
		System.out.println("========= 생성자를 이용한 객체 자동 주입");
		TestBean3 obj5=ctx.getBean("obj5", TestBean3.class);
		System.out.printf("obj5.data1 : %s\n", obj5.getData1());
		System.out.printf("obj5.data2 : %s\n", obj5.getData2());
		System.out.printf("obj5.data2 : %s\n", obj5.getData3());
		System.out.printf("obj5.data2 : %s\n", obj5.getData4());
		
		System.out.println("========= 생성자를 이용한 객체 자동 주입 (자료형+객체)");
		TestBean3 obj6=ctx.getBean("obj6", TestBean3.class);
		System.out.printf("obj6.data1 : %s\n", obj6.getData1());
		System.out.printf("obj6.data2 : %s\n", obj6.getData2());
		System.out.printf("obj6.data2 : %s\n", obj6.getData3());
		System.out.printf("obj6.data2 : %s\n", obj6.getData4());

		System.out.println("========= default-autowire=\"byName\" ");
		TestBean1 obj8=ctx.getBean("obj8", TestBean1.class);
		System.out.printf("obj8.data1 : %s\n", obj8.getData1());
		System.out.printf("obj8.data2 : %s\n", obj8.getData2());
		
		System.out.println("========= default-autowire=\"byName\" 참조하지 않음  ");
		TestBean1 obj9=ctx.getBean("obj9", TestBean1.class);
		System.out.printf("obj9.data1 : %s\n", obj9.getData1());
		System.out.printf("obj9.data2 : %s\n", obj9.getData2());
		
		ctx.close();
	}

}
