package workWithFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PisanjeTexta2 {
	// ova klasa upisuje texst u postojeci fajl
	
	public static void main(String[] args) {
		
		PorukaDialog por = new PorukaDialog();
		
		String ime1 = "Zorka";
		String boja1 = "crni";
		int dob1 = 44;
		String auto1 = "BMW";
		
		Osobe osobe = new Osobe(dob1, ime1, boja1, auto1);
		OtvoriTo otvori = new OtvoriTo();
		
		File datei = new File("tekst2.txt");
		//provjerava da li je fajl napravljen (postoji li)
		System.out.println(datei.isFile());
		
		//FileWriter writer;
		try {
			FileWriter writer = new FileWriter(datei, true); //(imeFajlaZaUpis, ispocetka/nastavak) druga vrijednost nije obavezna default false
			writer.write(" " + osobe.dob + " ");
			writer.write(osobe.ime + " ");
			writer.write(osobe.auto + " ");
			writer.write(osobe.boja + "\n");
			writer.flush();  		//upisuje gornje podatke
			writer.close();
			
		} catch (IOException e) {
			System.out.println("File not found");
		}
		
		por.m1(args);
		otvori.m2("tekst2.txt");
	    
		
	}
	
	

}
