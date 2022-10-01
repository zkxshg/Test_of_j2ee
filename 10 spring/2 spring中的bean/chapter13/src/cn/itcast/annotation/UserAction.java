package cn.itcast.annotation;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
@Controller("userAction")
public class UserAction {
	//@Autowired
	@Resource(name="userService")
	private UserService userService;
	/**
	 *  userService的set方法
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public void save(){
		//调用userService中的save方法
		this.userService.save();
		System.out.println("userAction...save...");
	}
}
