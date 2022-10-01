package cn.itcast.dao;

import org.springframework.stereotype.Repository;

//target 目标类
@Repository()
public class UserDaoImpl implements UserDao {
	public void save() {
		//int i = 10/0;
		System.out.println("save 添加用户");
	}
	public void update() {
		System.out.println("update 修改用户");
	}
	public void delete() {
		System.out.println("delete 删除用户");
	}
	public void find() {
		System.out.println("find 查询用户");
	}
}
