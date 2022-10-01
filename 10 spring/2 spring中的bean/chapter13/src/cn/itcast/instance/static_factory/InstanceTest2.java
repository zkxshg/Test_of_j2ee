package cn.itcast.instance.static_factory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class InstanceTest2 {	
	@Test
	public void demo02(){
		//定义配置文件路径，相当于从类路径(src)
		String xmlPath = "cn/itcast/instance/static_factory/beans2.xml";
		//ApplicationContext在加载配置文件时，对bean进行实例化
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		System.out.println(applicationContext.getBean("bean2"));		
	}
}
