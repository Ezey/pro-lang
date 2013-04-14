package RegistrationForm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		boolean isMissingValue = false;
		String firstName = request.getParameter("Ad");
		
		if (isMissing(firstName)) {
			firstName = "adi giriniz";
			isMissingValue = true;
		}
		String lastName = request.getParameter("Soyad");
		
		if (isMissing(lastName)) {
			lastName = "Soyadi girdiniz";
			isMissingValue = true;
		}
		String emailAddress = request.getParameter("emailAdres");
		
		if (isMissing(emailAddress)) {
		emailAddress = " email adres girdiniz";
		isMissingValue = true;
		}
		Cookie c1 = new longLivedCookie("Ad", firstName);
		response.addCookie(c1);
		Cookie c2 = new longLivedCookie("Soyad", lastName);
		response.addCookie(c2);
		Cookie c3 = new longLivedCookie("emailAdres",
		emailAddress);
		response.addCookie(c3);
		String formAddress ="RegistrationForm";
		if (isMissingValue) {
			response.sendRedirect(formAddress);
		} 
		else {
			PrintWriter out = response.getWriter();
			String docType ="<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +"Transitional//EN\">\n";
			String title = "Kaydettiginiz icin tesekkurler";
			out.println(docType +"<HTML>\n" +
						"<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
						"<BODY BGCOLOR=\"#FDF5E6\">\n" +
						"<CENTER>\n" +
						"<H1 ALIGN>" + title + "</H1>\n" +
						"<UL>\n" +
						" <LI><B>Ad</B>: " +
						firstName + "\n" +
						" <LI><B>Soyad</B>: " +
						lastName + "\n" +
						" <LI><B>Email Adres</B>: " +
						emailAddress + "\n" +
						"</UL>\n" +
					"</CENTER></BODY></HTML>");
			}
	}
	private boolean isMissing(String param) {
		return((param == null) ||(param.trim().equals("")));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
