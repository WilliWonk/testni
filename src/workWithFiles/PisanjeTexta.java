package workWithFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PisanjeTexta {
	
	public static void main(String[] args) {
		
		PorukaDialog mess = new PorukaDialog();
		
		File datei = new File("test.txt");
		//provjerava da li je fajl napravljen (postoji li)
		System.out.println(datei.isFile());
		
		//FileWriter writer;
		try {
			FileWriter writer = new FileWriter(datei, true);
			writer.write("Hallo world \n");
			writer.write("Linija2 \n");
			writer.write("Linija3 \n");
			writer.flush();
			writer.close();
		} catch (IOException e) {
			System.out.println("File not found");
		}
		
		mess.m1(null);
	}
}
