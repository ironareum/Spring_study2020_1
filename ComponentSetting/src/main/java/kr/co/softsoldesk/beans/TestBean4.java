package kr.co.softsoldesk.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") //개별주소 생성 
/*상황에 따라 싱글톤으로도 쓰고 개별로 쓰고싶으면, 
프로토타입 지정방법말고 TestBean3 처럼 BeanConfig에서 개별 메소드 만들어서 골라서 사용하는방법이 좋음. */
public class TestBean4 {
	
	public TestBean4() {
		System.out.println("TestBean4의 생성자 ");
	}
}
