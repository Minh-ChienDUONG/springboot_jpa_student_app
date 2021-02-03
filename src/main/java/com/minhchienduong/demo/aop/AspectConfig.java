package com.minhchienduong.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class AspectConfig {
    Logger logger = LoggerFactory.getLogger(getClass());

   /* @Before(value="execution(* controller.*.*(..))")
    public void beforeAdvice (JoinPoint joinPoint) {
        logger.info("Inside Before Advice");
    }*/

   /* @Before(value="execution(* com.minhchienduong.demo.controller.*.*(..)) and args(object)")
    public void beforeAdvice (JoinPoint joinPoint, Object object) {
        logger.info("Request = " + object);
    }*/

   /* @Before(value="execution(* com.minhchienduong.demo.controller.*.*(..)) and args(object1, object2)")
    public void beforeAdvice (JoinPoint joinPoint, Object object1, Object objetc2) {
        logger.info("Request = " + object1 + " " + objetc2);
    }*/
/*
   @After(value="execution(* com.minhchienduong.demo.controller.*.*(..)) and args(object)")
   public void afterAdvice (JoinPoint joinPoint, Object object) {
       logger.info("Request = " + object);
   }*/

   /* @AfterReturning(value="execution(* com.minhchienduong.demo.controller.*.*(..)) and args(object)", returning = "returningObject")
    public void afterReturningAdvice (JoinPoint joinPoint, Object object, Object returningObject) {
        logger.info("Response = " + returningObject);
    }*/

    @Around(value="execution(* com.minhchienduong.demo.controller.*.*(..)) and args(object)")
    public void aroundAdvice (ProceedingJoinPoint proceedingJoinPoint, Object object) {
        logger.info("Request = " + object);

        Object returningObject = null;
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        logger.info("Response = " + returningObject);
    }

}
