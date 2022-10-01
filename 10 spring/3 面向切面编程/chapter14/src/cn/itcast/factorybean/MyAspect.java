package cn.itcast.factorybean;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
//需要实现接口，确定那个通知，及告诉spring应该执行那个方法
public class MyAspect implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		System.out.println("方法执行之前");
		// 2 执行目标方法
		Object obj = mi.proceed();
		System.out.println("方法执行之后");
		return obj;
	}
}
