package kr.co.soldesk.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.soldesk.beans.JdbcBean;
import kr.co.soldesk.config.BeanConfigClass;
import kr.co.soldesk.mapper.MapperInterface;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		MapperInterface mapper=ctx.getBean("test_Mapper", MapperInterface.class);
		
		//insert 
		JdbcBean bean2 = new JdbcBean();
		bean2.setInt_data(100);
		bean2.setStr_data("Spring 2021");
//		mapper.insert_data(bean2);
		
		//update
		JdbcBean bean3 = new JdbcBean();
		bean3.setInt_data(100);
		bean3.setStr_data("Python 2021");
		mapper.update_data(bean3);
		
		//delete
		mapper.delete_data(1);
		
		//select
		List<JdbcBean> list1 =mapper.select_data();
		for(JdbcBean bean : list1) {
			System.out.printf("int_data : %d\n", bean.getInt_data());
			System.out.printf("str_data : %s\n", bean.getStr_data());
			System.out.println("-------------");
		}
		
		ctx.close();

	}
}
