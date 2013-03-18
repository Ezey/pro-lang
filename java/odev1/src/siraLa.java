import javax.swing.*;
import java.util.Arrays;
import java.lang.System;

public class siraLa {

	static int[] sayiLar;
	
	public static void main(String[] args) {
	   String a ;
		sayiLar = new int [10];
		for(int i = 0; i < 10; i++){
				 a = (JOptionPane.showInputDialog(null, (i+1) + ". sayýyý giriniz :"));
				 sayiLar[i] = Integer.parseInt(a) ;
				 
		 }
		
		diziGoruntule(sayiLar,"ilk dizi");
		diziGoruntule(kucuk(sayiLar),"küçüken büyüge");
		diziGoruntule(buyuk(sayiLar),"büyükten küçüge");
		diziGoruntuleort(ort(sayiLar));
	
		
		System.exit(0);
	}
	public static int[] kucuk(int [] dizi) { 
		
		Arrays.sort(dizi);
				
		return dizi;
		
		}
	public static int[] buyuk(int [] dizi1) {

		
		int [] sýrali_dizi ;
		sýrali_dizi = new int [10];
				
		Arrays.sort(dizi1);
		for (int j = 0; j < 10 ; j++ ){
			sýrali_dizi[9-j] = dizi1[j] ;
				
		}
		
		return sýrali_dizi;
		
		
	}
	public static double ort(int [] dizi2) {
		int ort = 0;
		double gonder;
		for (int j = 0; j < 10 ; j++ ){
			 ort += dizi2[j];		
		}
		gonder = (double)ort/10;		
		
		return gonder;
		
	}
	
	public static void diziGoruntule(int []dizi, String dizi_adi) {
		String mesaj = dizi_adi+" Içerigi\n\n\n";
		for(int i = 0; i < dizi.length; i++)
		mesaj += "dizinin "+(i+1)+". elemani: "+dizi[i]+"\n";
		JOptionPane.showMessageDialog(null, mesaj);
		}
	
	public static void diziGoruntuleort(double d ) {
		String mesaj = " ortalamasý\n\n\n";
		mesaj += d;
		JOptionPane.showMessageDialog(null, mesaj);
		}
}


