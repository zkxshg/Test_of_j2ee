package cn.itcast.hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class HelloTest {	
	@Test
	public void Hello(){
		//定义配置文件路径
		String xmlPath = "cn/itcast/hello/beans4.xml";
		//加载配置文件
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		//输出获得实例
		System.out.println(applicationContext.getBean("hello"));
		System.out.println(applicationContext.getBean("hello"));
	}
}
