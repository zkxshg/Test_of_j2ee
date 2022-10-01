package cn.itcast.jdbc;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
/**
 * UserDao的实现类
 */
public class UserDaoImpl implements UserDao{
	//定义JdbcTemplate属性及其getter和setter方法
	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
    /**
     * 添加用户
     */
	public int addUser(User user) {
		//定义SQL语句
		String sql = "insert into t_user(username,password) values(?,?)";
		//存放SQL语句的参数
		Object[] params =new Object[]{
			user.getUsername(),
			user.getPassword()
		}; 
		//执行SQL，获取返回结果
		int flag = this.jdbcTemplate.update(sql, params);
		return flag;
	}
	/**
	 * 更新用户数据
	 */
	public int updateUser(User user) {
		//定义SQL语句
		String sql = "update t_user set username = ? " +
				                      ",password = ? where userid = ?";
		 //存放SQL语句的参数
		Object[] params =new Object[]{ 
				user.getUsername(),
				user.getPassword(),
				user.getUserid()
			}; 
		//执行SQL，获取返回结果
		int flag = this.jdbcTemplate.update(sql, params);
		return flag;
	}
    /**
     * 删除用户
     */
	public int deleteUserById(int id) {
		//定义SQL语句
		String sql  = "delete from t_user where userid = ?";
		//执行SQL，获取返回结果
		int flag = this.jdbcTemplate.update(sql, id);
		return flag;
	}
    /**
     * 根据id查询用户
     */
	public User findUserById(int id) {
		//定义SQL语句
		String sql = "select * from t_user where userid = ?";
		/*
		 * 提供默认实现类 ParameterizedBeanPropertyRowMapper，使用此类要求数据表的列必须和java对象的属性对应
		 *  ParameterizedBeanPropertyRowMapper将结果集通过java的反射机制映射到java对象中
		 */
		RowMapper<User> rowMapper = ParameterizedBeanPropertyRowMapper
		                                       .newInstance(User.class);
		//使用queryForObject方法查询，返回单行记录
		return this.jdbcTemplate.queryForObject(sql, rowMapper, id);
	}
   /**
    * 查询所有用户
    */
	public List<User> findAllUser() {
		//定义SQL语句
		String sql = "select * from t_user";		
		/*
		 * 提供默认实现类 ParameterizedBeanPropertyRowMapper ， javabean属性和表的字段必须一致
		   ParameterizedBeanPropertyRowMapper将结果集通过java的反射机制映射到java对象中
		 */
		RowMapper<User> rowMapper = ParameterizedBeanPropertyRowMapper
		                                      .newInstance(User.class);
		//使用query方法执行查询，并返回一个集合
		return this.jdbcTemplate.query(sql, rowMapper);
	}
}
