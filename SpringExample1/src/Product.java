//import org.springframework.beans.factory.annotation.Autowired;


public class Product {
	
	int productId;
	
	String productName;
	
	int productPrice;
	
	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}
  
	public void setProductName(String productName) {
		this.productName = productName;
	}
 
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
}
