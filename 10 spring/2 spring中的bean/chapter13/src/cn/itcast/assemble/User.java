package cn.itcast.assemble;
public class User {
	private String username;
	private Integer password;	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getPassword() {
		return password;
	}
	public void setPassword(Integer password) {
		this.password = password;
	}
	/**
	 * 默认构造
	 */
	public User() {
		super();
	}
	/**
	 * 构造方法注入
	 */
	public User(String username, Integer password) {
		super();
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password
				+   "]";
	}
}
