package Odev2.ClassesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new  Product(1,"Notebook","Monster Notebook",5000,10,"Beyaz");
		/*
		product.setName("Monster");
		product.setId(1);
		product.setDesctiption("Monster Notebook");
		product.setPrice(50.00);
		product.setStockAmount(10);
		*/
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getName());
		System.out.println(product.getCode());
		
		

	}
	

}
