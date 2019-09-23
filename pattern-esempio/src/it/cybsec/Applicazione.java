package it.cybsec;

import it.cybsec.interfaces.File;
import it.cybsec.tools.Buffer;
import it.cybsec.filesystems.FileSystemFactory;

public class Applicazione {

	public static void main(String[] args) {
		File file;
		String percorsoFile = "C:\\Utenti\\mabbr\\Documenti\\documento.pdf";
		FileSystemFactory factory = new FileSystemFactory();
		try {
//			Leggo da un file system FAT32
			file = factory.createFileSystem("FAT32");
			Buffer b = file.read(percorsoFile);
//			Modifico il file
//			Salvo il file
			file.write(percorsoFile, b);
			
//			Leggo da un file system NTFS
			file = factory.createFileSystem("NTFS");
			b = file.read(percorsoFile);
//			Modifico il file
//			Salvo il file
			file.write(percorsoFile, b);
			file = factory.createFileSystem("Ext4");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} 

	}

}
