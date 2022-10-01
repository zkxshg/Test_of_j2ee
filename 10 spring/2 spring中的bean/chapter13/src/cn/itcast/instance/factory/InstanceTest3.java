package cn.itcast.instance.factory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class InstanceTest3 {	
	@Test
	public void demo03(){
		//指定配置文件路径
		String xmlPath = "cn/itcast/instance/factory/beans3.xml";
		//ApplicationContext在加载配置文件时，对bean进行实例化
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		System.out.println(applicationContext.getBean("bean3"));		
	}
}
