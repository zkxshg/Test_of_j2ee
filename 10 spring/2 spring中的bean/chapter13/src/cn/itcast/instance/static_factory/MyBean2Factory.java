package cn.itcast.instance.static_factory;
public class MyBean2Factory {	
	//使用自己的工厂创建bean实例
	public static Bean2 createBean(){
		return new Bean2();
	}
}
