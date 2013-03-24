package com;


public class OgretimUyesi extends Ogretmen{

	public String Unvan;

	public String getUnvan() {
		return Unvan;
	}

	public void setUnvan(String unvan) {
		Unvan = unvan;
	}
	
	public OgretimUyesi() {
		
	}

	public OgretimUyesi(int tcNo, String ad, String soyad, int dtarihi,
			int sicilNo, String bolum, String unvan) {
		super(tcNo, ad, soyad, dtarihi, sicilNo, bolum);
		Unvan = unvan;
	}

	
}

