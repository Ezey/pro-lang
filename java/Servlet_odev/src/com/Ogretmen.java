package com;


public class Ogretmen extends Kisi{

	private int SicilNo;
	private String Bolum;
	
	public int getSicilNo() {
		return SicilNo;
	}
	public void setSicilNo(int sicilNo) {
		SicilNo = sicilNo;
	}
	public String getBolum() {
		return Bolum;
	}
	public void setBolum(String bolum) {
		Bolum = bolum;
	}
	
	public Ogretmen() {
		
	}
	public Ogretmen(int tcNo, String ad, String soyad, int dtarihi,
			int sicilNo, String bolum) {
		super(tcNo, ad, soyad, dtarihi);
		SicilNo = sicilNo;
		Bolum = bolum;
	}
	
	public String DerseGir() {
		return "Dersteyiz Cocuklar.";
	}
	public String SinavYap() {
		return "Cýkarým kagýtlarý yazýlý yoklama var.";
	}
	
}
