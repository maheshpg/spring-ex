import javax.annotation.Resource;

//import org.springframework.beans.factory.annotation.Autowired;

public class ProductCreator {
	
	private Product product; 
	
	

	@Resource(name="product")
	public void setProduct(Product product) {
		this.product = product;
	}

	public Product createProduct() {
	   //if(product==null)
	   //product =  getProduct();
	   return product;
}

}