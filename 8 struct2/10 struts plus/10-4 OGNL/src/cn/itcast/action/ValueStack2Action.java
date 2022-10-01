package cn.itcast.action;

import cn.itcast.domain.Product;
import com.opensymphony.xwork2.ActionSupport;

//属性驱动
public class ValueStack2Action extends ActionSupport {
	/**
	 * 定义变量serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	private Product p3;

	public Product getP3() {
		return p3;
	}

	public void setP3(Product p3) {
		this.p3 = p3;
	}

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
}