

class Hoca extends Ogrenci{
	private int Sicil_No;
	String Bolum;
	public void Hoca_Tanýmla(int Sicil_No, String Bolum){
		this.setSicil_No(Sicil_No);
		this.Bolum = Bolum;
	}
	
	public static void ders_yap(String string){
		System.out.println("Derse girir");
	}
	
	public static void Sinav_yap(String string){
		System.out.println("Sýnav yapar");
	}

	public int getSicil_No() {
		return Sicil_No;
	}

	public void setSicil_No(int sicil_No) {
		Sicil_No = sicil_No;
	}
	
}
