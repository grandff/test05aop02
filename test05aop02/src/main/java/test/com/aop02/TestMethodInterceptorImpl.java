package test.com.aop02;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMethodInterceptorImpl implements MethodInterceptor {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		logger.info("invoke on !!!! ");
		
		// 1. 메소드 실행 전에 메소드명 획득
		String method = invocation.getMethod().getName();			// method 이름 가져옴 
		logger.info("1. call method name is " + method);
		
		// 2. 메소드 실행 전 수행로직 구현
		logger.info("2. {} 메소드 실행[전] 수행 로직 구현", method);
		
		// 3. 해당 메소드 호출
		Object obj = invocation.proceed();
		logger.info("3. called {} return {} ", method, obj);
		
		// 4. 메소드 실행 후 수행 로직 구현
		logger.info("4. {} 메소드 실행 [후] 수행 로직 구현", method);
		
		return obj;
	}

}
