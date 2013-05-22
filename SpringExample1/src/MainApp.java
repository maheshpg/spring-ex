
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      Product product = (Product)context.getBean("aaa");
      System.out.println(product.getProductId());
      System.out.println(product.getProductName());
      System.out.println(product.getProductPrice());
     
   }
}
