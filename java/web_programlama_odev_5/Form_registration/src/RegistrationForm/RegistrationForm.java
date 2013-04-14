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
 * Servlet implementation class RegistrationForm
 */
@WebServlet("/RegistrationForm")
public class RegistrationForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String actionURL ="RegistrationServlet";
		String firstName =CookieUtilities.getCookieValue(request, "Ad", "");
		String lastName =CookieUtilities.getCookieValue(request, "Soyad", "");
		String emailAddress =CookieUtilities.getCookieValue(request, "emailAdres","");
		String docType ="<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +"Transitional//EN\">\n";
		String title = "Kaydedici...";
		out.println	(docType +
					"<HTML>\n" +
					"<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
					"<BODY BGCOLOR=\"#FDF5E6\">\n" +
					"<CENTER>\n" +
					"<H1>" + title + "</H1>\n" +
					"<FORM ACTION=\"" + actionURL + "\">\n" +
					"First Name:\n" +
					" <INPUT TYPE=\"TEXT\" NAME=\"Ad\" " +
					"VALUE=\"" + firstName + "\"><BR>\n" +
					"Last Name:\n" +
					" <INPUT TYPE=\"TEXT\" NAME=\"Soyad\" " +
					"VALUE=\"" + lastName + "\"><BR>\n" +
					"Email Address: \n" +
					" <INPUT TYPE=\"TEXT\" NAME=\"emailAdres\" " +
					"VALUE=\"" + emailAddress + "\"><P>\n" +
					"<INPUT TYPE=\"SUBMIT\" VALUE=\"Register\">\n" +
					"</FORM></CENTER></BODY></HTML>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
