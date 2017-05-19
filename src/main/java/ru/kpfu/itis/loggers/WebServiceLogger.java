package ru.kpfu.itis.loggers;

/**
 * Created by Danil on 17/05/17.
 */
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Danil on 14.05.2017.
 */
@Aspect
public class WebServiceLogger {
    @Pointcut("execution(* *(..))")
    public void webService(){}

    @Pointcut("@annotation(ru.kpfu.itis.annotations.MyAnnotation)")
    public void loggableMethod(){}

    @Around("webService()&&loggableMethod()")
    public Object logWebService(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String methodName = proceedingJoinPoint.getSignature().getName();

        Object[] args = proceedingJoinPoint.getArgs();
        for (int i = 0; i < args.length; i++) {
            System.out.println("PARAMETER:"+args[i]);
        }
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("hh:mm:ss");
        System.out.println("TIME: "+formatForDateNow.format(dateNow));
        System.out.println("Method NAME: "+methodName);

        Object result = proceedingJoinPoint.proceed();
        return result;
    }
}