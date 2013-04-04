package browserinsult;

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
 * Servlet implementation class BrowserInsult
 */
@WebServlet("/BrowserInsult")
public class BrowserInsult extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BrowserInsult() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String title, message;
		
		String userAgent = request.getHeader("User-Agent");
		if ((userAgent != null) && (userAgent.indexOf("MSIE") != -1)) {
			title = "Microsoft explorer";
				message = "Hos geldiniz ben ise yaramaz browser...";
		} 
		else if ((userAgent != null) && (userAgent.indexOf("Chrome") != -1) && (userAgent.indexOf("YaBrowser") != -1)) {
			title = "YANDEX";
				message = "Hos geldiniz ben en hizli browser Chrome cakmasi yandex browser.... ";
		}
		else if ((userAgent != null) && (userAgent.indexOf("Chrome") != -1)) {
			title = "CHROME";
				message = "Hos geldiniz ben en hizli browser.... ";
		} 
		
		else if ((userAgent != null) && (userAgent.indexOf("Firefox") != -1) ) {
			title = "Mozilla FireFox";
				message = "Hos geldiniz ben en guvenilir browser.... ";
		} 
		else if ((userAgent != null) && (userAgent.indexOf("Android") != -1) ) {
			title = "ANDROÝD";
				message = "Hos geldiniz .... ";
		} 
		else {
			title = "Bilinmeyen Browser";
				message = "Bilinmeyen bir browser kullanmaktasýnýz....";
		}
		String docType ="<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
						"Transitional//EN\">\n";
		out.println(docType +
							"<HTML>\n" +
							"<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
							"<BODY BGCOLOR=\"#FDF5E6\">\n" +
							"<H1 ALIGN=CENTER>" + title + "</H1>\n" +
							message + "\n" +"</BODY></HTML>");
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
