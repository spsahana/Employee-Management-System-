package com.sakha.ems.boot.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmsAspect {
	@Before("execution(* com.sakha.ems.boot.service.EmsService.deleteEmployee(..))")
	public void showDeleteLog() {
		System.out.println("Deleting");
	}

}
