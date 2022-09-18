import java.util.Locale;

public class strings {

	public static void main(String[] args) {
		
		String mesaj = " Citadel llc ";
        mesaj = mesaj.toUpperCase(Locale.ROOT).trim();
     
       
        String yeniMesaj = mesaj.replace(' ','-');
        System.out.println(yeniMesaj);
        
        System.out.println(mesaj.substring(9,11));
        
        for(String kelime: mesaj.split(" ")) {
            System.out.println(kelime);
		

	}

}
}
