package kr.co.softsoldesk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"kr.co.softsoldesk.beans", "kr.co.softsoldesk.advisor"})
@EnableAspectJAutoProxy //어노테이션으로 어드바이스 셋팅가능함. 

public class BeanConfigClass {
	
}
