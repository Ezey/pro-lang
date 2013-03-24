package com;


public class Ogrenci extends Kisi {
	
	private int OgrNo;
	private int Sinif;
	private String Bolum;
	private String Memleket;
	
	public int getOgrNo() {
		return OgrNo;
	}
	public void setOgrNo(int ogrNo) {
		OgrNo = ogrNo;
	}
	public int getSinif() {
		return Sinif;
	}
	public void setSinif(int sinif) {
		Sinif = sinif;
	}
	public String getBolum() {
		return Bolum;
	}
	public void setBolum(String bolum) {
		Bolum = bolum;
	}
	public String getMemleket() {
		return Memleket;
	}
	public void setMemleket(String memleket) {
		Memleket = memleket;
	}
	
	public Ogrenci() {
		
	}
	public Ogrenci(int tcNo, String ad, String soyad, int dtarihi, int ogrNo,
			int sinif, String bolum, String memleket) {
		super(tcNo, ad, soyad, dtarihi);
		OgrNo = ogrNo;
		Sinif = sinif;
		Bolum = bolum;
		Memleket = memleket;
	}
	
	public String DerseGir() {
		return "Zaten dersteyim adamim.";
	}
	
	public String KantineGit() {
		return "Kantine gidiyorum sizde gelsenize.";
	}
	
}
