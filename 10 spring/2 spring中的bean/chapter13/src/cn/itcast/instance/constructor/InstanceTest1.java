package cn.itcast.instance.constructor;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class InstanceTest1 {	
	@Test
	public void demo01(){
		//相当于从 类路径(src)
		String xmlPath = "cn/itcast/instance/constructor/beans1.xml";
		//ApplicationContext在加载配置文件时，对bean进行实例化
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		System.out.println(applicationContext.getBean("bean1"));
	}
}
