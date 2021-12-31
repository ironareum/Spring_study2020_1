package kr.co.softsoldesk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.co.softsoldesk.beans.DataBean3;
import kr.co.softsoldesk.beans.DataBean4;
import kr.co.softsoldesk.beans.DataBean5;
import kr.co.softsoldesk.beans.TestBean3;

@Configuration
@ComponentScan(basePackages = "kr.co.softsoldesk.beans") //요 패키지의 컴포넌트 등록되어 있는 객체들 스캔 

public class BeanConfigClass {
	
	//이름으로 부여하여 여러개의 빈등록 (개별주소) 
	@Bean
	public DataBean3 obj4() {
		return new DataBean3();
	}
	@Bean
	public DataBean3 obj5() {
		return new DataBean3();
	}
	
	//매개변수값 기본 말고 새로운값 주고 싶을때 
	@Bean
	public TestBean3 java3() {
		return new TestBean3(200, "7교시", new DataBean4(), new DataBean5());
	}
	
}
