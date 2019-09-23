package it.cybsec.domain;

public class C extends B {

	public int getAttributo2_C() {
		return attributo2;
	}
	public void setAttributo2_C(int attributo2) {
		this.attributo2 = attributo2;
	}
	
	public C(int attributo1, 
			 int attributo2, 
			 int attributo3) {
		super(attributo1, attributo2, attributo3);
	}
	
	@Override
	public String func1() {
		return "Sono un oggetto di classe C";
	}
	
	public String func2() {
		// a.attributoPackage = 0;
	  	return "" + this.attributoPackage;
	}
	
}
