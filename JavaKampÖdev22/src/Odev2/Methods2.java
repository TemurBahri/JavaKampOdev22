package Odev2;

public class Methods2 {

	public static void main(String[] args) {
		String mesaj = "Bugun hava çok güzel";
		//mesaj.substring(0,2);
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = sum(5,7);
		int toplam = topla2(2,3,4,5,6);
		System.out.println(toplam);

	
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
	
	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi:sayilar) {
			 toplam+=sayi;
		}
		return toplam;
		
	}
	
	public static String sehirVer() {
		
		return "Bursa" ;
	}
	

}
