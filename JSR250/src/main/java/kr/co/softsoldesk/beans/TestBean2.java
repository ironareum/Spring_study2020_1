package kr.co.softsoldesk.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TestBean2 {
	public TestBean2() {
		System.out.println("TestBean2의 기본생성자 ");
	}
	
	@PostConstruct
	public void init1() {
		System.out.println("TestBean2의 init");
	}
	
	@PreDestroy
	public void destroy1() {
		System.out.println("TestBean2의 destroy");
	}
}
