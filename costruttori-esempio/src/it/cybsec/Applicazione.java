package it.cybsec;

import it.cybsec.ereditarieta.*;

public class Applicazione {

	public static void main(String[] args) {
		Classe1 x1 = new Classe1();
		Classe1 x2 = new Classe1(123);
		Classe2 y1 = new Classe2();
		Classe2 y2 = new Classe2(12,324);
		
		System.out.println("L'oggetto x1: " + x1.toString());
		System.out.println("L'oggetto x2: " + x2.toString());
		System.out.println("L'oggetto y1: " + y1.toString());
		System.out.println("L'oggetto y2: " + y2.toString());
	}

}
