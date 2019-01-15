package hfe;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class StartAspect {

    @Around("execution(* hfe.Start.run(..))")
    public Object myadvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Additional Concern Before calling actual method");
        Object obj=pjp.proceed();
        System.out.println("Additional Concern After calling actual method");
        return obj;
    }

    @Before("execution(* Start+.*(..))")
    public void advice() {
        System.out.println("Before");
    }
}
