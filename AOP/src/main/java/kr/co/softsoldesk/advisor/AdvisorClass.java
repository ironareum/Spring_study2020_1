package kr.co.softsoldesk.advisor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AdvisorClass {
	
	//method1이 호출되기 전에 가로채기 하여 beforeMethod() 실행  
	@Before("execution(* method1())")
	public void beforeMethod() {
		System.out.println("beforeMethod 호출 ");
	}
	//===================================================
	
	@After("execution(* method1())")
	public void afterMethod() {
		System.out.println("afterMethod 호출 ");
	}
	//===================================================
	
	@Around("execution(* method1())")
	public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("aroundMethod 호출1");
		Object result=pjp.proceed(); //method1()의 pointcut을 다시 로딩 
		System.out.println("aroundMethod 호출2");
		return result;
	}
	//===================================================
	
	@AfterReturning("execution(* method1())")
	public void afterReturningMethod() {
		System.out.println("! afterReturningMethod 호출");
	}
	//===================================================
	
	@AfterThrowing("execution(* method1())")
	public void afterThrowingMethod() {
		System.out.println("!! afterThrowingMethod 호출");
		
	}
	
	
}
