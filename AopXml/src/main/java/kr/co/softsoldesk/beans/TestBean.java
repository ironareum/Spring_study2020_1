package kr.co.softsoldesk.beans;

import org.springframework.stereotype.Component;

public class TestBean {
	
	//AOP의 관점이 될 Join Point. 
	/*//매개변수가 없는경우 	
	 * public void method1() {
			System.out.println("* method1 호출 ");
		}
	*/
	
	//Join Point - 매개변수가 있는경우 
	public int method1() {
		System.out.println("* method1 호출 ");
		
		int a1 = 10/0; //Error
		
		return 100;
	}
	
	
}
