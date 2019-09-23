package it.cybsec.filesystems;

import it.cybsec.interfaces.File;
import it.cybsec.tools.Buffer;

public class FAT32 implements File {
	public Buffer read(String nome) {
		System.out.println("Lettura del file " + nome + " dal file system FAT32");
		return Buffer.randomBuffer(10);
	}
	public void write(String nome, Buffer buffer) {
		System.out.println("Scrittura del file " + nome + " dal file system FAT32");
		for(int i = 0; i < buffer.lunghezza; i++)
			System.out.print(String.format("%02X", buffer.getBuffer()[i]));
		System.out.println();
	}
}
