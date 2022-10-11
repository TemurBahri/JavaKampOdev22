package Odev3.logging;

public class DbLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Database logged = " + data);
		
	}

}
