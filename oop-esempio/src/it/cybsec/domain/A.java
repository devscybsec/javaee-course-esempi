package it.cybsec.domain;

public class A {
	
	int attributoPackage = 0;
	
	public int attributo1;
	
	protected int attributo2;
	public int getAttributo2() {
		return attributo2;
	}
	public void setAttributo2(int attributo2) {
		this.attributo2 = attributo2;
	}
	
	private int attributo3;
	public int getAttributo3() {
		return attributo3;
	}
	public void setAttributo3(int attributo3) {
		this.attributo3 = attributo3;
	}
	
	public A() {};
	public A(int attributo1, 
			 int attributo2, 
			 int attributo3) {
		this.attributo1 = attributo1;
		this.attributo2 = attributo2;
		this.attributo3 = attributo3;
	}
	
	public String func1() {
		return "Sono un oggetto di classe A";
	}
	
	public String funcz1() {
		return "Sono una funzione diversa!";
	}
	
	public String func1(int a) {
		return "" + a;
	}
	
	public int funziona() {
	  return this.attributo2;
	}
		
//	public int func1() {
//	  return attributo1;
//	}
		
}
