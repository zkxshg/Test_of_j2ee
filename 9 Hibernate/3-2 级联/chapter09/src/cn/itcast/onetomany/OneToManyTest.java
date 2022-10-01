package cn.itcast.onetomany;

import org.hibernate.Session;
import org.junit.Test;
import cn.itcast.utils.HibernateUtils;

public class OneToManyTest {
	// 1.添加数据
	@Test
	public void test1() {
		// 创建session
		Session session = HibernateUtils.getSession();
		// 开启事务
		session.beginTransaction();
		// 1.创建一个客户
		Customer c = new Customer();
		c.setName("张三");
		// 2.创建两个订单
		Order o1 = new Order();
		o1.setAddress("北京");
		o1.setPrice(10000d);
		Order o2 = new Order();
		o2.setAddress("广州");
		o2.setPrice(5000d);
		// 3.描述关系---订单属于某个客户
		// o1.setCustomer(c);
		// o2.setCustomer(c);
		// 4.描述关系---客户有多个订单
		c.getOrders().add(o1);
		c.getOrders().add(o2);
		// 5. 先存客户再存订单
		session.save(c);
		session.save(o1);
		session.save(o2);
		// 提交事务
		session.getTransaction().commit();
		// 关闭session
		session.close();
	}
	//2.保存客户和订单，客户关联订单,仅保存客户 --抛异常，持久态对象 关联 瞬时态对象
	@Test
	public void test2(){
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		//1 客户
		Customer customer = new Customer();
		customer.setName("李四");	
		//2 订单
		Order order = new Order();
	    order.setAddress("上海");
		order.setPrice(2000d);
		//3 客户关联订单
		customer.getOrders().add(order);
		//4 仅保存客户
		session.save(customer);		//insert
		session.getTransaction().commit();	//update
		session.close();
	}


	// 3.默认情况下，删除客户时，订单的cid为null.
	@Test
	public void test3() {
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		// 1.查询id=2的用户
		Customer c = (Customer) session.get(Customer.class, 2);
		session.delete(c);
		session.getTransaction().commit();
		session.close();
	}
	// 4.级联删除
	@Test
	public void test4() {
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		// 1.查询id=3的用户，删除该用户的同时删除其关联的订单
		Customer c = (Customer) session.get(Customer.class,3);
		session.delete(c);//删除该客户对象
		session.getTransaction().commit();
		session.close();
	}
	//5.孤儿删除，需要解除父子关系
	@Test
	public void test5(){
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		//1.查询客户 
		Customer customer = (Customer) session.get(Customer.class, 4);
		//2.查询订单 
		Order order = (Order) session.get(Order.class,5);
		//3.解除关系
		customer.getOrders().remove(order);
		session.getTransaction().commit(); 
		session.close();
	}



}