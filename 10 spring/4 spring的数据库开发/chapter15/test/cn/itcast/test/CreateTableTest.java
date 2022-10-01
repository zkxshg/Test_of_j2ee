package cn.itcast.test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
public class CreateTableTest {	
	public static void main(String[] args) {		
		//1 spring 内置数据源
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		// * 基本4项
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring");
		dataSource.setUsername("root");
		dataSource.setPassword("itcast");		
		// 2 jdbc模板开发，必须提供数据源
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.execute("create table t_user(" +
							"userid int primary key auto_increment," +
							"username varchar(50)," +
							"password varchar(32))");
		System.out.println("创建表成功！");
	}
}
