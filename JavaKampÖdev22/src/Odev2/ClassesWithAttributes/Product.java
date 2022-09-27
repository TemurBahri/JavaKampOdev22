package Odev2.ClassesWithAttributes;

public class Product {
	
	public Product(int id,String name,String desctription,double price,int stockAmount,String renk) {
		System.out.println("Yapýcý blok çalýþtý");
		this.id = id;
		this.renk = renk;
		this.name = name;
		this.price = price;
		this.desctiption = desctription;
		this.stockAmount = stockAmount;
	}

	private int id;
	private String name;
	private String desctiption;
	private double price;
	private int stockAmount;
	private String renk;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesctiption() {
		return desctiption;
	}

	public void setDesctiption(String desctiption) {
		this.desctiption = desctiption;
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

	public String getCode() {
		return renk;
	}

	public void setCode(String code) {
		this.renk = code;
	}

}
