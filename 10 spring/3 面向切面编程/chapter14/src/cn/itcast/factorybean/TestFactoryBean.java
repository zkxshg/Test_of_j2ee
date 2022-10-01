package cn.itcast.factorybean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.itcast.dao.UserDao;
public class TestFactoryBean {
	@Test
	public void demo01() {
		String xmlPath = "cn/itcast/factorybean/applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				xmlPath);
		// 1 从spring容器获得内容
		UserDao userDao = (UserDao) applicationContext.getBean("userDaoProxy");
		// 2 执行方法
		userDao.save();
		userDao.update();
		userDao.delete();
		userDao.find();
	}
}
