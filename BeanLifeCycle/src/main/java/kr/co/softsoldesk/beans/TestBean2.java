package kr.co.softsoldesk.beans;

public class TestBean2 {
	public TestBean2() {
		System.out.println("TestBean2의 생성자.");
	}
	
	public void default_init() {
		System.out.println("TestBean2의 default_init 메소드 ");
	}
	
	public void default_destroy() {
		System.out.println("TestBean2의 default_destroy 메소드");
	}
	
}
