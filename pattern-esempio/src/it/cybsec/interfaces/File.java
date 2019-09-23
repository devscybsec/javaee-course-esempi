package it.cybsec.interfaces;

import it.cybsec.tools.*;

public interface File {
	public int X = 0;
	public int Y = 0;
	public Buffer read(String nome);
	public void write(String nome, Buffer buffer);
}
