package workWithFiles;

public class Osobe {
	
	int dob;
	String ime;
	String auto;
	String boja;
	public Osobe(int dob, String ime, String auto, String boja) {
		super();
		this.dob = dob;
		this.ime = ime;
		this.auto = auto;
		this.boja = boja;
	}
	@Override
	public String toString() {
		return "Osobe [dob=" + dob + ", ime=" + ime + ", boja=" + boja + ",  auto=" + auto + "]";
	}
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getAuto() {
		return auto;
	}
	public void setAuto(String auto) {
		this.auto = auto;
	}
	public String getBoja() {
		return boja;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}
	
	
}
