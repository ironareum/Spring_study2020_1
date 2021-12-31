package kr.co.softsoldesk.beans;

import org.springframework.stereotype.Component;

//객체의 주소값을 이름으로 명시하여 가져옴  
@Component("t3") //이름 줘도 같은이름을 호출하면 주소값 같음(=싱글톤)
public class TestBean2 {
	
	public TestBean2() {
		System.out.println("TestBean2의 생성자");
	}
	
/*
 * 하나만 생성해서 사용할 경우 type을 통해서 사용하는 방법이 효율적이다. 
 * 같은 클래스에서 여러개의 다른주소의 Bean을 생성할 경우는 BeanConfigClass에서 (메소드를) 각각 선언해서 사용해야 한다.  
 * 그러므로 Component에서의 이름을 정의하는 방식은 사용빈도율이 낮다.
 */
	
}
