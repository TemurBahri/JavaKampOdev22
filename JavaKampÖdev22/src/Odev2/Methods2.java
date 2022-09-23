package Odev2;

public class Methods2 {

	public static void main(String[] args) {
		String mesaj = "Bugun hava çok güzel";
		//mesaj.substring(0,2);
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = sum(5,7);

		System.out.println(sayi);
	}
	
	public static void add() {
		System.out.println("Added");
		
	}
	
	public static void delete() {
		System.out.println("Deleted");
	}
	
	public static void update() {
		System.out.println("Updated");
	}
	
	
	
	public static int sum(int sayi1,int sayi2) {
		return sayi1 + sayi2;
	}
	
	public static String sehirVer() {
		
		return "Bursa" ;
	}
	

}
