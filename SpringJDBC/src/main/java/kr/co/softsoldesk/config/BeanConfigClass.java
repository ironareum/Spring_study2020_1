package kr.co.softsoldesk.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

//환경설정 (접속정보) 

@Configuration
@ComponentScan(basePackages = {"kr.co.softsoldesk.beans", "kr.co.softsoldesk.db"})
public class BeanConfigClass {
	
	//DataSource 
	//BasicDataSource: 데이터베이스 드라이버를 설정해주는 클래스 
	@Bean
	public BasicDataSource source() {
		BasicDataSource source = new BasicDataSource();
		
		//드라이버 연결 
		source.setDriverClassName("oracle.jdbc.OracleDriver"); //드라이버 이름 
		source.setUrl("jdbc:oracle:thin:@localhost:1521:xe"); //실제 주소를 넣는곳. 지금은 로컬호스트 주소 
		source.setUsername("system");
		source.setPassword("oracle");
		
		return source;
	}
	
	//데이터베이스에 접속해서 sql 쿼리문을 전달하는 메서드 
	@Bean
	public JdbcTemplate db(BasicDataSource source) {
		JdbcTemplate db = new JdbcTemplate(source);
		
		return db;
	}
	
	
	
	
}
