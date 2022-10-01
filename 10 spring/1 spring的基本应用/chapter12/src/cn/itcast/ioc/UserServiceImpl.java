package cn.itcast.ioc;
public class UserServiceImpl implements UserService {
	//使用UserDao接口声明一个对象
	private UserDao userDao;
	//添加UserDao对象的set方法，用于依赖注入
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	//实现了UserService中的方法
	public void addUser() {
	this.userDao.save(); //调用UserDao中的save()方法
    System.out.println("spring : hello user Service");
	}
}
