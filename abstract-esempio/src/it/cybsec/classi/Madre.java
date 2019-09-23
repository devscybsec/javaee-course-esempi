package it.cybsec.classi;

public abstract class Madre {
	private int x;
	private int sonoBello;
	
	public int getX() {
		return x;
	};
	
	public int getSonoBello() {
		return sonoBello;
	};
	
	public void setX(int x) {
		this.x = x;
	};
	
	public void setSonoBello(int sonoBello) {
		this.sonoBello = sonoBello;
	};
	
	abstract public void cerca();
}
