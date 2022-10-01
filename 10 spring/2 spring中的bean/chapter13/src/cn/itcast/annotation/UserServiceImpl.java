package cn.itcast.annotation;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("userService")
public class UserServiceImpl implements UserService{
	//@Autowired
	@Resource(name="userDao")
	private UserDao userDao;
	/**
	 *  userDao的set方法
	 */
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void save() {
		//调用userDao中的save方法
		this.userDao.save();
		System.out.println("userservice....save...");
	}
}
