package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.DataBean;
import kr.co.softsoldesk.beans.TV;
import kr.co.softsoldesk.beans.TestBean;
import kr.co.softsoldesk.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx =new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/bean.xml");

		//자바코드 사용 
		System.out.println("자바코드");
		TestBean t1 = new TestBean();
		t1.printData();
		
		TestBean obj1=ctx.getBean("obj1", TestBean.class);
		obj1.printData();
		System.out.println("---------------------------");
		
		
		//자바코드 사용 
		System.out.println("자바코드");
		TestBean t2 = new TestBean(100);
		t2.printData();
		
		//args: int 
		TestBean obj2=ctx.getBean("obj2", TestBean.class);
		obj2.printData();
		System.out.println("---------------------------");
		
		//자바코드 사용 
		System.out.println("자바코드");
		TestBean t3 = new TestBean(11.11);
		t3.printData();
		
		//args: double
		TestBean obj3=ctx.getBean("obj3", TestBean.class);
		obj3.printData();
		System.out.println("---------------------------");
		
		//자바코드 사용 
		System.out.println("자바코드");
		TestBean t4 = new TestBean("Hello");
		t4.printData();
		
		//args:	String
		TestBean obj4=ctx.getBean("obj4", TestBean.class);
		obj4.printData();
		System.out.println("---------------------------");
		
		//arg의 우선순위 : String > double(float) > decimal 순으로 됨. (스트링이 오면 나머지도 스트링으로 바껴버림) 
		
		//자바코드 사용 
		TestBean t5 = new TestBean(5, 22.22, "Test");
		t5.printData();
		
		//args 3개 :	int, double, String
		TestBean obj5=ctx.getBean("obj5", TestBean.class);
		obj5.printData();
		System.out.println("---------------------------");

		//자바코드 사용 
//		TestBean t6 = new TestBean("승수짱", 22.55, 200 ); //매개변수 순서 바뀌면 에러남. (스프링에서는 사용가능)  
		t5.printData();
		
		//args 3개 :	int, double, String
		TestBean obj6=ctx.getBean("obj6", TestBean.class);// 얘는 서가 뒤죽박죽 이어도 알아서 찾아감. 
		obj6.printData();
		System.out.println("---------------------------");
		
		//============================
		//TestBean2 
		DataBean d1 = new DataBean();
		DataBean d2 = new DataBean();
		
		TestBean2 t200 = new TestBean2(d1, d2);
		t200.printData(); //d1과 d2의 해쉬값 다름. 
		System.out.println();
		
		TestBean2 obj7=ctx.getBean("obj7", TestBean2.class);
		obj7.printData();
		System.out.println("---------------------------");

		TestBean2 obj8=ctx.getBean("obj8", TestBean2.class);
		obj8.printData();
		
		
		//=====================
		System.out.println("=======");

		TV tv=ctx.getBean("samsungTV", TV.class);
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		
		ctx.close();
	}

}
