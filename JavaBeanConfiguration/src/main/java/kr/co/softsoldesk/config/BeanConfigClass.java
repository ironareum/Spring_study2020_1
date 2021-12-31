package kr.co.softsoldesk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean3;
import kr.co.softsoldesk.beans.TestBean4;

@Configuration
public class BeanConfigClass {
	
	@Bean
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	//메소드 이름 바꿀수 있음 
	@Bean(name="java600")
//	@Bean
	public TestBean1 java500() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}

	@Bean
	@Lazy
	public TestBean1 java2() {
		TestBean1 t2 = new TestBean1();
		return t2;
	}
	
	@Bean
	@Scope("prototype")
	public TestBean3 java3() {
		TestBean3 t3 = new TestBean3();
		return t3;
	}

	@Bean
	public TestBean4 java4() {
		TestBean4 t4 = new TestBean4();
		return t4;
	}
	
	@Bean
	@Primary
	public TestBean4 java5() {
		TestBean4 t4 = new TestBean4();
		return t4;
	}
	
}
