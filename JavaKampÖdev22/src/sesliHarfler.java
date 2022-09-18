import java.util.Scanner;

public class sesliHarfler {

	public static void main(String[] args) {
		System.out.print("Lütfen bir harf giriniz : ");
        Scanner scan = new Scanner(System.in);
        char harf = scan.next().charAt(0);
        harf = Character.toUpperCase(harf);

        System.out.println("");

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalýn sesli harf");
                break;
            default:
                System.out.println("Ince sesli harf");
        }

	}

}
