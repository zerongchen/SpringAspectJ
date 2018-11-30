package com.aspectj.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class vaildateAspecj {

	@Pointcut("execution(* com.aspectj.service.PurchaseImpl.*Order(..))")
	public void pointcut4Order(){
	}
	
	@Pointcut("execution(* com.aspectj.service.PurchaseImpl.*Pay(..))")
	public void pointcut4pay(){
		
	}
	
	@Before("pointcut4Order()")
	public void userLogin(){
		System.out.println("user login verified..");
	}
	
	@Around("pointcut4Order()")
	public void goodsChoice(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("good is chooiced verified..");
		Object obj = pjp.proceed();
		System.out.println("oder verified ");
	}
	
	@AfterThrowing("pointcut4pay()")
	public void payVerified(){
		System.out.println("sorry you pay action is error , pls try again");
	}
	
	@AfterReturning("pointcut4pay()")
	public void sayWelcome(){
		System.out.println("works , welcome again");
	}
	
}
