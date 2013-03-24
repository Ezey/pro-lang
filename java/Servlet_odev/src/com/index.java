package com;
 
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class index
 */
@WebServlet("/index")
public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public index() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");


		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html><html><head>" +
				"<style>" +
				"body { background: #f1f2f3; }" +
				"div { width: 500px; margin: 20px auto; padding: 10px 30px; border: 1px solid #e1e1e1; background: white;}" +
				"</style>" +
				"</head><body>");

/* Ogrenci sýnýfý */
		Ogrenci ogr = new Ogrenci(10060285, "Emre", "ZEYREK", 1990, 21, 05, "Bil-Muh", "Samsun");
		out.println("<div> Ogrenci");
		out.println("<ul>");
		out.println(
				"<li>Ogrenci No : " + ogr.getOgrNo() + "</li>" +
				"<li>Ad : " + ogr.getAd() + "</li>" +
				"<li>Soyad : " + ogr.getSoyad() + "</li>" +
				"<li>Sýnýf : " + ogr.getSinif() + "</li>" +
				"<li>Bolum: " + ogr.getBolum() + "</li>" +
				"<li>Memleket : " + ogr.getMemleket() + "</li></ul>"
			   );
		out.println(
				ogr.DerseGir() + "</br>" +
				ogr.KantineGit()
			   );
		out.println("</div>");

/* Memur Sýnýfý  */
		Memur mmr = new Memur(123123123, "Murat", "Cimcir", 1987, 271712123, "Ogrenci isleri");
		out.println("<div> Memur");
		out.println("<ul>");
		out.println(
				"<li> TC : " + mmr.getTcNo() + "</li>" +
				"<li> Ad : " + mmr.getAd() + "</li>" +
				"<li> Soyad : " + mmr.getSoyad() + "</li>" +
				"<li> Dogum Tarihi : " + mmr.getDtarihi() + "</li>" +
				"<li> Sicil No : " + mmr.getSicilNo() + "</li>" +
				"<li> Birim : " + mmr.getBirim() + "</li></ul>"
			   );

		out.println(
				mmr.EvrakGetir() + "</br>" +
				mmr.EvrakGotur()
			   );
		out.println("</div>");

/* Ogretmen sýnýfý */
		Ogretmen ort = new Ogretmen(321321321, "Ahmet", "Kural", 1967, 112112123, "Matematik");
		out.println("<div> Ogretmen");
		out.println("<ul>");
		out.println(
				"<li> TC : " + ort.getTcNo() + "</li>" +
				"<li> Ad : " + ort.getAd() + "</li>" +
				"<li> Soyad : " + ort.getSoyad() + "</li>" +
				"<li> Dogum Tarihi : " + ort.getDtarihi() + "</li>" +
				"<li> Sicil No : " + ort.getSicilNo() + "</li>" +
				"<li> Bolum : " + ort.getBolum() + "</li></ul>"
			   );

		out.println(
				ort.SinavYap() + "</br>" +
				ort.DerseGir()
			   );
		out.println("</div>");

/* Ogretim uyesi sýnýfý  */
		OgretimUyesi ogr_uye = new OgretimUyesi(900123123, "Osman", "AKGUN", 1977, 929292, "Makina", "Yrd.Doç.Dr");
		out.println("<div> Ogretim Uyesi");
		out.println("<ul>");
		out.println(
				"<li> TC : " + ogr_uye.getTcNo() + "</li>" +
				"<li> Ad : " + ogr_uye.getAd() + "</li>" +
				"<li> Soyad : " + ogr_uye.getSoyad() + "</li>" +
				"<li> Dogum Tarihi : " + ogr_uye.getDtarihi() + "</li>" +
				"<li> Sicil No : " + ogr_uye.getSicilNo() + "</li>" +
				"<li> Bolum : " + ogr_uye.getBolum() + "</li>" +
				"<li> Unvan : " + ogr_uye.getUnvan() + "</li></ul>"
			   );
		out.println("</div>");
		out.println("</html></body>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
