package kr.co.soldesk.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import kr.co.soldesk.beans.JdbcBean;

public interface MapperInterface {
	
	//컬럼의 이름과 빈의 변수이름이 동일하면 생략가능
	@Results({
		@Result(column="int_data", property= "int_data"),
		@Result(column="Str_data", property= "Str_data")
	})
	
	//sql CURD 자동 매핑 기능 어노테이션들 
	@Select("select int_data, str_data from jdbc_table") //sql의 select 하는 기능 
	List<JdbcBean> select_data();
	
	@Insert("insert into jdbc_table(int_data, str_data) values(#{int_data}, #{str_data})")
	void insert_data(JdbcBean bean); //JdbcBean 필드명으로 자동 매핑 
	
	@Update("update jdbc_table set str_data= #{str_data} where int_data= #{int_data}")
	void update_data(JdbcBean bean);
	
	@Delete("delete from jdbc_table where int_data= #{happy}") //입력하는 매개변수명과 달라도 됨. ?의 개념과 동일. 
	void delete_data(int int_data);
	
}
