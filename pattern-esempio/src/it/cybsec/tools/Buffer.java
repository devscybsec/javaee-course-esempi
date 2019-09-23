package it.cybsec.tools;

import java.util.Random;

public class Buffer {
	
	public int lunghezza;
	private byte[] buffer;
	
	public byte[] getBuffer() {
		return buffer;
	}
	public void setBuffer(byte[] buffer) {
		this.buffer = buffer;
	}
	
	public Buffer(int lunghezza) {
		buffer = new byte[lunghezza];
		this.lunghezza = lunghezza;
	}
	
	public Buffer(byte[] buffer) {
		this.buffer = buffer;
		this.lunghezza = buffer.length;
	}
	
	public static Buffer randomBuffer(int lunghezza) {
		byte[] buffer = new byte[lunghezza];
		Random rand = new Random();
		rand.nextBytes(buffer);
		return new Buffer(buffer);
	}
	
}
