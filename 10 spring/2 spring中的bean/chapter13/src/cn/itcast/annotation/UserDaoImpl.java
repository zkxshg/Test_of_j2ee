package cn.itcast.annotation;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
//@Component("userDao")
@Repository("userDao")
public class UserDaoImpl implements UserDao{
 public  void save(){
	 System.out.println("userdao...save...");
 }
}
