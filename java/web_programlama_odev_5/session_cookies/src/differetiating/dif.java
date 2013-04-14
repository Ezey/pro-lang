package differetiating;

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
 * Servlet implementation class dif
 */
@WebServlet("/dif")
public class dif extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dif() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		for(int i=0; i<3; i++) {
			Cookie cookie = new Cookie("Session-Cookie-" + i,"Cookie-Value-S" + i);
			response.addCookie(cookie);
			cookie = new Cookie("Persistent-Cookie-" + i,"Cookie-Value-P" + i);
			cookie.setMaxAge(3600);
			response.addCookie(cookie);
		}
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String docType ="<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +"Transitional//EN\">\n";String title = "cookies calisiyor..";
		out.println(docType +"<HTML>\n" +
					"<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
					"<BODY BGCOLOR=\"#FDF5E6\">\n" +
					"<H1 ALIGN=\"CENTER\">" + title + "</H1>\n" +
					"<TABLE BORDER=1 ALIGN=\"CENTER\">\n" +
					"<TR BGCOLOR=\"#FFAD00\">\n" +
					" <TH>Cookie ismisi\n" +
					" <TH>Cookie degeri");
		Cookie[] cookies = request.getCookies();
		if (cookies == null) {
			out.println("<TR><TH COLSPAN=2>cookie yok");
		}
		else {
			Cookie cookie;
			for(int i=0; i<cookies.length; i++) {
				cookie = cookies[i];
				out.println("<TR>\n" +
							" <TD>" + cookie.getName() + "\n" +
							" <TD>" + cookie.getValue());
			}
		}
		out.println("</TABLE></BODY></HTML>");
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
