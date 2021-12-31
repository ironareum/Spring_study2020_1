package kr.co.softsoldesk.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.co.softsoldesk.beans.JdbcBean;

//쿼리문 


@Component
public class JdbcDAO {
	
	//오라클에 전달 
	@Autowired 
	private JdbcTemplate db; //연결완료 
	
	@Autowired //MapperClass mapper=new MapperClass 한것과 동일 
	private MapperClass mapper;
	
	//insert
	public void insert_data(JdbcBean bean) {
		String sql="insert into jdbc_table(int_data, str_data) values(?,?)";
		db.update(sql, bean.getInt_data(), bean.getStr_data()); // sql문, ? 표 맵핑 
	}
	
	//select
	public List<JdbcBean> select_data(){
		String sql ="select int_data, str_data from jdbc_table";
		List<JdbcBean> list= db.query(sql, mapper);
		return list;
	}
	
	//update
	public void update_data(JdbcBean bean) {
		String sql = "update jdbc_table set str_data=? where int_data=?";
		db.update(sql, bean.getStr_data(), bean.getInt_data());
	}
	
	//delete
	public void delete_data(int int_data) {
		String sql = "delete from jdbc_table where int_data=?";
		db.update(sql, int_data);
	}
	
}
