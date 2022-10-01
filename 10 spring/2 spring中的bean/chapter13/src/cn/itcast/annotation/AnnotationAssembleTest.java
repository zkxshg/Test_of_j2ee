package cn.itcast.annotation;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class AnnotationAssembleTest {	
	@Test
	public void annotationTest1(){
		//定义配置文件路径
		String xmlPath = "cn/itcast/annotation/beans6.xml";
		//加载配置文件
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		//获取userDao实例
		UserDaoImpl userdao = (UserDaoImpl) applicationContext.getBean("userDao");
		//输出实例
		System.out.println(userdao);
		//调用userdao中的save()方法
		userdao.save();
	}
	@Test
	public void annotationTest2(){
		//定义配置文件路径
		String xmlPath = "cn/itcast/annotation/beans6.xml";
		//加载配置文件
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		//获取userservice实例
		UserServiceImpl userservice = (UserServiceImpl) applicationContext.getBean("userService");
		//输出实例
		System.out.println(userservice);
		//调用userservice中的save()方法
		userservice.save();
	}
	@Test
	public void annotationTest(){
		//定义配置文件路径
		String xmlPath = "cn/itcast/annotation/beans6.xml";
		//加载配置文件
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		//获取userAction实例
		UserAction userAction = (UserAction) applicationContext.getBean("userAction");
		//输出实例
		System.out.println(userAction);
		//调用userAction中的save()方法
		userAction.save();
	}
}
