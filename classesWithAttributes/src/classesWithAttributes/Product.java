package classesWithAttributes;

public class Product {
	public Product(int id, String name, String description, double price, int stockAmout, String renk) {
		System.out.println("Yapýcý Blok Çalýþtý.");
		this.id = id;
		this.renk = renk;
		this.Name = name;
		this.price = price;
		this.description = description;
		this.stockAmount = stockAmout;
				
	}
	private int id;
	private String Name; // attiribute veya field denir bunlara.
	private String description; // 5 inde de baþlarýnda _ kullandýk.
	private double price;
	private int stockAmount;
	private String renk; // GETÝD NÝN ANLAMI idyi okuyabilir demektir. id = 3 gibi bir deðer veremez ama okuyabilir.				
	private String kod;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return this.Name.substring(0, 1) + id;
	}

}
