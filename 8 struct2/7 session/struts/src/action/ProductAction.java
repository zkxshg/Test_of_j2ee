package action;

import java.util.Map;

import bean.Product;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ProductAction extends ActionSupport {
	private Product product;

	public String show() {
		product = new Product();
		product.setName("iphone7");
		return "show";
	}

	public String add() {
		Map m = ActionContext.getContext().getSession();
		m.put("name", product.getName());
		return "show";
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}