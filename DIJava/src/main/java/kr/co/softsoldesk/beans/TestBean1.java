package kr.co.softsoldesk.beans;

public class TestBean1 {
	
	//주입 
	private int data1;
	private String data2;
	private DataBean1 data3;
	
	public TestBean1() {
		
	}
	
	public TestBean1(int data1, String data2, DataBean1 data3) {
		System.out.println("TestBean1의 생성자 ");
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
	}

	public int getData1() {
		return data1;
	}



	public void setData1(int data1) {
		this.data1 = data1;
	}



	public String getData2() {
		return data2;
	}



	public void setData2(String data2) {
		this.data2 = data2;
	}



	public DataBean1 getData3() {
		return data3;
	}



	public void setData3(DataBean1 data3) {
		this.data3 = data3;
	}
	
	
}
