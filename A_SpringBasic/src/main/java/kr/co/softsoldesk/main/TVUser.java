package kr.co.softsoldesk.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.softsoldesk.beans.TV;

public class TVUser {

	public static void main(String[] args) {
		/*//ClassPath는 자바. 
		 * ClassPathXmlApplicationContext ctx = new
		 * ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml"); TV
		 * tv1=(TV)ctx.getBean("tv1"); tv1.powerOn();
		 */
		//GenericXmlApplicationContext :  파일시스템, 그루비, xml등 설정파일을 로드하여 구동 (ClassPathXml보다 좀 더 폭넓게 사용가능함) 
		//AbstractApplicationContext: GenericXmlApplicationContext은 범위가 광범위하므로 (충돌될수 있기때문에), ApplicationContext로 지정하여 객체로 파싱 
		
		//1. 컨테이너 구동 
		AbstractApplicationContext ctx= new GenericXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		//2. 컨테이너로 부터 객체생성하여 사용 
		TV tv1=(TV)ctx.getBean("tv1");
		tv1.powerOn();
		tv1.powerUp();
		
		TV tv2 = (TV)ctx.getBean("tv2");
		tv2.powerOn();
		
		//3. 컨테이너 종료 
		ctx.close(); //객체반납 

	}

}
