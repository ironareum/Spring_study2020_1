package kr.co.softsoldesk.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class TestBean2 {
	
	private int data1;
	
	private String data2;
	private DataBean3 data3;
	private DataBean4 data4;
	
	public TestBean2() { System.out.println("TestBean2의 생성자 "); }
	 
	@Autowired //Autowired 해주면 기본생성자 있어도 xml에서 값을 읽어줌. 
	public TestBean2(@Value("100") int data1, @Value("Hello!!") String data2, DataBean3 data3, DataBean4 data4) {
		System.out.println("TestBean2의 생성자 ");
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

	public DataBean3 getData3() {
		return data3;
	}

	public DataBean4 getData4() {
		return data4;
	}

	/*
	 * public void setData1(int data1) { this.data1 = data1; }
	 * 
	 * public void setData2(String data2) { this.data2 = data2; }
	 * 
	 * public void setData3(DataBean3 data3) { this.data3 = data3; }
	 * 
	 * public void setData4(DataBean4 data4) { this.data4 = data4; }
	 */

	
}
