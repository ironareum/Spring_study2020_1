package kr.co.softsoldesk.beans;

import org.springframework.stereotype.Component;

@Component
public class TestBean1 {
	
	public void method1() {
		System.out.println("* TestBean1의 method1 호출");
		
		int a=10/0; //afterThrowing 발생시키기 위해 만든 오류
	}
}
