package it.cybsec.domain;

public class B extends A {

	public int getAttributo2_B() {
		return attributo2;
	}
	public void setAttributo2_B(int attributo2) {
		this.attributo2 = attributo2;
	}
	
//	public int getAttributo32_B() {
//		return attributo3;
//	}
//	public void setAttributo3_B(int attributo3) {
//		this.attributo3 = attributo3;
//	}
	
	public B() {};
	public B(int attributo1, 
			 int attributo2, 
			 int attributo3) {
		super(attributo1, attributo2, attributo3);
	}
	
	@Override
	public String func1() {
		return "Sono un oggetto di classe B";
	}
	
	public String func2() {
	  	return "" + this.attributoPackage;
	}
	
		 
	   public int funziona() {
	 	  return this.attributo2;
	   }
	
	
	
}
