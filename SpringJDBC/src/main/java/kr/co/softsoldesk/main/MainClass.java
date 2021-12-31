package kr.co.softsoldesk.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk.beans.JdbcBean;
import kr.co.softsoldesk.config.BeanConfigClass;
import kr.co.softsoldesk.db.JdbcDAO;

public class MainClass {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		JdbcDAO dao = ctx.getBean(JdbcDAO.class);
		
		//bean에 값 입력
		JdbcBean bean1 = new JdbcBean();
		bean1.setInt_data(1);
		bean1.setStr_data("Java");
//		dao.insert_data(bean1); //오라클에 데이터 입력 
		
		JdbcBean bean2 = new JdbcBean();
		bean2.setInt_data(2);
		bean2.setStr_data("JSP");
//		dao.insert_data(bean2); //오라클에 데이터 입력 
		
		//select
		List<JdbcBean> list = dao.select_data();
		
		for(JdbcBean bean3 : list) {
			System.out.printf("int_data : %d\n", bean3.getInt_data());
			System.out.printf("str_data : %s\n", bean3.getStr_data());
			System.out.println("-----");
		}
		
		//update
		JdbcBean bean3 = new JdbcBean();
		bean3.setInt_data(2);
		bean3.setStr_data("Spring");
		dao.update_data(bean3);
		
		//select	
		List<JdbcBean> list1 = dao.select_data();
		
		for(JdbcBean bean4 : list1) {
			System.out.printf("int_data : %d\n", bean4.getInt_data());
			System.out.printf("str_data : %s\n", bean4.getStr_data());
			System.out.println("-----");
		}
	
		
		//delete
		dao.delete_data(1);

		selectAll();
		
		ctx.close();
	}
	
	public static void selectAll() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		JdbcDAO dao = ctx.getBean(JdbcDAO.class);
		
		List<JdbcBean> list1 = dao.select_data();
		
		for(JdbcBean bean4 : list1) {
			System.out.printf("int_data : %d\n", bean4.getInt_data());
			System.out.printf("str_data : %s\n", bean4.getStr_data());
			System.out.println("-----");
		}
	}
	
}
