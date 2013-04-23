package tree;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
/**
 * Servlet implementation class ThreeParams
 */
@WebServlet("/ThreeParams")
public class ThreeParams extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThreeParams() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String title = "Bilgiler";
			String docType =
					"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
					"Transitional//UTF-8\">\n";
		out.println(docType +
					"<HTML>\n" +
					"<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
					"<BODY BGCOLOR=\"#FDF5E6\">\n" +
					"<H1 ALIGN=\"CENTER\">" + title + "</H1>\n" +
					"<UL>\n" +
					" <LI><B>Adi</B>: "+ request.getParameter("adi") + "\n" +
					" <LI><B>Soyadi</B>: "+ request.getParameter("soyadi") + "\n" +
					" <LI><B>Bolum</B>: "+ request.getParameter("bolum") + "\n" +
					" <LI><B>tc</B>: "+ request.getParameter("tc") + "\n" +
					" <LI><B>iL</B>: "+ request.getParameter("ÝL") + "\n" +
					" <LI><B>ilCE</B>: "+ request.getParameter("ilCE") + "\n" +
					" <LI><B>Tel</B>: "+ request.getParameter("Tel") + "\n" +
					" <LI><B>Email</B>: "+ request.getParameter("Email") + "\n" +
					
					"</UL>\n" +
				"</BODY></HTML>");
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
