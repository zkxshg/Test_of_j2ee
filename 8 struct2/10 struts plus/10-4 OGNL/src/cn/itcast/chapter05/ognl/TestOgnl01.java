package cn.itcast.chapter05.ognl;
import ognl.Ognl;
import ognl.OgnlException;
public class TestOgnl01 {
	public static void main(String[] args) throws OgnlException {
		//创建user对象
		User user = new User();
		//将user对象的username属性设值为itcast
		user.setUsername("itcast");
		//使用ongl表达式获取user对象的username值
		System.out.println("username="
				+ (String) Ognl.getValue("getUsername()", user));
        //创建Group对象
		Group g=new Group();
		//设置Group对象的name值
		g.setName("gjcpyab");
		//将Group对象添加到user对象中
		user.setGroup(g);		
		//输出Group对象中的name值
		System.out.println("groupName="
		        +(String)Ognl.getValue("getGroup().getName()", user));
//		Branch b = new Branch();
//		b.setBranchId("001");
//		g.setBranch(b);
//		System.out.println("groupName="
//				+(String)Ognl.getValue("getGroup().getBranch().getBranchId()", user));
	}
	
}