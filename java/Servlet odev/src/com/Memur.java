package com;


public class Memur extends Kisi {

	private int SicilNo;
	private String Birim;
	
	public int getSicilNo() {
		return SicilNo;
	}
	public void setSicilNo(int sicilNo) {
		SicilNo = sicilNo;
	}
	public String getBirim() {
		return Birim;
	}
	public void setBirim(String birim) {
		Birim = birim;
	}
	
	public Memur() {
		
	}
	public Memur(int tcNo, String ad, String soyad, int dtarihi, int sicilNo,
			String birim) {
		super(tcNo, ad, soyad, dtarihi);
		SicilNo = sicilNo;
		Birim = birim;
	}
	
	public String EvrakGetir() {
		return "Evrak getiriliyor...";
	}
	public String EvrakGotur() {
		return "Evrak Goturuluyor...";
	}
	
}
