package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TV;
import kr.co.softsoldesk.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * TestBean t1 = new TestBean(); t1.setData1(100);
		 * System.out.printf("t1의 data1 : %d\n", t1.getData1()); // bean에서 <property name="data1" value="100"/> 이거랑 같음 
		 */
		
		ClassPathXmlApplicationContext ctx =new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/bean.xml");
		TestBean t1 =ctx.getBean("t1", TestBean.class);
		System.out.printf("t1.data1 : %d\n",t1.getData1());
		System.out.printf("t1.data2 : %f\n",t1.getData2());
		System.out.printf("t1.data3 : %s\n",t1.isData3());
		System.out.printf("t1.data4 : %s\n",t1.getData4());
		System.out.printf("t1.data5 : %s\n",t1.getData5()); //해쉬값 다름 
		System.out.printf("t1.data6 : %s\n",t1.getData6()); //해쉬값 다름
		
		//==========================
		System.out.println("==========================");
		
		TV tv = ctx.getBean("samsungTV", TV.class);
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();	
		
		ctx.close();
	}
}
