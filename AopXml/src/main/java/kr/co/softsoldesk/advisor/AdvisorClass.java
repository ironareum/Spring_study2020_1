package kr.co.softsoldesk.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

//예를들어 결제시스템이라고 가정할때 Method1이 결제하기 기능이라고 치면.

//모듈~~ 
public class AdvisorClass {
	
	//Advice  
	public void beforeMethod() {
		System.out.println("beforeMethod 호출");
	}
	
	public void afterMethod() { //ex)장바구니로 돌아가기 
		System.out.println("afterMethod 호출");
	}
	
	
	/*//-------around실습-------  //ProceedingJoinPoint: 실행관점. (여기서는 Method1) 
	public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable{ //joint point과 없을때를 대비해서 Throwable.
		
		System.out.println("aroundMethod 호출");
		//메서드(여기서는 Method1 즉 JoinPoint(point1)) 호출하여 실행되는 시점을 명시함 
		//around를 쓰려면 실행시점을 한번 더 명시해줘야함. 
		Object Obj= pjp.proceed();
		return Obj;
	}*/
	
	
	public int aroundMethod(ProceedingJoinPoint pjp) throws Throwable{ 
		System.out.println("aroundMethod 호출");
		//메서드(Method1)을 실행해서 가져온 반환값을 al에 담음. 
		int a1= (Integer)pjp.proceed(); //Method1 
		return a1;
	}
	//---------------------------
	//메서드(aop:method1())가 정상적으로 끝났을때 호출됨 (백업, 결제 전상황으로 돌아가기, 결제완료후 이메일(카카오메세지) 발송 등에 쓰임) 
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod 호출 ");
	}
	
	//---------------------------
	////메서드(aop:method1())에 예외가 발생했을때(비정상적 종료) 호출됨
	public void afterThrowingMethod(Throwable e1) {
		System.out.println("afterThrowingMethod 호출");
		System.out.println(e1);
	}
	
}
