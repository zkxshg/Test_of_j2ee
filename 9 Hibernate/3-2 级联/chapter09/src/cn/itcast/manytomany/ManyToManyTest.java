package cn.itcast.manytomany;

import org.hibernate.Session;
import org.junit.Test;
import cn.itcast.utils.HibernateUtils;

public class ManyToManyTest {
	// 1.存储数据
	@Test
	public void test1() {
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		// 1.创建两个学生
		Student s1 = new Student();
		s1.setSname("张三");
		Student s2 = new Student();
		s2.setSname("李四");
		// 2.创建两上科目
		Course c1 = new Course();
		c1.setCname("JAVA");
		Course c2 = new Course();
		c2.setCname("PHP");
		// 3.建立关联关系
		// 学生关联科目
		s1.getCourses().add(c1);
		s2.getCourses().add(c1);
		s1.getCourses().add(c2);
		s2.getCourses().add(c2);
		// 科目关联学生
		c1.getStudents().add(s1);
		c2.getStudents().add(s1);
		c1.getStudents().add(s2);
		c2.getStudents().add(s2);

		// 4.存储
		session.save(c1);
		session.save(c2);
		session.save(s1);
		session.save(s2);
		// 提交事务，关闭session
		session.getTransaction().commit();
		session.close();
	}

	// 多对多级联保存：学生级联课程，需要在学生Student.hbm.xml添加级联保存
	@Test
	public void test2() {
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		// 1.创建课程
		Course course = new Course();
		course.setCname("PHP");
		// 2.创建学生
		Student student = new Student();
		student.setSname("王五");
		// 3.关联-- 学生关联课程
		student.getCourses().add(course);
		// 4.保存
		session.save(student);
		session.getTransaction().commit();
		session.close();
	}
    //级联删除
	@Test
	public void test3() {
		Session session = HibernateUtils.getSession();
		session.beginTransaction();
		Student student = (Student) session.get(Student.class, 1);
		session.delete(student);
		session.getTransaction().commit();
		session.close();
	}

}
