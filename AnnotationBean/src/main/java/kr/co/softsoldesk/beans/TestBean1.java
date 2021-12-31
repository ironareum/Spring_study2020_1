package kr.co.softsoldesk.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class TestBean1 {
	
	private int data1;
	private DataBean1 data2;
	
	@Autowired //필드에 오토걸어주면 자동셋이 되서 겟메소드만 만들어주면 됨 
	private DataBean1 data3;
	
	//data4 와 data5는 속성명이 다르더라도 타입이 같기 때문에 bean에서 autowired로 찾을때 모호성에 빠져서 에러남. 
	//그래서 Qualifier로 이름을 각각 명시해줘서 찾아가야한다고 함...? 
	
	@Autowired
	@Qualifier("obj4") //같은 타입이 여러개일때 충돌 피하게 이름 따로 지정. 
	private DataBean2 data4;
	
	@Autowired
	@Qualifier("obj5") //같은 타입이 여러개일때 충돌 피하게 이름 따로 지정.
	private DataBean2 data5;
	
	@Autowired(required=false) //required=false :찾으러 갔는데 없으면 or 못찾겠으면 무시하라는것 
	@Qualifier("obj6")
	private DataBean2 data6;


	//--------------------------
	// xml과 annotation에서 끌고갈수 있는 겟,셋 메소드. 얘는 빈에서 속성의 매개값을 따로 입력해줘야됨.  
	public int getData1() {
		return data1;
	}
	
	//얘를 대체할 수 있는 컴포넌트가 있음 
	@Required //version java5.1이상 부터는 사용정지. 아무 반응이 없음..  
	public void setData1(int data1) {
		this.data1 = data1;
	}

	//--------------------------
	public DataBean1 getData2() {
		return data2;
	}
	
	@Autowired //set autowire로 빈에서 따로 안 넣어줘서 자동으로 따라 들어감 
	public void setData2(DataBean1 data2) {
		this.data2 = data2;
	}
	
	//--------------------------
	//속성에서 이미 Autowire해줘서 셋은 필요없고, 겟만 해주면 됨 
	public DataBean1 getData3() {
		return data3;
	}
	
	//--------------------------
	public DataBean2 getData4() {
		return data4;
	}
	
	//--------------------------
	public DataBean2 getData5() {
		return data5;
	}
	
	//--------------------------
	public DataBean2 getData6() {
		return data6;
	}
	
	
	
	
}
