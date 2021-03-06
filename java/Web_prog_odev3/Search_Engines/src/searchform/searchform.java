package searchform;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;


import SearchSpec.SearchSpec;
import SearchUtilities.SearchUtilities;

/**
 * Servlet implementation class searchform
 */
@WebServlet("/searchform")
public class searchform extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchform() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String title = "Web arama yonlendir";
		String actionURL = "searchengines";
		String docType ="<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
						"Transitional//EN\">\n";
		out.println(docType +
					"<HTML>\n" +
					"<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
					"<BODY BGCOLOR=\"red\">\n" +
					"<CENTER>\n" +
					"<H1>" + title + "</H1>\n" +
					"<FORM ACTION=\"" + actionURL + "\">\n" +
					" Aranacak kelime: \n" +
					" <INPUT TYPE=\"TEXT\" NAME=\"searchString\"><P>\n");
		SearchSpec[] specs = SearchUtilities.getCommonSpecs();
		for(int i=0; i<specs.length; i++) {
			String searchEngineName = specs[i].getName();
			out.println("<INPUT TYPE=\"RADIO\" " +
						"NAME=\"searchEngine\" " +
						"VALUE=\"" + searchEngineName + "\">\n");
			out.println(searchEngineName + "<BR>\n");
		}
		out.println	("<BR> <INPUT TYPE=\"SUBMIT\">\n" +
					"</FORM>\n" +
					"</CENTER></BODY></HTML>");
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
