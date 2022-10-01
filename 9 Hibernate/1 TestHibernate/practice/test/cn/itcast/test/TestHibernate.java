package cn.itcast.test;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;
import cn.itcast.domain.Customer;

public class TestHibernate {
	public static void main(String[] args) {
		// 1.加载hibernate.cfg.xml配置
		Configuration config = new Configuration().configure();//默认去类路径的根目录下查找名称为hibernate.cfg.xml的文件
		// 2.获取SessionFactory
		SessionFactory sessionFactory = config.buildSessionFactory();
		// 3.得到一个Session
		Session session = sessionFactory.openSession();
		// 4.开启事务
		Transaction t = session.beginTransaction();
		session.beginTransaction();
		// 5.操作
		// 5.1创建一个对象
		Customer c = new Customer();
		c.setName("王五");
		c.setAge(20);
		c.setCity("上海");
		c.setSex("男");
		// 5.2将数据存储到表中
		session.save(c);
		// 6.提交事务
		 t.commit();
		// 7.关闭资源
		session.close();
		sessionFactory.close();
	}

}