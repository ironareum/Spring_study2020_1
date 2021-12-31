package kr.co.softsoldesk.beans;

public class TestBean3 {
	public TestBean3() {
		System.out.println("TestBean3의 생성자.");
	}
	
	//bean 디폴트 init/destroy랑 개별 다 있을때  
	public void default_init() {
		System.out.println("TestBean3의 default_init 메소드 ");
	}
	
	public void default_destroy() {
		System.out.println("TestBean3의 default_destroy 메소드");
	}
	
	//생성자가 호출된 후 자동으로 호출되는 메서드 
	public void bean3_init() {
		System.out.println("TestBean3의 init 메서드"); //예를들어 로그인 인증, 댓글등록시 걸럴내는 메소드 등으로 활용 
	}
	
	public void bean3_destroy() {
		System.out.println("TestBean3의 destroy 메서드");  
	}
	
	
}
