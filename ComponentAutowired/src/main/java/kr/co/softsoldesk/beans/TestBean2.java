package kr.co.softsoldesk.beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestBean2 {
	private int data1;
	private String data2;
	private DataBean4 data3;
	private DataBean5 data4;
					//매개변수 줄때 @Value 어노테이션으로 값도 함께 넣어주기 
	public TestBean2(@Value("100") int data1, @Value("Hello") String data2, DataBean4 data3, DataBean5 data4) { //TestBean2와 매개변수 모두 컴포넌트로 올려뒀기때문에 +패키지스캔 해둬서 메인에서 그냥 불러올수있음 
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
		this.data4 = data4;
	}
	
	
	public int getData1() {
		return data1;
	}
	public String getData2() {
		return data2;
	}
	public DataBean4 getData3() {
		return data3;
	}
	public DataBean5 getData4() {
		return data4;
	}
	
	
	
}
