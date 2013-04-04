package LongServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import GzipUtilities.GzipUtilities;

/**
 * Servlet implementation class LongServlet
 */
@WebServlet("/LongServlet")
public class LongServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LongServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out;
		if (GzipUtilities.isGzipSupported(request) && !GzipUtilities.isGzipDisabled(request)) {
			out = GzipUtilities.getGzipWriter(response);
			response.setHeader("Content-Encoding", "gzip");
		} 
		else {
			out = response.getWriter();
		}
		String docType =
				"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
				"Transitional//EN\">\n";
				String title = "Uzun Sayfa";
	out.println (docType +
				"<HTML>\n" +
				"<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
				"<BODY BGCOLOR=\"#FDF5E6\">\n" +
				"<H1 ALIGN=\"CENTER\">" + title + "</H1>\n");
		String line = "fasulye,nohut,makarna,mercimek " +
				"ispanak,marul,kabak,patlican.";
		for(int i=0; i<10000; i++) {
				out.println(line);
		}
		out.println("</BODY></HTML>");
		out.close(); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
