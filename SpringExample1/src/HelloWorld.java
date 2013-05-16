import java.util.*;

public class HelloWorld {
   private String message; 
   private Hello hello;
   private List <Integer>list;
   private Map<Integer,String>map;
   
   public Hello getHello() {
	return hello;
}

public void setHello(Hello hello) {
	this.hello = hello;
}


   
   
   public void getMap() {
	   for(Map.Entry<Integer,String> e:map.entrySet())
			System.out.println(e.toString());
  }

  public void setMap(Map<Integer, String> map) {
	this.map = map;
  }

  public void getList() {
	for(Integer i:list)
		System.out.println(i.toString());
  }

  public void setList(List<Integer> list) {
	this.list = list;
  }

   public void setMessage(String message){
      this.message  = message;
   }

   public void getMessage(){
      System.out.println("Your Message : " + message+"from"+ hello.getMsg()+" class");
   }
}