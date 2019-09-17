package it.cybsec.ereditarieta;

public class Classe1 {
	private int a;
	
	public Classe1() {
		System.out.println("Costruttore Classe1 vuoto");
		this.a = 0;
	}
	
	public Classe1(int a) {
		System.out.println("Costruttore Classe1 int");
		this.a = a;
	}
	
	int getA() {
		return this.a;
	}
	
	void setA(int a) {
		this.a = a;
	}
	
	@Override
	public String toString() {
		String buff = "";
		buff += " a=" + a;
		return buff;
	}
}
