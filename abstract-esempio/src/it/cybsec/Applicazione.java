package it.cybsec;

import it.cybsec.classi.*;

public class Applicazione {

	public static void main(String[] args) {
		Madre m = new Figlio();
		Figlio f = new Figlio();
		
		m.cerca();
		m.getSonoBello();
		m.setSonoBello(0);
//		m.ricerca();
		
		f.cerca();
		f.getSonoBello();
	}

}
