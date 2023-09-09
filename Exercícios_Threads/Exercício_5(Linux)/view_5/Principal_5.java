package view_5;

import controller_5.ConsultaPingLinux;

public class Principal_5 {

	public static void main(String[] args) throws Exception {
		Thread consultaPingGoogle = new ConsultaPingLinux("Google", "www.google.com.br");
		Thread consultaPingUOL = new ConsultaPingLinux("UOL", "www.uol.com.br");
		Thread consultaPingTerra = new ConsultaPingLinux("Terra", "www.terra.com.br");
		
		consultaPingGoogle.start();
		consultaPingGoogle.join();

		consultaPingUOL.start();
		consultaPingUOL.join();

		consultaPingTerra.start();
		consultaPingTerra.join();
	}

}
