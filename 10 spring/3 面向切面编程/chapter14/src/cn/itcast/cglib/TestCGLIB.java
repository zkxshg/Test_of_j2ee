package cn.itcast.cglib;
import org.junit.Test;
import cn.itcast.dao.BookDao;
public class TestCGLIB {
	@Test
	public void demo01() {
		// 1 从工厂获得指定的内容 (相当于spring获得，但此内容，是代理对象)
		BookDao bookDao = MyBeanFactory.getBean();
		// 2 执行方法
		bookDao.save();
		bookDao.update();
		bookDao.delete();
		bookDao.find();
	}
}
