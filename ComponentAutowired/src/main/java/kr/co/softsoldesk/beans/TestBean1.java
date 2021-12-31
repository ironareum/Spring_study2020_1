package kr.co.softsoldesk.beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestBean1 {
	
	@Autowired //자동으로 DataBean1객체를 가져옴. 오토와이어드 안해주면 null값 나옴. 
	private DataBean1 data1; //컴포넌트 선언이 되어있어야함. 
	
	@Autowired
	@Qualifier("obj2") //Qualifier : 이름으로 받을때. 이름의 조건을 충족할때 
	private DataBean2 data2;
	
	//@Resource: Autowired + Qualifier + byName 기능의 JSR250꺼. 
	@Resource(name="obj3") //name에 변수명과 동일하게 지정해서 가져옴 
	private DataBean3 data3;
	
	//여러개의 이름으로 받을수 없음. 개별 빈 등록해서 받아야함. 
	@Resource(name="obj4")
	private DataBean3 data4;
	

	@Resource(name="obj5")
	private DataBean3 data5;
	
	
	//셋은 자동으로 되니까 필요없음 
	public DataBean1 getData1() {
		return data1;
	}

	public DataBean2 getData2() {
		return data2;
	}

	public DataBean3 getData3() {
		return data3;
	}
	
	public DataBean3 getData4() {
		return data4;
	}

	public DataBean3 getData5() {
		return data5;
	}
	
	
}
