package Odev2;

public class Methods {

	public static void main(String[] args) {
		sayiBulmaca();

	}
	
	public static void sayiBulmaca () {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 5;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
			mesajVer(aranacak + " sayilar listesinde mevcut!");
		} else {
			System.out.println(aranacak + " sayilar listesinde mevcut deðil!");
		}
	}
	
	public static void mesajVer (String mesaj) {
		System.out.println(mesaj);
	}

}
