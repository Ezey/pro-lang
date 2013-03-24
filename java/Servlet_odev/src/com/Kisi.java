package com;

public class Kisi {

	private int TcNo;
	private String Ad;
	private String Soyad;
	private int Dtarihi;
	
	public int getTcNo() {
		return TcNo;
	}
	public void setTcNo(int tcNo) {
		TcNo = tcNo;
	}
	public String getAd() {
		return Ad;
	}
	public void setAd(String ad) {
		Ad = ad;
	}
	public String getSoyad() {
		return Soyad;
	}
	public void setSoyad(String soyad) {
		Soyad = soyad;
	}
	public int getDtarihi() {
		return Dtarihi;
	}
	public void setDtarihi(int dtarihi) {
		Dtarihi = dtarihi;
	}
	
	public Kisi() {
		
	}
	
	public Kisi(int tcNo, String ad, String soyad, int dtarihi) {
		TcNo = tcNo;
		Ad = ad;
		Soyad = soyad;
		Dtarihi = dtarihi;
	}
	public String Uyur() {
		return "Uyuyorum";
	}
	public String Gezer() {
		return "Geziyorum.";
	}
}
