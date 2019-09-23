package it.cybsec.filesystems;

import it.cybsec.interfaces.*;

public class FileSystemFactory {
	
	public FileSystemFactory() {}
	
	public File createFileSystem(String nome) throws Exception {
		File f = null;
		switch(nome) {
			case "FAT32": 
				f = new FAT32();
				break;
			case "NTFS": 
				f = new NTFS();
				break;
			default: 
				throw new Exception(nome + " file system non implementato!");
		}
		return f;
	}
	
	public NTFS createNtfs() {
		return new NTFS();
	}
	
	public FAT32 createFat32() {
		return new FAT32();
	}
}
