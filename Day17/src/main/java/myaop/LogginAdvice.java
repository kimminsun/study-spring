package myaop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

public class LogginAdvice implements MethodInterceptor{
	
	public Object invoke(MethodInvocation arg0) throws Throwable{
		StopWatch watch=new StopWatch();
		String methodName=arg0.getMethod().getName();
		watch.start();
		System.out.println("Log method"+methodName+"시작됨");
		Object obj=arg0.proceed();
		watch.stop();
		System.out.println("Log method"+methodName+"종료");
		System.out.println("Log method처리시간"+watch.getTotalTimeSeconds());
		return obj;
	}
	
}
