package cn.itcast.dao;

public interface AccountDao {
	// 汇款
	public void out(String outUser, int money);

	// 收款
	public void in(String inUser, int money);
}
