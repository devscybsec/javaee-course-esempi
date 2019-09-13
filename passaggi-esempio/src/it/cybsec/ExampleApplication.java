package it.cybsec;

public class ExampleApplication {

	public static void main(String[] args) {
		int intero = 0;
		A oggettoA = new A(200, "duecento");
		
		funzione(intero, oggettoA);
		
		System.out.println("L'intero è: " + intero);
		System.out.println("L'oggetto è: " + oggettoA.getIntero() + " " + oggettoA.getStringa());
	}
	
	static void funzione(int intero, A oggettoA) {
		System.out.println("1 - All'interno della funzione l'intero è: " + intero);
		System.out.println("1 - All'interno della funzione l'oggetto è: " + oggettoA.getIntero() + " " + oggettoA.getStringa());
		
		intero = 100;
		oggettoA.setIntero(intero);
		oggettoA.setStringa("cento");
		
		System.out.println("2 - All'interno della funzione l'intero è: " + intero);
	}

}
