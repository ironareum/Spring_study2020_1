package kr.co.softsoldesk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans2.TestBean4;

@Configuration
//@ComponentSca 스캔할 내용 등록. 아래 빈으로 설정 안해도 패키지내에 컴포넌트로 등록한 객체 알아서 가져옴. 
@ComponentScan(basePackages= {"kr.co.softsoldesk.beans2","kr.co.softsoldesk.beans3"} ) 
public class BeanConfigClass {
	
	
	//Type으로 선언 (추후 컴포넌트로 대체) 
	@Bean
	public TestBean1 java1() {
		return new TestBean1();
	}
	
	//Name으로 선언 (=메소드명 다르게 설정) <=== 요거는 컴포넌트로 설정 못함(=동일타입의 다른객체 생성하는거.) 그래서 계속 요런식으로 써줘야함. 
	@Bean
	public TestBean2 java2() {
		return new TestBean2();
	}
	@Bean
	public TestBean2 java3() {
		return new TestBean2();
	}
	
	//Component 방식에서의 여러개의 이름선언 (기존 빈&메소드명 설정 방식-java100, java200) 
	@Bean
	public TestBean4 java100() {
		return new TestBean4();
	}
	@Bean
	public TestBean4 java200() {
		return new TestBean4();
	}
	
	
	
	
}
