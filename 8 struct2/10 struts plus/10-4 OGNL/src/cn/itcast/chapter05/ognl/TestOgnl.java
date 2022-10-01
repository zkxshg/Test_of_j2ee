package cn.itcast.chapter05.ognl;
import java.util.HashMap;
import java.util.Map;
import ognl.Ognl;
import ognl.OgnlException;
public class TestOgnl {
	public static void main(String[] args) throws OgnlException {
		User user = new User();
		Group g = new Group();
		Branch b = new Branch();
		b.setBranchId("BRANCHID");
		g.setBranch(b);
		user.setGroup(g);
		// 用JAVA来导航访问
		System.out.println("java方式-"
				+ user.getGroup().getBranch().getBranchId());
		// 利用OGNL表达式访问
		System.out.println("OGNL方式-"
				+ (String) Ognl.getValue("group.branch.branchId", user));
		//设置user对象的username的属性值为itcast
		user.setUsername("itcast");
		//创建context对象
		Map context = new HashMap();
		//将user对象放入context对象中
		context.put("u", user);
		//输出使用ognl表达式获取context对象中的user对象的username值
		System.out.println("获取Context中数据结果为-"
		   +(String)Ognl.getValue("#u.username", context,user));

	}
	
}