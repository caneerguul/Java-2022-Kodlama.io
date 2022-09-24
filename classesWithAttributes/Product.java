package ödev2;

public class Product {
	
	public Product() {
		System.out.println("Yapıcı blok çalıştı");
	}
	
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String color;
	private String kod;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getKod() {
		return this.name.substring(0,1)+id;
	}	
}