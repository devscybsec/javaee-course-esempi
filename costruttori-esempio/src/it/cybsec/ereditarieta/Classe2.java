package it.cybsec.ereditarieta;

import it.cybsec.ereditarieta.Classe1;

public class Classe2 extends Classe1 {
	private int b;
	
	public Classe2() {
		super();
		System.out.println("Costruttore Classe2 vuoto");
		this.b = 0;
	}
	public Classe2(int a, int b) {
		super(a);
		System.out.println("Costruttore Classe2 int int");
		this.b = b;
	}
	
	public int getB() {
		return this.b;
	}
	public void setB(int b) {
		this.b = b;
	}
	@Override
	public String toString() {
		String buff = super.toString();
		buff += " b=" + b;
		return buff;
	}
}
