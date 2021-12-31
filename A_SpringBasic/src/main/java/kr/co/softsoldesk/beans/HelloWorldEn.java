package kr.co.softsoldesk.beans;

public class HelloWorldEn implements HelloWorld{
	
	public HelloWorldEn(){
		System.out.println("HelloWorldEn의 생성자.");
	}
	
	@Override
	public void sayhello() {
		System.out.println("Hello!");
		
	}

}
