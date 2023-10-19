package workWithFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CitanjeTexta {

	public static void main(String[] args) {
		
		//File datei = new File("C:\\zDubravko\\Ostalo\\edv\\biljeske\\JavaFunctionalProgammierung.txt");
		//ako se fajl nalazi u folderu projekta ne treba putanja
		File datei = new File("JavaFunctionalProgammierung.txt");
		
		//provjera da li fajl postoji - vraca boolean
		//System.out.println(datei1.isFile());
		
		Scanner scan = null;
		//mora se ubaciti u try-catch block
		try {
			scan = new Scanner(datei);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			//e.printStackTrace();
		}
		//cita jedan red texta
		//System.out.println(scan.nextLine());
		
		//cita kompletan text
		while (scan.hasNext()) {
			System.out.println(scan.nextLine());
		}	
	}

}
