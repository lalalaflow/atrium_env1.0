package com.sfzen.atrium.aml.util;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MessageAdvice {

	private static final Logger logger = LoggerFactory.getLogger(MessageAdvice.class);
	
	
	@Before("execution(* com.sfzen.atrium..*.*(..))")
	public void startLog(JoinPoint jp){
		logger.info("핵심업무 코드정보 : " + jp.getSignature());
		logger.info("메서드 : "+jp.getSignature().getName());
		logger.info("매개변수: " + Arrays.toString(jp.getArgs()));
	}
	
	@Around("execution(* com.sfzen.atrium..*.*(..))")
	public Object loggingAfter(ProceedingJoinPoint pjp) throws Throwable{
		
		long start = System.currentTimeMillis();
		
		Object result = pjp.proceed();
		
		long end = System.currentTimeMillis();
		
		logger.info(pjp.getSignature().getName() + "메서드 실행시간:"+(end-start));
		logger.info("======================================================");
		
		return result;
	}
	
	
	
}
