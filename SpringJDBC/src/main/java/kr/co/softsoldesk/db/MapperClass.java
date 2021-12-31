package kr.co.softsoldesk.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.co.softsoldesk.beans.JdbcBean;

//일반 메소드 (셀렉트문으로 받아온 값 자동으로 쭉 읽어서 가져옴) 

@Component
public class MapperClass implements RowMapper<JdbcBean>{

	@Override
	public JdbcBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		//ResultSet rs : 오라클과 연결해서 select문의 결과를 가져오기 
		JdbcBean bean = new JdbcBean();
		bean.setInt_data(rs.getInt("int_data"));
		bean.setStr_data(rs.getString("str_data"));
		
		return bean;
	}
	
}
