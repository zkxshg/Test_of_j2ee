package cn.itcast.jdbc;
import java.util.List;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
public class JdbcTemplateTest {
	/**
	 * 使用execute方法建表
	 */
	@Test
	public void createTableTest(){
		//定义配置文件路径
		String xmlPath = "cn/itcast/jdbc/JdbcTemplateBeans.xml";
		//加载配置文件
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        //获取jdbcTemplate实例
		JdbcTemplate jdTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
		//使用execute方法执行SQL语句，创建数据表
		jdTemplate.execute("create table t_user(" +
							"userid int primary key auto_increment," +
							"username varchar(50)," +
							"password varchar(32))");
	}
	/**
	 * 添加用户
	 */
	@Test
	public void addUserTest(){
		//定义配置文件路径
		String xmlPath = "cn/itcast/jdbc/JdbcTemplateBeans.xml";
		//创建Spring容器，加载配置文件
		ApplicationContext applicationContext = 
			                  new ClassPathXmlApplicationContext(xmlPath);
		//获取userDao实例
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		User user = new User();
		//向user对象添加属性值
		user.setUsername("jack");
		user.setPassword("1234");
		//调用addUser方法，获取返回结果
		int flag = userDao.addUser(user);
		if(flag == 1){			
			System.out.println("添加用户成功");
		}else{
			System.out.println("添加用户失败");
		}
	}
	/**
	 * 更新用户数据
	 */
	@Test
	public void updateUserTest(){
		String xmlPath = "cn/itcast/jdbc/JdbcTemplateBeans.xml";
		ApplicationContext applicationContext = 
			                  new ClassPathXmlApplicationContext(xmlPath);
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
//		User user = userDao.findUserById(1);
		User user = new User();
		user.setUserid(1);
		user.setUsername("tom");
		user.setPassword("1111");
		//调用userDao中的updateUser()方法执行更新
		int flag = userDao.updateUser(user);
		if(flag == 1){			
			System.out.println("修改用户成功");
		}else{
			System.out.println("修改用户失败");
		}
	}
	/**
	 * 删除用户
	 */
	@Test
	public void deleteUserTest(){
		String xmlPath = "cn/itcast/jdbc/JdbcTemplateBeans.xml";
		ApplicationContext applicationContext = 
			                  new ClassPathXmlApplicationContext(xmlPath);
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		//调用userDao中的deleteUserById()方法执行删除操作
		int flag = userDao.deleteUserById(1);
		if(flag == 1){			
			System.out.println("删除用户成功");
		}else{
			System.out.println("删除用户失败");
		}
	}
	/**
	 * 根据id查找用户
	 */
	@Test
	public void findUserByIdTest(){
		//定义配置文件路径
		String xmlPath = "cn/itcast/jdbc/JdbcTemplateBeans.xml";
		//创建Spring容器，加载配置文件
		ApplicationContext applicationContext = 
			                  new ClassPathXmlApplicationContext(xmlPath);
		//获取userDao实例
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		//调用findUserById方法，获取user对象
        User user = userDao.findUserById(1);
        //输出查询结果
        System.out.println(user);
	}
	/**
	 * 查找所有用户
	 */
	@Test
	public void findAllUserTest(){
		//定义配置文件路径
		String xmlPath = "cn/itcast/jdbc/JdbcTemplateBeans.xml";
		//创建Spring容器，加载配置文件
		ApplicationContext applicationContext = 
			                  new ClassPathXmlApplicationContext(xmlPath);
		//获取userDao实例
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		//调用findAllUser方法，获取user对象集合
        List<User> user =  userDao.findAllUser();
        //循环输出集合中对象
        for(User u : user){
        	System.out.println(u);
        }
	}
}
