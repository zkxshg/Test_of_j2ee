package cn.itcast.aspectj.annotation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import cn.itcast.dao.UserDao;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:cn/itcast/aspectj/annotation/applicationContext.xml")
public class TestAnnotation {
	@Autowired
	private UserDao userDao;

	@Test
	public void demo01() {
		// 2 执行方法
		userDao.save();
	}
}
