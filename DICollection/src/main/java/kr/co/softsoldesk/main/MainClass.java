package kr.co.softsoldesk.main;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.CollectionBean;
import kr.co.softsoldesk.beans.DataBean;
import kr.co.softsoldesk.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx =new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/bean.xml");
		
		TestBean t1 =ctx.getBean("t1", TestBean.class);
//		System.out.printf("t1.list1 : %s\n", t1.getList1());
		List<String> list1 = t1.getList1();
		
		for(String s : list1) {
			System.out.printf("list1 : %s\n",s);
		}
		System.out.println("=================");
		
		//int 값 
		for(Integer i : t1.getList2()) {
			System.out.printf("list2 : %d\n",i);
		}
		System.out.println("=================");

		//객체 값 
		List<DataBean> list3 = t1.getList3();
		for(DataBean d : list3) {
			System.out.printf("list3 : %s\n",d);
		}
		//=====================
		
		System.out.println("=========== Set<> 중복값 하나로! ===========");
		
		TestBean t2 =ctx.getBean("t2", TestBean.class);
		Set<String> set1=t2.getSet1();
		for(String s: set1) {
			System.out.printf("set1 : %s\n", s);
		}
		System.out.println("=================");
		
		Set<Integer> set2=t2.getSet2();
		for(Integer s: set2) {
			System.out.printf("set2 : %d\n", s);
		}
		System.out.println("=================");

		Set<DataBean> set3=t2.getSet3();
		for(DataBean s: set3) {
			System.out.printf("set3 : %s\n", s);
		}
		System.out.println("=================");
		
		
		//=====================
		System.out.println("=========== Map<> ===========");
		Map<String, Object> map1 = t2.getMap1();
		
		String a1 = (String)map1.get("a1");
		int a2 = (Integer)map1.get("a2");
		DataBean a3 = (DataBean)map1.get("a3");
		DataBean a4 = (DataBean)map1.get("a4");
		List<String> a5 = (List<String>)map1.get("a5");
		
		System.out.printf("t2.map1 : %s\n",a1);
		System.out.printf("t2.map2 : %d\n",a2);
		System.out.printf("t2.map3 : %s\n",a3);
		System.out.printf("t2.map4 : %s\n",a4);
		for(String s: a5) {
			System.out.printf("t2.map5 : %s\n",s);
		}
		
		
		//=====================
		System.out.println("=========== properties ===========");
		Properties prop1 =t2.getProp1();
		
		String p1=prop1.getProperty("p1");
		String p2=prop1.getProperty("p1");
		String p3=prop1.getProperty("p1");
		
		System.out.printf("p1 : %s\n", p1);
		System.out.printf("p2 : %s\n", p2);
		System.out.printf("p3 : %s\n", p3);
		
		//=====================
		System.out.println("=========== CollectionBean addr 응용  ===========");
		
		
		CollectionBean addr =ctx.getBean("addr", CollectionBean.class);
		
		List<String> a=addr.getAddressList();
		for(String s : a) {
			System.out.printf("addr : %s\n", s);
		}
		
		
		ctx.close();
		
	}

}
