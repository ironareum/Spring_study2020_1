package kr.co.softsoldesk.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.HelloWorld;
import kr.co.softsoldesk.beans.HelloWorldEn;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		//beans.xml의 id값(=hello)으로 끌어옴 
		HelloWorld hello1 = (HelloWorld)ctx.getBean("hello"); //ctx.getBean은 오브젝트 타입으로 들어오므로 캐스팅 해줌 
		callsayHello(hello1);
		
		HelloWorld hello2 = ctx.getBean("hello2", HelloWorld.class); // hello2라는 이름의 HelloWorld.class를 가져온다는 뜻. 
		callsayHello(hello2);

		
		//사용후 닫기(=동적 메모리 사용가능 )
		ctx.close();
	}
	
	public static void callsayHello(HelloWorld hello) {
		hello.sayhello();
	}
	
}
