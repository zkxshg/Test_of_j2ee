package action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.StrutsRequestWrapper;

import bean.Product;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ProductAction extends ActionSupport {
	private Product product;

	public String show() {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();

		System.out.println("request:\t" + request);
		System.out.println("response:\t" + response);

		product = new Product();
		product.setName("iphone7");
		return "show";
	}

	public String add() {

		Map m = ActionContext.getContext().getSession();
		m.put("name", product.getName());
		return "show";
	}

	// public void validate(){
	// if ( product.getName().length() == 0 ){
	// addFieldError( "product.name", "name can't be empty" );
	// }
	// }

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}