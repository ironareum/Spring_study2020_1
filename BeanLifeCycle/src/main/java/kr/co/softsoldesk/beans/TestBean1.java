package kr.co.softsoldesk.beans;

public class TestBean1 {
	public TestBean1() {
		System.out.println("TestBean1의 생성자.");
	}
	
	//생성자가 호출된 후 자동으로 호출되는 메서드 
	public void bean1_init() {
		System.out.println("TestBean1의 init 메서드"); //예를들어 로그인 인증, 댓글등록시 걸럴내는 메소드 등으로 활용 
	}
	
	public void bean1_destroy() {
		System.out.println("TestBean1의 destroy 메서드");  
	}
	
	
	
}
