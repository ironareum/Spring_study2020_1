package kr.co.softsoldesk.beans;

import org.springframework.stereotype.Component;

//Component : 
//Ioc 컨테이너 객체를 생성할때 자동으로 객체 생성
//Type으로 Bean객체를 가져온다 
//싱글톤 

@Component
public class TestBean1 {
	public TestBean1() {
		System.out.println("TestBean1의 생성자 ");
	}
}
