package com.github.shoothzj.sb.basic.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author hezhangjian
 */
@Slf4j
@Aspect
@Component
public class LogAspect {

    @Around("@annotation(com.github.shoothzj.sb.basic.log.Log)")
    public Object profile(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        log.info("start to proceed join point");
        Object[] args = proceedingJoinPoint.getArgs();
        Object proceed = proceedingJoinPoint.proceed();
        log.info("end to procced join point, cost is {}", System.currentTimeMillis() - start);
        return proceed;
    }

}
