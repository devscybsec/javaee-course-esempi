package it.cybsec;

public class A {
	
	private int intero;
	public int getIntero() {
		return intero;
	}
	public void setIntero(int intero) {
		this.intero = intero;
	}
	
	private String stringa;
	public String getStringa() {
		return stringa;
	}
	public void setStringa(String stringa) {
		this.stringa = stringa;
	}
	
	public A() {}
	public A(int intero, String stringa) {
		super();
		this.intero = intero;
		this.stringa = stringa;
	}
}
