package action;
  
import java.util.ArrayList;
import java.util.List;
 
import bean.Product;
  
public class ProductAction {
    private Product product;
     
    private List<Product> products;
    private List<Integer> selectedProducts;
    public List<Integer> getSelectedProducts() {
        return selectedProducts;
    }
 
    public void setSelectedProducts(List<Integer> selectedProducts) {
        this.selectedProducts = selectedProducts;
    }    
  
    public List<Product> getProducts() {
        return products;
    }
  
    public void setProducts(List<Product> products) {
        this.products = products;
    }
  
    public String show() {
        product = new Product();
        product.setName("iphone7");
        return "show";
    }
  
    public String add() {
        return "show";
    }
  
    public String list() {
  
        products=new ArrayList();
        selectedProducts = new ArrayList();
  
        Product p1 = new Product();
        p1.setId(1);
        p1.setName("product1");
        Product p2 = new Product();
        p2.setId(2);
        p2.setName("product2");
        Product p3 = new Product();
        p3.setId(3);
   
        p3.setName("product3");
  
        products.add(p1);
        products.add(p2);
        products.add(p3);
         
        selectedProducts.add(2);
        selectedProducts.add(3);
  
        return "list";
  
    }
  
    public Product getProduct() {
        return product;
    }
  
    public void setProduct(Product product) {
        this.product = product;
    }
}