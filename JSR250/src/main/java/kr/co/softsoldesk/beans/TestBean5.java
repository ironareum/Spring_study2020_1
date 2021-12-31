package kr.co.softsoldesk.beans;

import javax.annotation.Resource;

public class TestBean5 {
	
	//@Resource: 변수의 이름과 동일한 이름의 Bean이 주입된다. (Autowire + Qualifire + byName 합친기능) 
	@Resource
	private DataBean1 data1;

	@Resource
	private DataBean2 data2;

	public DataBean1 getData1() {
		return data1;
	}

	public DataBean2 getData2() {
		return data2;
	}
	
	
	
	
}
