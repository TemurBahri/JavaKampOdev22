package Classes;

public class Main  {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);
		
		int[] sayilar1 = new int[] {1,3,4};
		int[] sayilar2 = new int[] {5,6,4};
		sayilar2[0] = 10;
		System.out.println(sayilar2[0]);
	}

}
