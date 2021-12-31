package kr.co.soldesk.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.co.soldesk.mapper.MapperInterface;

@Configuration
@ComponentScan(basePackages = "kr.co.soldesk.beans")
public class BeanConfigClass {
	
	//오라클 연결정보 
	//dataSource
	@Bean
	public BasicDataSource dataSource() {
		BasicDataSource source = new BasicDataSource();
		source.setDriverClassName("oracle.jdbc.OracleDriver"); //드라이버 이름 
		source.setUrl("jdbc:oracle:thin:@localhost:1521:xe"); //실제 주소를 넣는곳. 지금은 로컬호스트 주소 
		source.setUsername("system");
		source.setPassword("oracle");
		
		return source;
	}
	
	//SqlSessioinFactory: 오라클 연결, jdbc를 처리하는 객체
	//sql문을 받아서 연결(접속) 
	@Bean
	public SqlSessionFactory factory(BasicDataSource source) throws Exception{
		//SqlSessionFactoryBean은 SqlSessionFactory를 만들기 위해 사용함 
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		//접속 성공 
		factoryBean.setDataSource(source);
		SqlSessionFactory factory =factoryBean.getObject();
		
		return factory;
	}
	
	//MapperFactoryBean에 sql 쿼리를 구현함(쿼리문 담음) -> 이름을 test_Mapper로 한다.   
	@Bean					
	public MapperFactoryBean<MapperInterface> test_Mapper(SqlSessionFactory factory) throws Exception{ //autowire 대신 요렇게 써서 담음. 
		//쿼리문들을 담아놓는 빈 
		MapperFactoryBean<MapperInterface> factoryBean = new MapperFactoryBean<MapperInterface>(MapperInterface.class); //MapperInterface를 알아서 읽어서 넣어줌 
		factoryBean.setSqlSessionFactory(factory);
		
		return factoryBean;
	}
}
