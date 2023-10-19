package workWithFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CitanjeTexta2 {
	
	Osobe osobe = new Osobe(0, null, null, null);

		public static void main(String[] args) {
			File datei = new File("textTabela.txt");
			//System.out.println(datei.isFile());
			
			Scanner scan = null;
			
			try {
				scan = new Scanner(datei);
			} catch (FileNotFoundException e) {
				System.out.println("File Not Found");
			}
					
			//cita kompletan text
			while (scan.hasNext()) {
				int dob = scan.nextInt();
				String ime = scan.next();
				String auto = scan.next();
				String boja = scan.next();
			}
		}		
		//nije gotovo treba dovrsiti

}
