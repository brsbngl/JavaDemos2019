package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product =new Product(1, "Laptop", "Asus Laptop", 3000, 2, "Siyah");   //BURASI CONSTRUCTOR �LE �ALI�AN ALAN.
		
		//product.setName("Laptop");  //BU KULLANIM YER�NE YUKARIDA OLAN CONSTRUCTOR �LE OLAN KULLANIM DAHA UYGUN. FAKAT BU YOLDA KULLANANILAB�L�R.
		//product.setId(1);
		//product.setDescription("Asus Leptop");   
		//product.setPrice(5000);
		//product.setStockAmount(3);
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getKod());
		
		
		

	}

}
